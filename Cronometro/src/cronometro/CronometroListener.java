/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cronometro;

/**
 *
 * @author Mario
 */
public interface CronometroListener {

    public void resgistrarTiempo(int dorsal, String tiempo, boolean finalizar);
}
