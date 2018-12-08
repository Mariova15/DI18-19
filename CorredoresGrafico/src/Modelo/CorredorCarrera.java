/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.Date;

/**
 *
 * @author Mario
 */
public class CorredorCarrera extends Corredor {

    private int dorsal, posicion;
    private String tiempo;

    public CorredorCarrera(String nombre, String dni, String direccion, int telf, Date fechaNacimiento) {
        super(nombre, dni, direccion, telf, fechaNacimiento);
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public String getTiempoCarrera() {
        return tiempo;
    }

    public void setTiempoCarrera(String tiempo) {
        this.tiempo = tiempo;
    }

    public int getPosicion() {
        return posicion;
    }

    public void setPosicion(int posicion) {
        this.posicion = posicion;
    }

    
    
}
