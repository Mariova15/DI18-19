/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

/**
 *
 * @author Mario
 */
public class Singleton {
    private static final GestionDeCorredores INSTANCE = new GestionDeCorredores();

    // El constructor privado no permite que se genere un constructor por defecto.
    // (con mismo modificador de acceso que la definición de la clase) 
    private Singleton() {}

    public static GestionDeCorredores getInstance() {
        return INSTANCE;
    }
}
