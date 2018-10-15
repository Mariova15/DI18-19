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

    
    private Singleton() {}

    public static GestionDeCorredores getInstance() {
        return INSTANCE;
    }
}
