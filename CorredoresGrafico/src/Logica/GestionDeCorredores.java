/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Modelo.Corredor;
import java.text.ParseException;
import java.text.SimpleDateFormat;
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

    private Date fechaNacimiento;
    private SimpleDateFormat sdf;
    private Corredor corredor;
    private List<Corredor> corredores;
    private Corredor c1;

    public GestionDeCorredores() {
        sdf = new SimpleDateFormat("dd/MM/yy");
        corredores = new ArrayList<Corredor>();
        //corredores.addAll(corredores); Añadir ista        
    }

    public List<Corredor> getCorredores() {
        return corredores;
    }

    public void alta(String nombre, String dni, String direccion, int telf, Date fecha) {
        //fechaNacimiento = sdf.parse(fecha);
        corredor = new Corredor(nombre, dni, direccion, telf, fecha);
        corredores.add(corredor);
    }

    /*    public void baja(String dni) {
    Corredor c1 = new Corredor(dni);
    corredores.get(Collections.binarySearch(corredores, c1)).baja();
    }*/

    public void borrarCorredor(String dni) {
        Corredor c1 = new Corredor(dni);
        //corredores.remove(Collections.binarySearch(corredores,c1));
        corredores.remove(c1);
    }

    public int buscarcorredor(String dni) {
        c1 = new Corredor(dni);
        //corredores.get(Collections.binarySearch(corredores, c1)).setDni(dni);
        return Collections.binarySearch(corredores, c1);
    }

    public void importarCorredores(List lista) {
        corredores.addAll(lista);
    }

    public void modificarNombre(int pos, String nombre) {
        corredores.get(pos).setNombre(nombre);
    }

    public void modificarDni(int pos, String dni) {
        corredores.get(pos).setDni(dni);
    }

    public void modificarDireccion(int pos, String direccion) {
        corredores.get(pos).setDireccion(direccion);
    }

    public void modificarTelf(int pos, int telf) {
        corredores.get(pos).setTelf(telf);
    }

    public void modificarFecha(int pos, String fecha) throws ParseException {
        fechaNacimiento = sdf.parse(fecha);
        corredores.get(pos).setFechaNacimiento(fechaNacimiento);
    }

    public void registroCorredores() {
        for (int i = 0; i < corredores.size(); i++) {
            System.out.println(corredores.get(i).toString());
        }
    }

    public String cadenaCsv() {
        String cadenaCsv = "";
        //this.ordenarLista();
        for (int i = 0; i < corredores.size(); i++) {
            cadenaCsv = cadenaCsv + corredores.get(i).getNombre() + ",";
            cadenaCsv = cadenaCsv + corredores.get(i).getDni() + ",";
            cadenaCsv = cadenaCsv + corredores.get(i).getDireccion() + ",";
            cadenaCsv = cadenaCsv + corredores.get(i).getTelf() + ",";
            cadenaCsv = cadenaCsv +  sdf.format(corredores.get(i).getFechaNacimiento()) + "\n";
        }
        return cadenaCsv;
    }

    public void ordenarLista() {
        Collections.sort(corredores, new Comparator<Corredor>() {
            @Override
            public int compare(Corredor c1, Corredor c2) {
                return c1.getFechaNacimiento().compareTo(c2.getFechaNacimiento());
            }
        });
    }

}
