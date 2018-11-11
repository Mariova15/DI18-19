/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaz;

import Logica.GestionArchivosCSV;
import Logica.GestionDeCorredores;
import Modelo.Corredor;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import org.netbeans.validation.api.builtin.stringvalidation.StringValidators;
import org.netbeans.validation.api.ui.ValidationGroup;

/**
 *
 * @author alumnop
 */
public class AltaCorredor extends javax.swing.JDialog {
    
    private GestionDeCorredores gdc;
    private GestionArchivosCSV gacsv = new GestionArchivosCSV();
    private Corredor corredorModificar = null;
    private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yy");

    /**
     * Creates new form AltaCorredor
     */
    public AltaCorredor(java.awt.Frame parent, boolean modal, GestionDeCorredores gdc, GestionArchivosCSV gacsv) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        this.gdc = gdc;
        this.gacsv = gacsv;
        
        jButtonAlta.setEnabled(false);
        ValidationGroup group = validationPanelAlta.getValidationGroup();
        
        group.add(jTextFieldNom, StringValidators.REQUIRE_NON_EMPTY_STRING);
        group.add(jTextFieldDNI, StringValidators.REQUIRE_NON_EMPTY_STRING);
        group.add(jTextFieldDir, StringValidators.REQUIRE_NON_EMPTY_STRING);
        group.add(jTextFieldTelf, StringValidators.REQUIRE_NON_EMPTY_STRING, StringValidators.REQUIRE_VALID_INTEGER);
        
