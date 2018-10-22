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
public class SingletonGestionCarreras {

    private static final GestionDeCarreras INSTANCE = new GestionDeCarreras();

    private SingletonGestionCarreras() {
    }

    public static GestionDeCarreras getInstance() {
        return INSTANCE;
    }
}
