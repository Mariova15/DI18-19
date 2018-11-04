/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz.Tablemodels;

import Modelo.Corredor;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Mario
 */
public class TableModelCorredoreCarrera extends AbstractTableModel {

    private final Map<Integer, Corredor> listaCorredores;
    private final List<Corredor> corredores;
    private final String[] columnas = {"Dorsal", "Nombre", "DNI", "Dirección", "Telf", "Fecha"};

    public TableModelCorredoreCarrera(Map<Integer, Corredor> listaCorredores) {
        this.listaCorredores = listaCorredores;
        corredores = new ArrayList<>(listaCorredores.values());

        for (Corredor corredore : corredores) {
            System.out.println(corredore.toString());
        }

    }

    @Override
    public int getRowCount() {
        return corredores.size();
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
                return rowIndex + 1;
            case 1:
                return corredores.get(rowIndex).getNombre();
            case 2:
                return corredores.get(rowIndex).getDni();
            case 3:
                return corredores.get(rowIndex).getDireccion();
            case 4:
                return corredores.get(rowIndex).getTelf();
            case 5:
                return corredores.get(rowIndex).FechaString();
        }
        return null;
    }

}
