/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.time.Instant;
import java.util.Date;

/**
 *
 * @author alumnop
 */
public class Corredor implements Comparable<Corredor> {

    private String nombre, dni, direccion;
    private Date fechaNacimiento;
    private int telf;
    private boolean estado;

    public Corredor() {
    }

    public Corredor(String nombre, String dni, String direccion, int telf, Date fechaNacimiento) {
        this.nombre = nombre;
        this.dni = dni;
        this.direccion = direccion;
        this.fechaNacimiento = fechaNacimiento;
        this.telf = telf;
        estado = true;
    }

    public Corredor(String dni) {
        this.dni = dni;
    }

    public String getDni() {
        return dni;
    }

    public boolean isEstado() {
        return estado;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public int getTelf() {
        return telf;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setTelf(int telf) {
        this.telf = telf;
    }

    public void baja() {
        estado = false;
    }

    @Override
    public String toString() {
        return "Corredor{" + "nombre=" + nombre + ", dni=" + dni + ", direccion=" + direccion + ", fecha=" + fechaNacimiento + ", telf=" + telf + '}';
    }

    @Override
    public int compareTo(Corredor o) {
        return this.dni.compareTo(o.dni);
    }

}
