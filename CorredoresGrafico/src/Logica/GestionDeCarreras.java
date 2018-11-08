/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Modelo.Carrera;
import Modelo.Corredor;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author Mario
 */
public class GestionDeCarreras {

    private List<Corredor> listaCorredores;
    private List<Carrera> listaCarreras;

    public GestionDeCarreras() {
        listaCarreras = new ArrayList<Carrera>();
        listaCorredores = new ArrayList<Corredor>();
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

    /**
     * Método que agrega un corredor a la lista de corredores.
     *
     * @param corredor Corredor a agregar.
     */
    public void agregarCorredores(Corredor corredor) {
        listaCorredores.add(corredor);
    }

    /**
     * Métedo que borra la lista de corredores.
     */
    public void borrarCorredores() {
        listaCorredores.removeAll(this.getListaCorredores());
    }

    /**
     * Método que genera los dorsales y agregar coreddores a la carrera con el
     * dorsal como valor.
     *
     * @param carrera Carrera a la que agregar los corredores con el dorsal como valor.
     */
    public void agregarDorsalesCorredoresCarrera(Carrera carrera) {
        int[] dorsales = new int[carrera.getNumMaxParticipantes()];
        for (int i = 0; i < carrera.getNumMaxParticipantes(); i++) {
            dorsales[i] = i + 1;
        }
        int dorsal = 0;
        for (Corredor corredor : listaCorredores) {
            carrera.agregarCorredores(dorsales[dorsal], corredor);
            dorsal++;
        }
    }

    public List<Carrera> getListaCarreras() {
        return listaCarreras;
    }

    public List<Corredor> getListaCorredores() {
        return listaCorredores;
    }

}
