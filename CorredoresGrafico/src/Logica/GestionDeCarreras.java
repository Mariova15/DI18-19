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

    public void altaCarrera(String nombre, String lugarCarrera, Date fecha, int numMaxParticipantes) {
        Carrera carrera = new Carrera(nombre, lugarCarrera, fecha, numMaxParticipantes);
        listaCarreras.add(carrera);
    }

    public void agregarCorredores(Corredor corredor) {
        listaCorredores.add(corredor);
    }

    /**
     *
     * @param carrera
     * @param listaCorredores
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
    
    

}
