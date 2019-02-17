/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Modelo.Carrera;
import Modelo.Corredor;
import Modelo.CorredorCarrera;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import Utils.Fecha;
import java.util.Comparator;

/**
 *
 * @author Mario
 */
public class GestionDeCarreras implements Serializable {

    private List<Carrera> listaCarreras;

    public GestionDeCarreras() {
        listaCarreras = new ArrayList<Carrera>();
    }

    /**
     * Método que da de alta una carrera añadiendola a la lista de corredoras.
     *
     * @param nombre String con el nombre de la correra.
     * @param lugarCarrera String con el lugar de la correra.
     * @param fecha Date con la fecha de la carrera.
     * @param numMaxParticipantes int con el número máximo de participantes de
     * la carrera.
     */
    public void altaCarrera(String nombre, String lugarCarrera, Date fecha, int numMaxParticipantes) {
        Carrera carrera = new Carrera(nombre, lugarCarrera, fecha, numMaxParticipantes);
        listaCarreras.add(carrera);
    }

    public void modificarCarrera(int idCarrera, String nombre, String lugarCarrera, Date fecha, int numMaxParticipantes) {
        Carrera carreraAntigua = listaCarreras.get(idCarrera);
        Carrera carreraModificada = new Carrera(nombre, lugarCarrera, fecha, numMaxParticipantes);
        carreraModificada.setDorsal(carreraAntigua.getDorsal());
        listaCarreras.set(idCarrera, carreraModificada);
    }

    public void borrarCarrera(int carrera) {
        listaCarreras.remove(carrera);
    }

    public void importarCarreras(List lista) {
        listaCarreras.addAll(lista);
    }

    public List<Carrera> getListaCarreras() {
        return listaCarreras;
    }

    public boolean agregarCorredor(int idCarrera, Corredor corredor) {
        CorredorCarrera corredorCarrera = new CorredorCarrera(corredor.getNombre(), corredor.getDni(),
                corredor.getDireccion(), corredor.getTelf(), corredor.getFechaNacimiento());
        corredorCarrera.setDorsal(listaCarreras.get(idCarrera).getDorsal());
        if (listaCarreras.get(idCarrera).buscarDuplicados(corredor)) {
            return false;
        } else {
            listaCarreras.get(idCarrera).getListaCorredores().add(corredorCarrera);
            listaCarreras.get(idCarrera).nuevoDorsal();
            return true;
        }
    }

    public List<Integer> listaDorsales(int idCarrera) {
        List<Integer> dorsales = new ArrayList();
        List<CorredorCarrera> listaCorredores = listaCarreras.get(idCarrera).getListaCorredores();
        for (CorredorCarrera corredorDorsal : listaCorredores) {
            if (corredorDorsal.getTiempoCarrera() == null) {
                dorsales.add(corredorDorsal.getDorsal());
            }

        }
        return dorsales;
    }

    public List<Corredor> corredoresDisponibles(int idCarrera, List<Corredor> corredoresExsitentes) {
        List<Corredor> corredoresDisponibles = new ArrayList<>(corredoresExsitentes);
        List<CorredorCarrera> corredorExistentes = listaCarreras.get(idCarrera).getListaCorredores();
        for (Iterator<Corredor> itcorredoresDisponible = corredoresDisponibles.iterator();
                itcorredoresDisponible.hasNext();) {
            Corredor corredoresDisponible = itcorredoresDisponible.next();
            for (Iterator<CorredorCarrera> itcorredorExistente
                    = corredorExistentes.iterator(); itcorredorExistente.hasNext();) {
                CorredorCarrera corredorExistente = itcorredorExistente.next();
                if (corredoresDisponible.getDni().equals(corredorExistente.getDni())) {
                    itcorredoresDisponible.remove();
                }
            }
        }
        return corredoresDisponibles;
    }

    public void ordenarPorDorsal(int idCarrera) {
        Collections.sort(listaCarreras.get(idCarrera).getListaCorredores(), new Comparator<CorredorCarrera>() {
            @Override
            public int compare(CorredorCarrera o1, CorredorCarrera o2) {
                return o1.getDorsal() - o2.getDorsal();
            }
        });
    }

    public void ordenarPorPosicion(int idCarrera) {
        Collections.sort(listaCarreras.get(idCarrera).getListaCorredores(), new Comparator<CorredorCarrera>() {
            @Override
            public int compare(CorredorCarrera o1, CorredorCarrera o2) {
                return o1.getPosicion() - o2.getPosicion();
            }
        });
    }

    public void buscarPorDorsal(int idCarrera, int dorsal, String tiempo, int posicion) {
        List<CorredorCarrera> listaCorredores = listaCarreras.get(idCarrera).getListaCorredores();
        for (CorredorCarrera corredor : listaCorredores) {
            if (corredor.getDorsal() == dorsal) {
                corredor.setTiempoCarrera(tiempo);
                corredor.setPosicion(posicion);
            }
        }
    }

    public String resultadoCarrera(int idCarrera) {
        String resultadoCarrera = null;
        resultadoCarrera = "Nombre de la carrera" + "\t" + listaCarreras.get(idCarrera).getNombre() + "\n"
                + "Fecha de la carrera" + "\t" + Fecha.fechaFormat(listaCarreras.get(idCarrera).getFecha()) + "\n"
                + "Dorsal" + "\t" + "Tiempo" + "\t" + "\t" + "Nombre" + "\n";
        for (int i = 0; i < listaCarreras.get(idCarrera).getListaCorredores().size(); i++) {
            resultadoCarrera += listaCarreras.get(idCarrera).getListaCorredores().get(i).getDorsal() + "\t"
                    + listaCarreras.get(idCarrera).getListaCorredores().get(i).getTiempoCarrera() + "\t"
                    + listaCarreras.get(idCarrera).getListaCorredores().get(i).getNombre() + "\n";
        }

        return resultadoCarrera;
    }

    public List<Carrera> carrerasSinFinalizar() {        
        List<Carrera> listaCarrerasSinfinalizar = new ArrayList<Carrera>();        
        
        for (Iterator<Carrera> iterator = listaCarreras.iterator(); iterator.hasNext();) {
            Carrera next = iterator.next();
            if (! next.isFinalizada()) {
                listaCarrerasSinfinalizar.add(next);
            }
        }
        return listaCarrerasSinfinalizar;
    }
    
    public List<Carrera> carrerasFinalizadas() {        
        List<Carrera> listaCarrerasFinalizadas = new ArrayList<Carrera>();        
        
        for (Iterator<Carrera> iterator = listaCarreras.iterator(); iterator.hasNext();) {
            Carrera next = iterator.next();
            if (next.isFinalizada()) {
                listaCarrerasFinalizadas.add(next);
            }
        }
        return listaCarrerasFinalizadas;
    }
    
    public List<CorredorCarrera> clasificacionCorredores(Carrera carrera){    
        return carrera.getListaCorredores();        
    }

}
