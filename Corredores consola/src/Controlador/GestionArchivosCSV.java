/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Corredor;
import Modelo.Fecha;
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
    private SimpleDateFormat sdf;
    private List<Corredor> corredores;
    private Date fechaNacimiento;
    private Fecha f;
    private Corredor c;

    //private Registro registro;
    public GestionArchivosCSV() {
        sdf = new SimpleDateFormat("dd/mm/yy");
        corredores = new ArrayList<Corredor>();
        f = new Fecha();
        c = new Corredor();
    }

    public static Object tokenizar(String linea) throws ParseException {
        Fecha f = new Fecha();
        String[] lineas = linea.split(",");
        Corredor c = new Corredor(lineas[0], lineas[1], lineas[2], Integer.parseInt(lineas[3]), f.dateParse(lineas[4]));
        return c;
    }

    public void abrirFichero(String archivo) {

        try {
            fw = new FileWriter(archivo, true);
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
