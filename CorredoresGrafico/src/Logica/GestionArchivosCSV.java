/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Logica;

import Modelo.Corredor;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Mario
 */
public class GestionArchivosCSV {

    private FileWriter fw = null;
    private FileReader fr = null;
    private List<Corredor> corredores;

    //private Registro registro;
    public GestionArchivosCSV() {
        corredores = new ArrayList<Corredor>();
    }

    public static Object tokenizar(String linea) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy");
        String[] lineas = linea.split(",");
        Corredor c = new Corredor(lineas[0], lineas[1], lineas[2], Integer.parseInt(lineas[3]), sdf.parse(lineas[4]));
        /*StringTokenizer tokens = new StringTokenizer(linea, ",");
        Corredor c =null;
        while (tokens.hasMoreTokens()) {
            String nombre = tokens.nextToken();
            String dni = tokens.nextToken();
            String dir = tokens.nextToken();
            int telf = Integer.parseInt(tokens.nextToken());
            String fecha = tokens.nextToken();            
            c = new Corredor(nombre, dni, dir, telf, sdf.parse(fecha));
        } */       
        return c;
    }

    public void abrirFicheroEscritura(String archivo) {

        try {
            fw = new FileWriter(archivo, true);
        } catch (IOException ex) {
            Logger.getLogger(GestionArchivosCSV.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
        public void abrirFicheroEscritura(String archivo,Boolean nuevo) {

        try {
            fw = new FileWriter(archivo, nuevo);
        } catch (IOException ex) {
            Logger.getLogger(GestionArchivosCSV.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void escribirCadena(String cadena) throws IOException {
        fw.write(cadena);
    }

    public List leerFichero(String archivo) throws ParseException {
        List<Corredor> corredores;
        corredores = new ArrayList<>();
        try {
            fr = new FileReader(archivo);
            BufferedReader registro = new BufferedReader(fr);

            String cadena;
            while ((cadena = registro.readLine()) != null) {
                corredores.add((Corredor) tokenizar(cadena));
            }
            fr.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(GestionArchivosCSV.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(GestionArchivosCSV.class.getName()).log(Level.SEVERE, null, ex);
        }

        return corredores;

    }

    public void cerrarFicheroEscritura() {
        try {
            fw.close();
        } catch (IOException ex) {
            Logger.getLogger(GestionArchivosCSV.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
