/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz.Tablemodels;

import Modelo.Corredor;
import Modelo.CorredorCarrera;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Mario
 */
public class TableModelCorredoreCarrera extends AbstractTableModel {

    private final List<CorredorCarrera> listaCorredores;
    private final String[] columnas = {"Dorsal", "Nombre", "DNI", "Dirección", "Telf", "Fecha"};

    public TableModelCorredoreCarrera(List<CorredorCarrera> listaCorredores) {
        this.listaCorredores = listaCorredores;
        /*for (int i = 0; i < listaCorredores.size(); i++) {
        listaCorredores.get(i).setDorsal(i + 1);
        }*/
    }

    @Override
    public int getRowCount() {
        return listaCorredores.size();
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
                return listaCorredores.get(rowIndex).getDorsal();
            case 1:
                return listaCorredores.get(rowIndex).getNombre();
            case 2:
                return listaCorredores.get(rowIndex).getDni();
            case 3:
                return listaCorredores.get(rowIndex).getDireccion();
            case 4:
                return listaCorredores.get(rowIndex).getTelf();
            case 5:
                return listaCorredores.get(rowIndex).FechaString();
        }
        return null;
    }

}
