/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import Interfaz.Tablemodels.TableModelCorredoreCarrera;
import Interfaz.Tablemodels.TableModelCorredores;
import Logica.GestionDeCarreras;
import Logica.GestionDeCorredores;
import Modelo.Corredor;
import Modelo.CorredorCarrera;
import java.io.File;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author Mario
 */
public class ListadoCorredorCarrera extends javax.swing.JDialog {

    private GestionDeCarreras gdCarreras;
    private GestionDeCorredores gdCorredores;
    private int idCarrera;

    /**
     * Creates new form ListadoCorredorCarrera
     */
    public ListadoCorredorCarrera(java.awt.Dialog parent, boolean modal, GestionDeCarreras gdCarreras, int carrera, GestionDeCorredores gdCorredores) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        this.gdCarreras = gdCarreras;
        this.gdCorredores = gdCorredores;
        idCarrera = carrera;
        jLabelNomCarrera.setText(gdCarreras.getListaCarreras().get(idCarrera).getNombre());
        rellenarTablaCorredores();
    }

    private void rellenarTablaCorredores() {
        jTableCorredores.setModel(new TableModelCorredoreCarrera(gdCarreras.getListaCarreras().get(idCarrera).getListaCorredores()));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableCorredores = new javax.swing.JTable();
        jLabelNomCarrera = new javax.swing.JLabel();
        jButtonBorrar = new javax.swing.JButton();
        jButtonBorrarSelec = new javax.swing.JButton();
        jButtonBorrarTodos = new javax.swing.JButton();
        jButtonAgregar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jTableCorredores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "Dorsal", "Nombre", "Title 3", "Title 4", "Title 5", "Title 6"
            }
        ));
        jScrollPane2.setViewportView(jTableCorredores);

        jLabelNomCarrera.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabelNomCarrera.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelNomCarrera.setText("jLabel1");

        jButtonBorrar.setText("Borrar corredor");
        jButtonBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBorrarActionPerformed(evt);
            }
        });

        jButtonBorrarSelec.setText("Borrar corredores seleccionados");
        jButtonBorrarSelec.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBorrarSelecActionPerformed(evt);
            }
        });

        jButtonBorrarTodos.setText("Borrar todos los corredores");
        jButtonBorrarTodos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBorrarTodosActionPerformed(evt);
            }
        });

        jButtonAgregar.setText("Añadir corredores");
        jButtonAgregar.setActionCommand("Inscribir corredores en carrare");
        jButtonAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAgregarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelNomCarrera, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane2)
                    .addComponent(jButtonBorrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonBorrarSelec, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonBorrarTodos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonAgregar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelNomCarrera)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonAgregar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonBorrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonBorrarSelec)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonBorrarTodos)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBorrarActionPerformed
        int selectedRow = jTableCorredores.getSelectedRow();
        if (selectedRow != -1) {
            gdCarreras.getListaCarreras().get(idCarrera).getListaCorredores().remove(selectedRow);
            JOptionPane.showMessageDialog(this, "Corredor borrado");
            rellenarTablaCorredores();
        } else {
            JOptionPane.showMessageDialog(this, "Selecciona un corredor");
        }

    }//GEN-LAST:event_jButtonBorrarActionPerformed

    private void jButtonBorrarSelecActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBorrarSelecActionPerformed
        int[] selectedRows = jTableCorredores.getSelectedRows();

        for (int i = 0; i < selectedRows.length / 2; i++) {
            int temp = selectedRows[i];
            selectedRows[i] = selectedRows[selectedRows.length - 1 - i];
            selectedRows[selectedRows.length - 1 - i] = temp;
        }

        for (int selectedRow : selectedRows) {
            gdCarreras.getListaCarreras().get(idCarrera).getListaCorredores().remove(selectedRow);
        }
        rellenarTablaCorredores();
    }//GEN-LAST:event_jButtonBorrarSelecActionPerformed

    private void jButtonBorrarTodosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBorrarTodosActionPerformed
        gdCarreras.getListaCarreras().get(idCarrera).getListaCorredores().removeAll(
                gdCarreras.getListaCarreras().get(idCarrera).getListaCorredores());
        rellenarTablaCorredores();
    }//GEN-LAST:event_jButtonBorrarTodosActionPerformed

    private void jButtonAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAgregarActionPerformed
        ListadoCorredor listadoCorredor = null;
        listadoCorredor = new ListadoCorredor(this, true, gdCarreras, gdCorredores, idCarrera);
        listadoCorredor.setVisible(true);
        rellenarTablaCorredores();
    }//GEN-LAST:event_jButtonAgregarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAgregar;
    private javax.swing.JButton jButtonBorrar;
    private javax.swing.JButton jButtonBorrarSelec;
    private javax.swing.JButton jButtonBorrarTodos;
    private javax.swing.JLabel jLabelNomCarrera;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableCorredores;
    // End of variables declaration//GEN-END:variables
}
