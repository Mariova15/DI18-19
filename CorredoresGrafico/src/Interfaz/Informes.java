/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import Logica.GestionDeCarreras;
import Logica.GestionDeCorredores;
import Modelo.Carrera;
import java.util.HashMap;
import java.util.Map;
import net.sf.jasperreports.engine.JRDataSource;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperExportManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.data.JRBeanCollectionDataSource;
import org.openide.util.Exceptions;

/**
 *
 * @author Mario
 */
public class Informes extends javax.swing.JDialog {

    private GestionDeCarreras gdCarreras;
    private GestionDeCorredores gdCorredores;
    private JRDataSource dataSource;
    private Map parametros;
    private JasperPrint print;
    
    /**
     * Creates new form Informes
     */
    public Informes(java.awt.Frame parent, boolean modal, GestionDeCarreras gdCarreras, GestionDeCorredores gdCorredores) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        this.gdCarreras = gdCarreras;
        this.gdCorredores = gdCorredores;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelFondo = new javax.swing.JPanel();
        jLabelTitle = new javax.swing.JLabel();
        jButtonNoFinalizadas = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabelTitle.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabelTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitle.setText("Informes");

        jButtonNoFinalizadas.setText("Carreras sin finalizar");
        jButtonNoFinalizadas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonNoFinalizadasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelFondoLayout = new javax.swing.GroupLayout(jPanelFondo);
        jPanelFondo.setLayout(jPanelFondoLayout);
        jPanelFondoLayout.setHorizontalGroup(
            jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFondoLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE)
                    .addComponent(jButtonNoFinalizadas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanelFondoLayout.setVerticalGroup(
            jPanelFondoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelFondoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonNoFinalizadas)
                .addContainerGap(171, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelFondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonNoFinalizadasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonNoFinalizadasActionPerformed
        try {
            for (Carrera carrera : gdCarreras.carrerasSinFinalizar()) {
                System.out.println(carrera.getNombre());
            }
            dataSource = new JRBeanCollectionDataSource(gdCarreras.carrerasSinFinalizar());
            parametros = new HashMap();
            print = JasperFillManager.fillReport("reports/jasper/sinfinalizar.jasper", parametros, dataSource);
            JasperExportManager.exportReportToPdfFile(print, "reports/pdf/sinfinalizar.pdf");
        } catch (JRException ex) {
            Exceptions.printStackTrace(ex);
        }
    }//GEN-LAST:event_jButtonNoFinalizadasActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonNoFinalizadas;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JPanel jPanelFondo;
    // End of variables declaration//GEN-END:variables
}
