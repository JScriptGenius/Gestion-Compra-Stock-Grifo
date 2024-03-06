package Formatos;

import java.awt.*;
import javax.swing.JTable;
import javax.swing.table.*;

public class EstiloTabla {
    
    public static void CambiarTamañoColumnas(JTable tabla) {

        TableColumnModel columnModel = tabla.getColumnModel();

        for (int columna = 0; columna < tabla.getColumnCount(); columna++) {

            int width = 100; 

            for (int fila = 0; fila < tabla.getRowCount(); fila++) {

                TableCellRenderer renderer = tabla.getCellRenderer(fila, columna);

                Component componente = tabla.prepareRenderer(renderer, fila, columna);

                width = Math.max(componente.getPreferredSize().width + 1, width);
            }
            columnModel.getColumn(columna).setPreferredWidth(width);
        }
    }
    
    public static void FormatoCabecera(JTable tabla){
        tabla.getTableHeader().setFont(new Font("Nirmala UI", Font.BOLD,14));
        tabla.getTableHeader().setOpaque(false);
        tabla.getTableHeader().setBackground(new Color(69, 123, 157));
        tabla.getTableHeader().setForeground(new Color(255, 255, 255));
        tabla.setRowHeight(25);
    }
}
