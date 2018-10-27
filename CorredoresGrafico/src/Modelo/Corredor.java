/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.Objects;

/**
 *
 * @author alumnop
 */
public class Corredor implements Comparable<Corredor> {

    private String nombre, dni, direccion;
    private Date fechaNacimiento, actual;
    private int telf, edad;
    private boolean estado;
    private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy");

    public Corredor(String nombre, String dni, String direccion, int telf, Date fechaNacimiento) {
        this.nombre = nombre;
        this.dni = dni;
        this.direccion = direccion;
        this.fechaNacimiento = fechaNacimiento;
        this.telf = telf;
        estado = false;
        actual = new Date();
        edad = actual.getYear() - fechaNacimiento.getYear();
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

    public int getEdad() {
        return edad;
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

    public void Corriendo() {
        estado = true;
    }

    public String FechaString(){    
    return sdf.format(fechaNacimiento);
    }

    @Override
    public String toString() {
        return "Corredor{" + "nombre=" + nombre + ", dni=" + dni + ", direccion=" + direccion + ", fecha=" + sdf.format(fechaNacimiento) + ", telf=" + telf + '}';
    }

    @Override
    public int compareTo(Corredor o) {
        return this.dni.compareTo(o.dni);
    }
       
    /*public int compareToEdad(Corredor o) {
        int resultado;
        if (this.edad < o.edad) {
            resultado = -1;
        } else if (this.edad > o.edad) {
            resultado = 1;
        } else {
            resultado = 0;
        }
        return resultado;
    }*/

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Corredor other = (Corredor) obj;
        if (!Objects.equals(this.dni, other.dni)) {
            return false;
        }
        return true;
    }
}
