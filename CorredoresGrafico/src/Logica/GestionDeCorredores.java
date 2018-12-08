/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Modelo.Corredor;
import Utils.Fecha;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Date;
import java.util.List;

/**
 *
 * @author alumnop
 */
public class GestionDeCorredores {

    private List<Corredor> corredores;

    public GestionDeCorredores() {
        corredores = new ArrayList<Corredor>();
    }

    public List<Corredor> getCorredores() {
        return corredores;
    }

    /**
     * Método que da de alta un corredor añadiendolo a la lista de corredores.
     *
     * @param nombre String con el nombre del corredor.
     * @param dni String con el DNI del corredor.
     * @param direccion String con la dirección del corredor.
     * @param telf int con el telf del corredor.
     * @param fecha Date con la fecha de nacimiento del corredor.
     */
    public void alta(String nombre, String dni, String direccion, int telf, Date fecha) {
        Corredor corredor = new Corredor(nombre, dni, direccion, telf, fecha);
        corredores.add(corredor);
    }

    /**
     * Método que borrar un corredor de la lista mediante su DNI.
     *
     * @param dni String con el DNI del corredor.
     */
    public void borrarCorredor(String dni) {
        Corredor c1 = new Corredor(dni);
        corredores.remove(c1);
    }

    /**
     * Método que busca un corredor en la lista mediante su DNI.
     *
     * @param dni
     * @return Corredor de la lista que coincide con el DNI.
     */
    public boolean buscarcorredor(String dni) {
        boolean encontrado = false;
        for (Corredor corredore : corredores) {
            if (dni.equals(corredore.getDni())) {
                encontrado = true;
            } else {
                encontrado = false;
            }
        }
        return encontrado;
    }

    /**
     * Método que añade un corredores a la lista.
     *
     * @param lista de corredores que añade los registros a la lista.
     */
    public void importarCorredores(List lista) {
        corredores.addAll(lista);
    }

    /**
     * Método que cambia el nombre de un corredor de la lista.
     *
     * @param pos int con la posición en la lista del corredor.
     * @param nombre String con el nuevo nombre del corredor.
     */
    public void modificarNombre(int pos, String nombre) {
        corredores.get(pos).setNombre(nombre);
    }

    /**
     * Método que cambia el DNI de un corredor de la lista.
     *
     * @param pos int con la posición en la lista del corredor.
     * @param dni String con el nuevo DNI del corredor.
     */
    public void modificarDni(int pos, String dni) {
        corredores.get(pos).setDni(dni);
    }

    /**
     * Método que cambia la dirección de un corredor de la lista.
     *
     * @param pos int con la posición en la lista del corredor.
     * @param direccion String con la nueva dirección del corredor.
     */
    public void modificarDireccion(int pos, String direccion) {
        corredores.get(pos).setDireccion(direccion);
    }

    /**
     * Método que cambia el telf de un corredor de la lista.
     *
     * @param pos int con la posición en la lista del corredor.
     * @param telf int con el nuevo telf del corredor.
     */
    public void modificarTelf(int pos, int telf) {
        corredores.get(pos).setTelf(telf);
    }

    /**
     * Método que cambia la fecha de nacimiento de un corredor de la lista.
     *
     * @param pos int con la posición en la lista del corredor.
     * @param fecha String con la nueva fecha de nacimiento del corredor.
     */
    public void modificarFecha(int pos, String fecha) {
        corredores.get(pos).setFechaNacimiento(Fecha.fechaParse(fecha));
    }

    /**
     *
     * @return String cadenaCsv con todos los datos d elos corredores en formato
     * csv.
     */
    public String cadenaCsv() {
        String cadenaCsv = "";
        for (int i = 0; i < corredores.size(); i++) {
            cadenaCsv += corredores.get(i).getNombre() + ",";
            cadenaCsv += corredores.get(i).getDni() + ",";
            cadenaCsv += corredores.get(i).getDireccion() + ",";
            cadenaCsv += corredores.get(i).getTelf() + ",";
            cadenaCsv += Fecha.fechaFormat(corredores.get(i).getFechaNacimiento()) + "\n";
        }
        return cadenaCsv;
    }

    /**
     * Método que ordena la lista de corredores por su fecha de nacimiento.
     */
    public void ordenarLista() {
        Collections.sort(corredores, new Comparator<Corredor>() {
            @Override
            public int compare(Corredor c1, Corredor c2) {
                return c1.getFechaNacimiento().compareTo(c2.getFechaNacimiento());
            }
        });
    }

}
