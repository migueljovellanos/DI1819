/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista.tableModels;

import java.util.List;
import javax.swing.table.AbstractTableModel;
import modelo.Corredor;
import static utils.Utils.SDF;

/**
 * @author migue
 */
public class TableModelCorredores extends AbstractTableModel {

    private final List<Corredor> listaCorredores;
    private final String[] columnas = {"Nombre", "DNI", "Fecha Nacimiento", "Direccion", "Numero Telefono"};

    public TableModelCorredores(List<Corredor> listaCorredores) {
        this.listaCorredores = listaCorredores;
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
                return listaCorredores.get(rowIndex).getNombre();
            case 1:
                return listaCorredores.get(rowIndex).getDni();
            case 2:
                return SDF.format(listaCorredores.get(rowIndex).getFechaNacimiento());
            case 3:
                return listaCorredores.get(rowIndex).getDireccion();
            case 4:
                return listaCorredores.get(rowIndex).getTelefono();
        }
        return null;
    }

}
