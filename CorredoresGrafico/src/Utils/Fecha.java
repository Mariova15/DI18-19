/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.openide.util.Exceptions;

/**
 *
 * @author Mario
 */
public class Fecha {

    public static Date fechaParse(String fechaParse) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy");
        Date fecha = null;
        try {
            fecha = sdf.parse(fechaParse);
        } catch (ParseException ex) {
            Exceptions.printStackTrace(ex);
        }
        return fecha;
    }

    public static String fechaFormat(Date fechaFormat) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy");
        return sdf.format(fechaFormat);
    }

}
