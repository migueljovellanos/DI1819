/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.corredores.vista;

import aplicacion.corredores.controlador.GestionAplicacion;
import aplicacion.corredores.modelo.Carrera;
import aplicacion.corredores.modelo.CorredorParaCarrera;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Miguel
 */
public class JDCronometro extends javax.swing.JDialog {

    private final GestionAplicacion gestion;
    private final Carrera carrera;

    /**
     * Creates new form JDCronometro
     */
    public JDCronometro(java.awt.Dialog parent, boolean modal, GestionAplicacion gestion, Carrera carreraSeleccionada) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        this.gestion = gestion;
        this.carrera = carreraSeleccionada;
        jLNombreCarrera.setText(carrera.getNombre());
        rellenarCombo();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLNombreCarrera = new javax.swing.JLabel();
        jComboBoxDorsales = new javax.swing.JComboBox<>();
        jButtonRegistrarTiempo = new javax.swing.JButton();
        cronometro1 = new Componentes.Cronometro();
        jButtonIniciarCrono = new javax.swing.JButton();
        jButtonFinalizarCrono = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLNombreCarrera.setText(org.openide.util.NbBundle.getMessage(JDCronometro.class, "JDCronometro.jLNombreCarrera.text")); // NOI18N

        jButtonRegistrarTiempo.setText(org.openide.util.NbBundle.getMessage(JDCronometro.class, "JDCronometro.jButtonRegistrarTiempo.text")); // NOI18N
        jButtonRegistrarTiempo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonRegistrarTiempoActionPerformed(evt);
            }
        });

        cronometro1.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N

        jButtonIniciarCrono.setText(org.openide.util.NbBundle.getMessage(JDCronometro.class, "JDCronometro.jButtonIniciarCrono.text")); // NOI18N
        jButtonIniciarCrono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonIniciarCronoActionPerformed(evt);
            }
        });

        jButtonFinalizarCrono.setText(org.openide.util.NbBundle.getMessage(JDCronometro.class, "JDCronometro.jButtonFinalizarCrono.text")); // NOI18N
        jButtonFinalizarCrono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonFinalizarCronoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLNombreCarrera, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cronometro1, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jButtonIniciarCrono, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButtonFinalizarCrono, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jComboBoxDorsales, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(61, 61, 61)
                                .addComponent(jButtonRegistrarTiempo)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLNombreCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cronometro1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonIniciarCrono)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jButtonFinalizarCrono, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxDorsales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonRegistrarTiempo))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonRegistrarTiempoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonRegistrarTiempoActionPerformed
        registrarTiempo();
    }//GEN-LAST:event_jButtonRegistrarTiempoActionPerformed

    private void jButtonIniciarCronoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonIniciarCronoActionPerformed
        cronometro1.iniciar();
    }//GEN-LAST:event_jButtonIniciarCronoActionPerformed

    private void jButtonFinalizarCronoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonFinalizarCronoActionPerformed
        cronometro1.finalizar();
        JOptionPane.showMessageDialog(rootPane, "Carrera Finalizada.");
        this.dispose();
    }//GEN-LAST:event_jButtonFinalizarCronoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private Componentes.Cronometro cronometro1;
    private javax.swing.JButton jButtonFinalizarCrono;
    private javax.swing.JButton jButtonIniciarCrono;
    private javax.swing.JButton jButtonRegistrarTiempo;
    private javax.swing.JComboBox<String> jComboBoxDorsales;
    private javax.swing.JLabel jLNombreCarrera;
    // End of variables declaration//GEN-END:variables

    private void rellenarCombo() {
        ArrayList<CorredorParaCarrera> corredores = carrera.getCorredores();
        for (CorredorParaCarrera corredor : corredores) {
            jComboBoxDorsales.addItem(String.valueOf(corredor.getDorsal()));
        }
    }

    private boolean registrarTiempo() {
        Object selectedItem = jComboBoxDorsales.getSelectedItem();
        ArrayList<CorredorParaCarrera> corredores = carrera.getCorredores();
        for (CorredorParaCarrera corredor : corredores) {
            if (corredor.getDorsal() == Integer.getInteger((String) selectedItem)) {
                corredor.setTiempo(cronometro1.getTiempo());
                return true;
            }
        }
        return false;
    }

}