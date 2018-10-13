/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import Interfaz.Tablemodels.TableModelCorredores;
import Logica.GestionArchivosCSV;
import Logica.GestionDeCorredores;
import Modelo.Corredor;
import java.io.IOException;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author alumnop
 */
public class ListadoCorredor extends javax.swing.JDialog {

    private GestionDeCorredores gdc;
    private GestionArchivosCSV gacsv;

    /**
     * Creates new form ListadoCorredor
     */
    public ListadoCorredor(java.awt.Frame parent, boolean modal, GestionDeCorredores gdc, GestionArchivosCSV gacsv) throws ParseException {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        this.gdc = gdc;
        this.gacsv = gacsv;
        rellenarTablaAlumnos();
    }

    private void rellenarTablaAlumnos() {
        /*String[] columnas = {"Nombre", "DNI", "Dirección", "Telf", "Fecha"};
        DefaultTableModel dtm = new DefaultTableModel(columnas, 0);
        for (Corredor corredor : gdc.getCorredores()) {
        String[] corredorTabla = new String[5];
        corredorTabla[0] = corredor.getNombre();
        corredorTabla[1] = corredor.getDni();
        corredorTabla[2] = corredor.getDireccion();
        corredorTabla[3] = "" + corredor.getTelf();
        corredorTabla[4] = corredor.FechaString();
        dtm.addRow(corredorTabla);
        }
        jTableCorredores.setModel(dtm);*/
        jTableCorredores.setModel(new TableModelCorredores(gdc.getCorredores()));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTableCorredores = new javax.swing.JTable();
        jLabelTitle = new javax.swing.JLabel();
        jButtonExportar = new javax.swing.JButton();
        jButtonModificar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTableCorredores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "No", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ));
        jScrollPane2.setViewportView(jTableCorredores);

        jLabelTitle.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabelTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitle.setText("Listado de corredores");

        jButtonExportar.setText("Exportar CSV");
        jButtonExportar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExportarActionPerformed(evt);
            }
        });

        jButtonModificar.setText("Modificar");
        jButtonModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonModificarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 504, Short.MAX_VALUE)
                    .addComponent(jButtonExportar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addComponent(jLabelTitle, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(58, Short.MAX_VALUE)
                .addComponent(jLabelTitle)
                .addGap(40, 40, 40)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(jButtonModificar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonExportar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonExportarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExportarActionPerformed
        String fichero = JOptionPane.showInputDialog("Introduce nombre del fichero");        
        gacsv.abrirFicheroEscritura(fichero + ".txt");
        try {
            gacsv.escribirCadena(gdc.cadenaCsv());
        } catch (IOException ex) {
            Logger.getLogger(ListadoCorredor.class.getName()).log(Level.SEVERE, null, ex);
        }
        gacsv.cerrarFicheroEscritura();
        
    }//GEN-LAST:event_jButtonExportarActionPerformed

    private void jButtonModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonModificarActionPerformed
        int seleccionado = jTableCorredores.getSelectedRow();
        Corredor corredorSeleccionado = gdc.getCorredores().get(seleccionado);
        AltaCorredor altaCorredorModificar = new AltaCorredor(this,true, corredorSeleccionado);
        altaCorredorModificar.setVisible(true);
        rellenarTablaAlumnos();
        gacsv.abrirFicheroEscritura("corredores.txt",false);
        try {
            gacsv.escribirCadena(gdc.cadenaCsv());
        } catch (IOException ex) {
            Logger.getLogger(ListadoCorredor.class.getName()).log(Level.SEVERE, null, ex);
        }
        gacsv.cerrarFicheroEscritura();
    }//GEN-LAST:event_jButtonModificarActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonExportar;
    private javax.swing.JButton jButtonModificar;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableCorredores;
    // End of variables declaration//GEN-END:variables
}
