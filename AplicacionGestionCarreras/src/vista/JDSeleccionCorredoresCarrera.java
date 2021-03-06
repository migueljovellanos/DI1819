/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.GestionAplicacion;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import modelo.Carrera;
import modelo.Corredor;
import vista.tableModels.TableModelCorredores;

/**
 *
 * @author Miguel
 */
public class JDSeleccionCorredoresCarrera extends javax.swing.JDialog {

    private final GestionAplicacion gestion;
    private final Carrera carrera;

    public JDSeleccionCorredoresCarrera(java.awt.Dialog parent, boolean modal, GestionAplicacion gestion, Carrera carrera) {
        super(parent, modal);
        this.gestion = gestion;
        this.carrera = carrera;
        initComponents();
        this.setLocationRelativeTo(null);
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

        jButtonAddCorredoresToCarrera = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableCorredores = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jButtonAddCorredoresToCarrera.setText(org.openide.util.NbBundle.getMessage(JDSeleccionCorredoresCarrera.class, "JDSeleccionCorredoresCarrera.jButtonAddCorredoresToCarrera.text")); // NOI18N
        jButtonAddCorredoresToCarrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddCorredoresToCarreraActionPerformed(evt);
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
        jScrollPane1.setViewportView(jTableCorredores);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jButtonAddCorredoresToCarrera, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonAddCorredoresToCarrera)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonAddCorredoresToCarreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddCorredoresToCarreraActionPerformed
        int[] selectedRows = jTableCorredores.getSelectedRows();
        ArrayList<Corredor> corredores = gestion.getCorredores();
        if (selectedRows.length > 0) {
            for (int selectedRow : selectedRows) {
                Corredor corredor = corredores.get(selectedRow);
                boolean agregado = carrera.addCorredorCarrera(corredor);
                if (agregado == false) {
                    JOptionPane.showMessageDialog(rootPane, "Este corredor ya esta inscrito para esta carrera", "Error registro corredor", JOptionPane.ERROR_MESSAGE);
                }
            }
        }

        this.dispose();
    }//GEN-LAST:event_jButtonAddCorredoresToCarreraActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonAddCorredoresToCarrera;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTableCorredores;
    // End of variables declaration//GEN-END:variables

    private void pintarTabla() {
        ArrayList<Corredor> listCorredors = gestion.getCorredores();
        TableModelCorredores modelo = new TableModelCorredores(listCorredors);
        jTableCorredores.setModel(modelo);
        TableRowSorter<TableModel> elQueOrdena = new TableRowSorter<>(modelo);
        jTableCorredores.setRowSorter(elQueOrdena);
    }
}
