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

        jPanelBotonAlta = new javax.swing.JPanel();
        jBInscribirCorredor = new javax.swing.JButton();
        jBguardarCsv = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTableCorredores = new javax.swing.JTable();

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

    private void jBInscribirCorredorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBInscribirCorredorActionPerformed
         jDInscripcionCorredor inscipcion = new jDInscripcionCorredor(this, true, gestion);
         inscipcion.setVisible(true);
         pintarTabla();
         
    }//GEN-LAST:event_jBInscribirCorredorActionPerformed

    private void jBguardarCsvActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBguardarCsvActionPerformed
        gestion.escribirCsv();
    }//GEN-LAST:event_jBguardarCsvActionPerformed

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
    private javax.swing.JButton jBInscribirCorredor;
    private javax.swing.JButton jBguardarCsv;
    private javax.swing.JPanel jPanelBotonAlta;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTableCorredores;
    // End of variables declaration//GEN-END:variables

    
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
