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

    public void borrarCarrera(int carrera) {
        listaCarreras.remove(carrera);
    }

    public void modificarCarrera(int carrera, Carrera carreraModificada) {
        carreraModificada.getListaCorredores().addAll(listaCarreras.get(carrera).getListaCorredores());
        listaCarreras.set(carrera, carreraModificada);
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

}