        validationPanelAlta.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                
                if (validationPanelAlta.getProblem() == null) {
                    jButtonAlta.setEnabled(true);
                } else {
                    jButtonAlta.setEnabled(false);
                }
                
            }
        });
        
    }
    
    public AltaCorredor(java.awt.Dialog parent, boolean modal, Corredor corredorModificar) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        this.gdc = gdc;
        this.gacsv = gacsv;
        this.corredorModificar = corredorModificar;
        
        ValidationGroup group = validationPanelAlta.getValidationGroup();
        
        group.add(jTextFieldNom, StringValidators.REQUIRE_NON_EMPTY_STRING);
        group.add(jTextFieldDNI, StringValidators.REQUIRE_NON_EMPTY_STRING);
        group.add(jTextFieldDir, StringValidators.REQUIRE_NON_EMPTY_STRING);
        group.add(jTextFieldTelf, StringValidators.REQUIRE_NON_EMPTY_STRING, StringValidators.REQUIRE_VALID_INTEGER);
        
        validationPanelAlta.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                
                if (validationPanelAlta.getProblem() == null) {
                    jButtonAlta.setEnabled(true);
                } else {
                    jButtonAlta.setEnabled(false);
                }
                
            }
        });
        
        jTextFieldNom.setText(corredorModificar.getNombre());
        jTextFieldDNI.setText(corredorModificar.getDni());
        jTextFieldDir.setText(corredorModificar.getDireccion());
        jTextFieldTelf.setText("" + corredorModificar.getTelf());
        jSpinnerFecha.setValue(corredorModificar.getFechaNacimiento());
        jButtonAlta.setText("Modificar corredor");
        jButtonLimpiar.setText("Cancelar");        
        
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
        jLabelTitle = new javax.swing.JLabel();
        jLabelNombre = new javax.swing.JLabel();
        jTextFieldNom = new javax.swing.JTextField();
        jLabelDni = new javax.swing.JLabel();
        jTextFieldDNI = new javax.swing.JTextField();
        jLabelDir = new javax.swing.JLabel();
        jTextFieldDir = new javax.swing.JTextField();
        jLabeltelf = new javax.swing.JLabel();
        jTextFieldTelf = new javax.swing.JTextField();
        jLabelFecha = new javax.swing.JLabel();
        jSpinnerFecha = new javax.swing.JSpinner();
        jButtonAlta = new javax.swing.JButton();
        jButtonLimpiar = new javax.swing.JButton();
        validationPanelAlta = new org.netbeans.validation.api.ui.swing.ValidationPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabelTitle.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLabelTitle.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTitle.setText("Alta de corredor");

        jLabelNombre.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelNombre.setText("Nombre");

        jLabelDni.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelDni.setText("DNI");

        jLabelDir.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelDir.setText("Dirección");

        jLabeltelf.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabeltelf.setText("Telf");

        jLabelFecha.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabelFecha.setText("Fecha");
        jLabelFecha.setToolTipText("");

        jSpinnerFecha.setModel(new javax.swing.SpinnerDateModel());

        jButtonAlta.setText("Dar de alta");
        jButtonAlta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAltaActionPerformed(evt);
            }
        });

        jButtonLimpiar.setText("Limpiar");
        jButtonLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelTitle, javax.swing.GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabelNombre)
                            .addComponent(jLabelDni)
                            .addComponent(jLabelDir)
                            .addComponent(jLabeltelf)
                            .addComponent(jLabelFecha))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jSpinnerFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(validationPanelAlta, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(jTextFieldNom)
                            .addComponent(jTextFieldDNI)
                            .addComponent(jTextFieldDir)
                            .addComponent(jTextFieldTelf, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addComponent(jButtonLimpiar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButtonAlta, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabelTitle)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelNombre)
                    .addComponent(jTextFieldNom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDni)
                    .addComponent(jTextFieldDNI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabelDir)
                    .addComponent(jTextFieldDir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabeltelf)
                    .addComponent(jTextFieldTelf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabelFecha)
                        .addComponent(jSpinnerFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(validationPanelAlta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButtonAlta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButtonLimpiar)
                .addContainerGap())
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
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonLimpiarActionPerformed
        // TODO add your handling code here:
        if (corredorModificar == null) {
            jTextFieldNom.setText("");
            jTextFieldDNI.setText("");
            jTextFieldDir.setText("");
            jTextFieldTelf.setText("");
        } else {
            this.dispose();
        }

    }//GEN-LAST:event_jButtonLimpiarActionPerformed

    private void jButtonAltaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAltaActionPerformed
        // TODO add your handling code here:

        String nombre = jTextFieldNom.getText();
        String dni = jTextFieldDNI.getText();
        String dir = jTextFieldDir.getText();
        String telf = jTextFieldTelf.getText();
        Date fecha = (Date) jSpinnerFecha.getValue();
        
        if (corredorModificar == null) {
            gdc.alta(nombre, dni, dir, Integer.parseInt(telf), fecha);            
            JOptionPane.showMessageDialog(this, "Corredor añadido");
            this.dispose();
        } else {
            corredorModificar.setNombre(nombre);
            corredorModificar.setDni(dni);
            corredorModificar.setDireccion(dir);
            corredorModificar.setTelf(Integer.parseInt(telf));
            corredorModificar.setFechaNacimiento(fecha);
            JOptionPane.showMessageDialog(this, "Corredor modificado");
            this.dispose();
        }
        
    }//GEN-LAST:event_jButtonAltaActionPerformed

    /**
     * @param args the command line arguments
     */
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAlta;
    private javax.swing.JButton jButtonLimpiar;
    private javax.swing.JLabel jLabelDir;
    private javax.swing.JLabel jLabelDni;
    private javax.swing.JLabel jLabelFecha;
    private javax.swing.JLabel jLabelNombre;
    private javax.swing.JLabel jLabelTitle;
    private javax.swing.JLabel jLabeltelf;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSpinner jSpinnerFecha;
    private javax.swing.JTextField jTextFieldDNI;
    private javax.swing.JTextField jTextFieldDir;
    private javax.swing.JTextField jTextFieldNom;
    private javax.swing.JTextField jTextFieldTelf;
    private org.netbeans.validation.api.ui.swing.ValidationPanel validationPanelAlta;
    // End of variables declaration//GEN-END:variables
}
