/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Utils.Fecha;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Mario
 */
public class Carrera implements Serializable {

    private String nombre, lugarCarrera;
    private Date fecha;
    private int numMaxParticipantes, dorsal = 1;
    private List<CorredorCarrera> listaCorredores = new ArrayList<>();

    public Carrera(String nombre, String lugarCarrera, Date fecha, int numMaxParticipantes) {
        this.nombre = nombre;
        this.lugarCarrera = lugarCarrera;
        this.fecha = fecha;
        this.numMaxParticipantes = numMaxParticipantes;
    }

    public String getNombre() {
        return nombre;
    }

    public String getLugarCarrera() {
        return lugarCarrera;
    }

    public Date getFecha() {
        return fecha;
    }

    public String fechaString() {
        return Fecha.fechaFormat(fecha);
    }

    public int getNumMaxParticipantes() {
        return numMaxParticipantes;
    }

    public List<CorredorCarrera> getListaCorredores() {
        return listaCorredores;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void nuevoDorsal() {
        dorsal++;
    }

    public boolean buscarDuplicados(Corredor corredor) {
        for (Corredor listaCorredore : listaCorredores) {
            if (listaCorredore.getDni().equals(corredor.getDni())) {
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Carrera{" + "nombre=" + nombre + ", lugarCarrera=" + lugarCarrera + ", fecha=" + Fecha.fechaFormat(fecha) + ", numMaxParticipantes=" + numMaxParticipantes + '}';
    }

}
