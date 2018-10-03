/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author alumnop
 */
public class Carrera {
    
    private String nomCarrera,lugar;
    private Date fecha;
    private int numMaximo;
    private List<Corredor>corredores;

    public Carrera(String nomCarrera, String lugar, int numMaximo) {
        this.nomCarrera = nomCarrera;
        this.lugar = lugar;
        fecha = new Date();
        this.numMaximo = numMaximo;
        corredores = new ArrayList<Corredor>();
    }
            
    
}
