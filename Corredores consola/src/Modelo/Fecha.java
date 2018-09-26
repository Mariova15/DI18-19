/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Mario
 */
public class Fecha {

    private SimpleDateFormat sdf;
    private Date fechaNacimiento;

    public Fecha() {
        sdf = new SimpleDateFormat("dd/mm/yy");
    }

    public Date dateParse(String fecha) throws ParseException {
        fechaNacimiento = sdf.parse(fecha);
        return fechaNacimiento;
    }

}
