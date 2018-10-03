/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicacion.corredores.vista;

import aplicacion.corredores.controlador.GestionCorredores;
import aplicacion.corredores.modelo.Corredor;
import com.toedter.calendar.JCalendar;
import com.toedter.calendar.JDateChooser;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author migue
 */
public class PantallaPrincipal extends javax.swing.JFrame {

    private GestionCorredores gestion = new GestionCorredores();
    private SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    private JDateChooser dateChooser;

    /**
     * Creates new form PantallaPrincipal
     */
    public PantallaPrincipal() {

        initComponents();
        dateChooser = new JDateChooser("dd/MM/yyyy", "##/##/####", '_');
        dateChooser.setBounds(150, 235, 200, 30);
        jDInscripcionCorredor.add(dateChooser);
        gestion.leerCsv();
        pintarTabla();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDInscripcionCorredor = new javax.swing.JDialog();
        jTFTelefono = new javax.swing.JTextField();
        jLTituloFormulario = new javax.swing.JLabel();
        jLFecha = new javax.swing.JLabel();
        jTFNombre = new javax.swing.JTextField();
        jLNombre = new javax.swing.JLabel();
        jLDni = new javax.swing.JLabel();
        jBContinuar = new javax.swing.JButton();
        jTFDni = new javax.swing.JTextField();
        jLDireccion = new javax.swing.JLabel();
        jTFDireccion = new javax.swing.JTextField();
        jLTelefono = new javax.swing.JLabel();
        jBLimpiarCampos = new javax.swing.JButton();
        jPanelBotonAlta = new javax.swing.JPanel();
        jBInscribirCorredor = new javax.swing.JButton();
        jBguardarCsv = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableCorredores = new javax.swing.JTable();

        jDInscripcionCorredor.setTitle("InscripcionCorredor");
        jDInscripcionCorredor.setMinimumSize(new java.awt.Dimension(500, 400));
        jDInscripcionCorredor.setModal(true);

        jTFTelefono.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFTelefonoActionPerformed(evt);
            }
        });

        jLTituloFormulario.setText("Formulario Alta Corredor");

        jLFecha.setText("Fecha Nacimiento : ");

        jTFNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTFNombreActionPerformed(evt);
            }
        });

        jLNombre.setText("Nombre :");

        jLDni.setText("Dni");

        jBContinuar.setText("Continuar");
        jBContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBContinuarActionPerformed(evt);
            }
        });

        jLDireccion.setText("Direccion :");

        jLTelefono.setText("Telefono Contacto :");

        jBLimpiarCampos.setText("Limpiar Campos");
        jBLimpiarCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimpiarCamposActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jDInscripcionCorredorLayout = new javax.swing.GroupLayout(jDInscripcionCorredor.getContentPane());
        jDInscripcionCorredor.getContentPane().setLayout(jDInscripcionCorredorLayout);
        jDInscripcionCorredorLayout.setHorizontalGroup(
            jDInscripcionCorredorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDInscripcionCorredorLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jDInscripcionCorredorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jDInscripcionCorredorLayout.createSequentialGroup()
                        .addGroup(jDInscripcionCorredorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLTituloFormulario, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jDInscripcionCorredorLayout.createSequentialGroup()
                                .addGroup(jDInscripcionCorredorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLNombre)
                                    .addComponent(jLDireccion)
                                    .addComponent(jLFecha)
                                    .addGroup(jDInscripcionCorredorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLDni, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLTelefono, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(38, 38, 38)
                                .addGroup(jDInscripcionCorredorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTFNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTFDni)
                                    .addComponent(jTFDireccion, javax.swing.GroupLayout.DEFAULT_SIZE, 250, Short.MAX_VALUE)
                                    .addComponent(jTFTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(0, 24, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jDInscripcionCorredorLayout.createSequentialGroup()
                        .addComponent(jBLimpiarCampos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jBContinuar)))
                .addContainerGap())
        );
        jDInscripcionCorredorLayout.setVerticalGroup(
            jDInscripcionCorredorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDInscripcionCorredorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLTituloFormulario, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jDInscripcionCorredorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTFNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLNombre))
                .addGap(18, 18, 18)
                .addGroup(jDInscripcionCorredorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLDni)
                    .addComponent(jTFDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jDInscripcionCorredorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLDireccion)
                    .addComponent(jTFDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jDInscripcionCorredorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLTelefono)
                    .addComponent(jTFTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLFecha)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addGroup(jDInscripcionCorredorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBContinuar)
                    .addComponent(jBLimpiarCampos))
                .addContainerGap())
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Formulario Alta Corredor");
        setMaximumSize(new java.awt.Dimension(21474836, 21474836));
        setMinimumSize(new java.awt.Dimension(500, 300));

        jPanelBotonAlta.setToolTipText("");
        jPanelBotonAlta.setMaximumSize(new java.awt.Dimension(3276, 3276));

        jBInscribirCorredor.setText("Inscribir corredor");
        jBInscribirCorredor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBInscribirCorredorActionPerformed(evt);
            }
        });

        jBguardarCsv.setText("Guardar corredores");
        jBguardarCsv.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBguardarCsvActionPerformed(evt);
            }
        });

        jTableCorredores.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTableCorredores);

        javax.swing.GroupLayout jPanelBotonAltaLayout = new javax.swing.GroupLayout(jPanelBotonAlta);
        jPanelBotonAlta.setLayout(jPanelBotonAltaLayout);
        jPanelBotonAltaLayout.setHorizontalGroup(
            jPanelBotonAltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBotonAltaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelBotonAltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jBInscribirCorredor, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBguardarCsv, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 453, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanelBotonAltaLayout.setVerticalGroup(
            jPanelBotonAltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelBotonAltaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelBotonAltaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanelBotonAltaLayout.createSequentialGroup()
                        .addComponent(jBInscribirCorredor)
                        .addGap(18, 18, 18)
                        .addComponent(jBguardarCsv)))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelBotonAlta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelBotonAlta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTFTelefonoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFTelefonoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFTelefonoActionPerformed

    private void jTFNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTFNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTFNombreActionPerformed

    private void jBContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBContinuarActionPerformed

        String nombre = jTFNombre.getText();
        String dni = jTFDni.getText();
        Date fechaNacimiento = dateChooser.getDate();
        String direccion = jTFDireccion.getText();
        String telefonoStr = jTFTelefono.getText();
        int telefono = Integer.parseInt(telefonoStr);
        Corredor corredorAux = new Corredor(nombre, dni, fechaNacimiento, direccion, telefono);
        gestion.addCorredorr(corredorAux);
        jDInscripcionCorredor.dispose();
        
        //Date fecha = (Date)jSpinnerFecha.getValue();
        
        pintarTabla();

    }//GEN-LAST:event_jBContinuarActionPerformed

    private void jBInscribirCorredorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBInscribirCorredorActionPerformed
        jDInscripcionCorredor.setVisible(true);
    }//GEN-LAST:event_jBInscribirCorredorActionPerformed

    private void jBguardarCsvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBguardarCsvActionPerformed
        gestion.escribirCsv();
    }//GEN-LAST:event_jBguardarCsvActionPerformed

    private void jBLimpiarCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimpiarCamposActionPerformed
        limpiarCamposJdialog();

    }//GEN-LAST:event_jBLimpiarCamposActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PantallaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBContinuar;
    private javax.swing.JButton jBInscribirCorredor;
    private javax.swing.JButton jBLimpiarCampos;
    private javax.swing.JButton jBguardarCsv;
    private javax.swing.JDialog jDInscripcionCorredor;
    private javax.swing.JLabel jLDireccion;
    private javax.swing.JLabel jLDni;
    private javax.swing.JLabel jLFecha;
    private javax.swing.JLabel jLNombre;
    private javax.swing.JLabel jLTelefono;
    private javax.swing.JLabel jLTituloFormulario;
    private javax.swing.JPanel jPanelBotonAlta;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTFDireccion;
    private javax.swing.JTextField jTFDni;
    private javax.swing.JTextField jTFNombre;
    private javax.swing.JTextField jTFTelefono;
    private javax.swing.JTable jTableCorredores;
    // End of variables declaration//GEN-END:variables

    private void limpiarCamposJdialog() {
       jTFNombre.setText("");
        jTFDireccion.setText("");
        jTFDni.setText("");
        jTFTelefono.setText("");
        dateChooser.setDate(new Date());
    }
    
    private void pintarTabla() {
        ArrayList<Corredor> corredores = gestion.getCorredores();
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Nombre");
        model.addColumn("Dni");
        model.addColumn("Fecha Nacimiento");
        model.addColumn("Direccion");
        model.addColumn("Numero Telefono");
        for (int i = 0; i < corredores.size(); i++) {
            String nombre = corredores.get(i).getNombre();
            String dni = corredores.get(i).getDni();
            String fecha = sdf.format(corredores.get(i).getFechaNacimiento());
            String direccion = corredores.get(i).getDireccion();
            int telefono = corredores.get(i).getTelefono();

            Object[] datosCorredor = {nombre, dni, fecha, direccion, telefono};

            model.addRow(datosCorredor);
        }
        jTableCorredores.setModel(model);
    }
}
