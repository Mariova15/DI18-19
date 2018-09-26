/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import java.io.IOException;
import java.text.ParseException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import paqueteLeerDatos.Leer;

/**
 *
 * @author Mario
 */
public class Menu {

    GestionArchivosCSV gAc;
    GestionDeCorredores gDc;
    int select;

    public Menu() throws ParseException {

        gDc = new GestionDeCorredores();
        gAc = new GestionArchivosCSV();

        do {

            System.out.println("Introduce 1 para dar de alta a un corredor");
            System.out.println("Introduce 2 para dar de baja a un corredor");
            System.out.println("Introduce 3 para dar de modificar un corredor");
            System.out.println("Introduce 4 para borrar un corredor");
            System.out.println("Introduce 5 para importar corredores");
            System.out.println("Introduce 6 para exportar corredores");
            System.out.println("Introduce 7 para salir");
            select = Leer.datoInt();

            switch (select) {
                case 1:
                    System.out.println("///Dar de alta///");
                    System.out.println("Introduce nombre del corredor");
                    String nombre = Leer.leerDato();
                    if (nombre.length() > 16 || nombre.length() <= 0) {
                        System.out.println("ERROR al introducir dato");
                        System.out.println("El nombre tiene que ser menor de 16");
                        break;
                    }
                    System.out.println("Introduce dni del corredor");
                    String dni = Leer.leerDato();
                    if (dni.length() != 9) {
                        System.out.println("ERROR al introducir dato");
                        break;
                    }
                    System.out.println("Introduce dirección del corredor");
                    String direccion = Leer.leerDato();
                    if (direccion.length() > 32 || direccion.length() <= 0) {
                        System.out.println("ERROR al introducir dato");
                        break;
                    }
                    System.out.println("Introduce telf del corredor");
                    int telf = Leer.datoInt();
                    String temp = "" + telf;
                    if (temp.length() > 9 || telf < 9) {
                        System.out.println("ERROR al introducir dato");
                        break;
                    }
                    System.out.println("Introduce fecha de nacimiento del corredor en formato dd/mm/yy");
                    System.out.println("Introduce día");
                    int dia = Leer.datoInt();
                    if (dia > 31 || dia <= 0) {
                        System.out.println("ERROR al introducir dato");
                        break;
                    }
                    System.out.println("Introduce mes");
                    int mes = Leer.datoInt();
                    if (mes > 12 || dia <= 0) {
                        System.out.println("ERROR al introducir dato");
                        break;
                    }
                    System.out.println("Introduce año");
                    int año = Leer.datoInt();
                    if (año <= 0) {
                        System.out.println("ERROR al introducir dato");
                        break;
                    }
                    String fecha = dia + "/" + mes + "/" + año;
                    gDc.alta(nombre, dni, direccion, telf, fecha);
                    break;
                case 2:
                    System.out.println("///Dar de baja///");
                    System.out.println("Introduce dni del corredor");
                    dni = Leer.leerDato();
                    gDc.baja(dni);
                    break;
                case 3:
                    System.out.println("///Modificar corredor///");
                    System.out.println("Introduce dni corredor a modificar");
                    dni = Leer.leerDato();
                    int busqueda = gDc.buscarcorredor(dni);
                    System.out.println("Introduce 1 para modificar el nombre del corredor");
                    System.out.println("Introduce 2 para modificar el dni del corredor");
                    System.out.println("Introduce 3 para modificar la dirección del corredor");
                    System.out.println("Introduce 4 para modificar el telf del corredor");
                    System.out.println("Introduce 5 para modificar la fecha de nacimiento del corredor");
                    int selectMod = Leer.datoInt();
                    switch (selectMod) {
                        case 1:
                            System.out.println("Introduce nuevo nombre");
                            nombre = Leer.leerDato();
                            if (nombre.length() > 16 || nombre.length() <= 0) {
                                System.out.println("ERROR al introducir dato");
                                System.out.println("El nombre tiene que ser menor de 16");
                                break;
                            }
                            gDc.modificarNombre(busqueda, nombre);
                            break;
                        case 2:
                            System.out.println("Introduce nuevo dni");
                            dni = Leer.leerDato();
                            if (dni.length() != 9) {
                                System.out.println("ERROR al introducir dato");
                                break;
                            }
                            gDc.modificarDni(busqueda, dni);
                            break;
                        case 3:
                            System.out.println("Introduce nueva dirección");
                            direccion = Leer.leerDato();
                            if (direccion.length() > 32 || direccion.length() <= 0) {
                                System.out.println("ERROR al introducir dato");
                                break;
                            }
                            gDc.modificarDireccion(busqueda, direccion);
                            break;
                        case 4:
                            System.out.println("Introduce nuevo telf");
                            telf = Leer.datoInt();
                            temp = "" + telf;
                            if (temp.length() > 9 || telf < 9) {
                                System.out.println("ERROR al introducir dato");
                                break;
                            }
                            gDc.modificarTelf(busqueda, telf);
                            break;
                        case 5:
                            System.out.println("Introduce fecha de nacimiento del corredor en formato dd/mm/yy");
                            System.out.println("Introduce día");
                            dia = Leer.datoInt();
                            if (dia > 31 || dia <= 0) {
                                System.out.println("ERROR al introducir dato");
                                break;
                            }
                            System.out.println("Introduce mes");
                            mes = Leer.datoInt();
                            if (mes > 12 || dia <= 0) {
                                System.out.println("ERROR al introducir dato");
                                break;
                            }
                            System.out.println("Introduce año");
                            año = Leer.datoInt();
                            if (año <= 0) {
                                System.out.println("ERROR al introducir dato");
                                break;
                            }
                            fecha = dia + "/" + mes + "/" + año;
                            gDc.modificarFecha(busqueda, fecha);
                            break;
                        default:
                            System.out.println("Solo puedes introducir un número del 1 al 5");
                    }
                    break;
                case 4:
                    System.out.println("///Borrar corredor///");
                    System.out.println("Introduce dni del corredor");
                    dni = Leer.leerDato();
                    gDc.borrarCorredor(dni);
                    break;
                case 5:                    
                    gDc.importarCorredores(gAc.leerFichero("corredores.txt"));
                    break;
                case 6:
                    //System.out.println(gDc.cadenaCsv());
                    gAc.abrirFichero("corredores.txt");
                     {
                        try {
                            gAc.escribirCadena(gDc.cadenaCsv());
                        } catch (IOException ex) {
                            Logger.getLogger(Menu.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        gAc.cerrarFicheroEscritura();
                    }
                    break;
                case 7:
                    gDc.registroCorredores();

                    break;
                default:
                    System.out.println("Solo puedes introducir un número del 1 al 7");
            }
        } while (select != 8);

    }

}
