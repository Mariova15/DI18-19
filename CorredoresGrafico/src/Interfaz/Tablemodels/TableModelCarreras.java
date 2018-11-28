/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz.Tablemodels;

import Modelo.Carrera;
import Modelo.Corredor;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Mario
 */
public class TableModelCarreras extends AbstractTableModel {

    private final List<Carrera> listaCarreras;
    private final String[] columnas = {"Nombre", "Lugar", "Participantes", "Fecha", "Estado"};

    public TableModelCarreras(List<Carrera> listaCarreras) {
        this.listaCarreras = listaCarreras;
    }

    @Override
    public int getRowCount() {
        return listaCarreras.size();
    }

    @Override
    public int getColumnCount() {
        return columnas.length;
    }

    @Override
    public String getColumnName(int column) {
        return columnas[column];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return listaCarreras.get(rowIndex).getNombre();
            case 1:
                return listaCarreras.get(rowIndex).getLugarCarrera();
            case 2:
                return listaCarreras.get(rowIndex).getNumMaxParticipantes();
            case 3:
                return listaCarreras.get(rowIndex).fechaString();
            case 4:
                if (listaCarreras.get(rowIndex).isFinalizada()) {
                    return "Finalizada";
                } else {
                    return "Pendiente";
                }
        }
        return null;
    }

}
