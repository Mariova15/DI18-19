/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Mario
 */
public class Carrera {

    private String nombre, lugarCarrera;
    private Date fecha;
    private int numMaxParticipantes;
    private Map<Integer, Corredor> listaCorredores = new HashMap<Integer, Corredor>();
    private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy");

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
        return sdf.format(fecha);
    }

    public int getNumMaxParticipantes() {
        return numMaxParticipantes;
    }

    public void agregarCorredores(int dorsal, Corredor corredor) {
        listaCorredores.put(dorsal, corredor);
    }

    @Override
    public String toString() {
        return "Carrera{" + "nombre=" + nombre + ", lugarCarrera=" + lugarCarrera + ", fecha=" + fecha + ", numMaxParticipantes=" + numMaxParticipantes + '}';
    }

}
