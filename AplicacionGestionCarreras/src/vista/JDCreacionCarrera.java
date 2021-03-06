/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.GestionAplicacion;
import java.io.File;
import java.net.URL;
import java.util.ArrayList;
import java.util.Date;
import javax.help.HelpBroker;
import javax.help.HelpSet;
import javax.swing.JOptionPane;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;
import modelo.Carrera;
import modelo.CorredorParaCarrera;
import org.netbeans.validation.api.builtin.stringvalidation.StringValidators;
import org.netbeans.validation.api.ui.ValidationGroup;
import vista.tableModels.TableModelCorredorCarrera;

/**
 *
 * @author Miguel
 */
public class JDCreacionCarrera extends javax.swing.JDialog {

    private GestionAplicacion gestion;
    private Carrera carrera;

    /**
     * Creates new form JDCreacionCarrera
     *
     * @param parent
     * @param modal
     * @param gestion
     */
    public JDCreacionCarrera(java.awt.Dialog parent, boolean modal, GestionAplicacion gestion) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        this.gestion = gestion;
        ponLaAyuda();
        jBContinuar.setEnabled(false);
        registrarValidador();
        jTableCorredoresCarrera.setEnabled(false);
        jButtonAddCorredores.setEnabled(false);
        jButtonBorrarCorredores.setEnabled(false);
        jButtonComenzarCarrera.setEnabled(false);
    }

    public JDCreacionCarrera(java.awt.Dialog parent, boolean modal, GestionAplicacion gestion, Carrera carreraSeleccionada) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        this.gestion = gestion;
        this.carrera = carreraSeleccionada;
        jTLugar.setText(carrera.getLugar());
        jTFMaxParticipantes.setText(String.valueOf(carrera.getMaxCorredores()));
        jTFNombre.setText(carrera.getNombre());
        dateChooser.setDate(carrera.getFecha());
        if (carrera.isFinalizada() == true) {
            jTFMaxParticipantes.setEnabled(false);
            jTFNombre.setEnabled(false);
            jTLugar.setEnabled(false);
            dateChooser.setEnabled(false);
            jButtonComenzarCarrera.setEnabled(false);
            jButtonBorrarCorredores.setEnabled(false);
            jButtonAddCorredores.setEnabled(false);
            jBLimpiarCampos.setEnabled(false);
        }
        pintarTabla();
        registrarValidador();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTFMaxParticipantes = new javax.swing.JTextField();
        jBContinuar = new javax.swing.JButton();
        jButtonComenzarCarrera = new javax.swing.JButton();
        jLFecha = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTableCorredoresCarrera = new javax.swing.JTable();
        jTLugar = new javax.swing.JTextField();
        jTFNombre = new javax.swing.JTextField();
        jLMaxParticipantes = new javax.swing.JLabel();
        jLNombre = new javax.swing.JLabel();
        validationPanel1 = new org.netbeans.validation.api.ui.swing.ValidationPanel();
        jBLimpiarCampos = new javax.swing.JButton();
        jLTituloFormulario = new javax.swing.JLabel();
        jLLugar = new javax.swing.JLabel();
        jButtonBorrarCorredores = new javax.swing.JButton();
        jButtonAddCorredores = new javax.swing.JButton();
        dateChooser = new com.toedter.calendar.JDateChooser();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuAyuda = new javax.swing.JMenu();
        jMenuItemAyuda = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        jTFMaxParticipantes.setName("Max. participantes"); // NOI18N

        jBContinuar.setText(org.openide.util.NbBundle.getMessage(JDCreacionCarrera.class, "JDCreacionCarrera.jBContinuar.text")); // NOI18N
        jBContinuar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBContinuarActionPerformed(evt);
            }
        });

        jButtonComenzarCarrera.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jButtonComenzarCarrera.setText(org.openide.util.NbBundle.getMessage(JDCreacionCarrera.class, "JDCreacionCarrera.jButtonComenzarCarrera.text")); // NOI18N
        jButtonComenzarCarrera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonComenzarCarreraActionPerformed(evt);
            }
        });

        jLFecha.setText(org.openide.util.NbBundle.getMessage(JDCreacionCarrera.class, "JDCreacionCarrera.jLFecha.text")); // NOI18N

        jTableCorredoresCarrera.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jTableCorredoresCarrera);

        jTLugar.setName("Lugar"); // NOI18N

        jTFNombre.setName("Nombre"); // NOI18N

        jLMaxParticipantes.setText(org.openide.util.NbBundle.getMessage(JDCreacionCarrera.class, "JDCreacionCarrera.jLMaxParticipantes.text")); // NOI18N

        jLNombre.setText(org.openide.util.NbBundle.getMessage(JDCreacionCarrera.class, "JDCreacionCarrera.jLNombre.text")); // NOI18N

        jBLimpiarCampos.setText(org.openide.util.NbBundle.getMessage(JDCreacionCarrera.class, "JDCreacionCarrera.jBLimpiarCampos.text")); // NOI18N
        jBLimpiarCampos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimpiarCamposActionPerformed(evt);
            }
        });

        jLTituloFormulario.setText(org.openide.util.NbBundle.getMessage(JDCreacionCarrera.class, "JDCreacionCarrera.jLTituloFormulario.text")); // NOI18N

        jLLugar.setText(org.openide.util.NbBundle.getMessage(JDCreacionCarrera.class, "JDCreacionCarrera.jLLugar.text")); // NOI18N

        jButtonBorrarCorredores.setText(org.openide.util.NbBundle.getMessage(JDCreacionCarrera.class, "JDCreacionCarrera.jButtonBorrarCorredores.text")); // NOI18N
        jButtonBorrarCorredores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBorrarCorredoresActionPerformed(evt);
            }
        });

        jButtonAddCorredores.setText(org.openide.util.NbBundle.getMessage(JDCreacionCarrera.class, "JDCreacionCarrera.jButtonAddCorredores.text")); // NOI18N
        jButtonAddCorredores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonAddCorredoresActionPerformed(evt);
            }
        });

        dateChooser.setDateFormatString(org.openide.util.NbBundle.getMessage(JDCreacionCarrera.class, "JDCreacionCarrera.dateChooser.dateFormatString")); // NOI18N

        jMenuAyuda.setText(org.openide.util.NbBundle.getMessage(JDCreacionCarrera.class, "JDCreacionCarrera.jMenuAyuda.text")); // NOI18N

        jMenuItemAyuda.setText(org.openide.util.NbBundle.getMessage(JDCreacionCarrera.class, "JDCreacionCarrera.jMenuItemAyuda.text")); // NOI18N
        jMenuAyuda.add(jMenuItemAyuda);

        jMenuBar1.add(jMenuAyuda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLNombre)
                                    .addComponent(jLMaxParticipantes)
                                    .addComponent(jLLugar, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLFecha))
                                .addGap(38, 38, 38)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jTLugar, javax.swing.GroupLayout.DEFAULT_SIZE, 201, Short.MAX_VALUE)
                                    .addComponent(jTFNombre)
                                    .addComponent(jTFMaxParticipantes)
                                    .addComponent(dateChooser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLTituloFormulario, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(validationPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 349, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 13, Short.MAX_VALUE)))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 565, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButtonComenzarCarrera, javax.swing.GroupLayout.PREFERRED_SIZE, 362, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonAddCorredores)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButtonBorrarCorredores)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBLimpiarCampos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jBContinuar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLTituloFormulario, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(validationPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jTFNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLNombre))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLLugar)
                            .addComponent(jTLugar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLMaxParticipantes)
                            .addComponent(jTFMaxParticipantes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLFecha)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(dateChooser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBContinuar)
                    .addComponent(jBLimpiarCampos)
                    .addComponent(jButtonAddCorredores)
                    .addComponent(jButtonBorrarCorredores)
                    .addComponent(jButtonComenzarCarrera))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBContinuarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBContinuarActionPerformed

        String nombre = jTFNombre.getText();
        String lugar = jTLugar.getText();
        Date fecha = dateChooser.getDate();
        String maxParticipantes = jTFMaxParticipantes.getText();
        int max = Integer.parseInt(maxParticipantes);
        if (carrera == null) {
            Carrera carreraAux = new Carrera(nombre, fecha, lugar, max);
            gestion.addCarrera(carreraAux);
            JOptionPane.showMessageDialog(this, "Se ha añadido la carrera a la coleccion de carreras");
        } else {
            carrera.setFecha(fecha);
            carrera.setLugar(lugar);
            carrera.setMaxCorredores(max);
            carrera.setNombre(nombre);
        }
        this.dispose();

        //Date fecha = (Date)jSpinnerFecha.getValue();
    }//GEN-LAST:event_jBContinuarActionPerformed

    private void jButtonComenzarCarreraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonComenzarCarreraActionPerformed
        JDCronometro crono = new JDCronometro(this, rootPaneCheckingEnabled, gestion, carrera);
        crono.setVisible(true);
        carrera.setFinalizada(true);
        this.dispose();
    }//GEN-LAST:event_jButtonComenzarCarreraActionPerformed

    private void jBLimpiarCamposActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimpiarCamposActionPerformed
        limpiarCamposJdialog();
        JOptionPane.showMessageDialog(this, "Se han limpiado los campos de este formulario");
    }//GEN-LAST:event_jBLimpiarCamposActionPerformed

    private void jButtonBorrarCorredoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBorrarCorredoresActionPerformed
        int[] selectedRows = jTableCorredoresCarrera.getSelectedRows();
        ArrayList<CorredorParaCarrera> corredores = carrera.getCorredores();
        ArrayList<CorredorParaCarrera> corredoresParaBorrar = new ArrayList<>();
        if (selectedRows.length > 0) {
            for (int selectedRow : selectedRows) {
                CorredorParaCarrera corredor = corredores.get(selectedRow);
                corredoresParaBorrar.add(corredor);
            }
        }
        for (CorredorParaCarrera corredor : corredoresParaBorrar) {
            carrera.removeCorredor(corredor.getDorsal());
        }
        pintarTabla();
    }//GEN-LAST:event_jButtonBorrarCorredoresActionPerformed

    private void jButtonAddCorredoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonAddCorredoresActionPerformed
        JDSeleccionCorredoresCarrera dialogo = new JDSeleccionCorredoresCarrera(this, true, gestion, carrera);
        dialogo.setVisible(true);
        pintarTabla();
    }//GEN-LAST:event_jButtonAddCorredoresActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private com.toedter.calendar.JDateChooser dateChooser;
    private javax.swing.JButton jBContinuar;
    private javax.swing.JButton jBLimpiarCampos;
    private javax.swing.JButton jButtonAddCorredores;
    private javax.swing.JButton jButtonBorrarCorredores;
    private javax.swing.JButton jButtonComenzarCarrera;
    private javax.swing.JLabel jLFecha;
    private javax.swing.JLabel jLLugar;
    private javax.swing.JLabel jLMaxParticipantes;
    private javax.swing.JLabel jLNombre;
    private javax.swing.JLabel jLTituloFormulario;
    private javax.swing.JMenu jMenuAyuda;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItemAyuda;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTFMaxParticipantes;
    private javax.swing.JTextField jTFNombre;
    private javax.swing.JTextField jTLugar;
    private javax.swing.JTable jTableCorredoresCarrera;
    private org.netbeans.validation.api.ui.swing.ValidationPanel validationPanel1;
    // End of variables declaration//GEN-END:variables

    private void registrarValidador() {
        ValidationGroup group = validationPanel1.getValidationGroup();
        group.add(jTFNombre, StringValidators.REQUIRE_NON_EMPTY_STRING);
        group.add(jTLugar, StringValidators.REQUIRE_NON_EMPTY_STRING);
        group.add(jTFMaxParticipantes, StringValidators.REQUIRE_NON_EMPTY_STRING, StringValidators.REQUIRE_VALID_INTEGER);

        validationPanel1.addChangeListener(new ChangeListener() {
            @Override
            public void stateChanged(ChangeEvent e) {
                if (validationPanel1.getProblem() == null) {
                    jBContinuar.setEnabled(true);
                } else {
                    jBContinuar.setEnabled(false);
                }
            }
        });
    }

    private void pintarTabla() {
        ArrayList<CorredorParaCarrera> corredores = carrera.getCorredores();
        TableModelCorredorCarrera modelo = new TableModelCorredorCarrera(corredores);
        jTableCorredoresCarrera.setModel(modelo);
        TableRowSorter<TableModel> elQueOrdena = new TableRowSorter<>(modelo);
        jTableCorredoresCarrera.setRowSorter(elQueOrdena);
    }

    private void limpiarCamposJdialog() {
        jTLugar.setText("");
        jTFMaxParticipantes.setText("");
        jTFNombre.setText("");
        dateChooser.setDate(new Date());
    }

    private void ponLaAyuda() {
        try {
            // Carga el fichero de ayuda
            File fichero = new File("help" + File.separator + "help_set.hs");
            URL hsURL = fichero.toURI().toURL();

            // Crea el HelpSet y el HelpBroker
            HelpSet helpset = new HelpSet(getClass().getClassLoader(), hsURL);
            HelpBroker hb = helpset.createHelpBroker();

            // Pone ayuda a item de menu al pulsarlo y a F1 en ventana
            // principal y secundaria.
            hb.enableHelpOnButton(jMenuItemAyuda, "ventana_creacioncarreras", helpset);
            hb.enableHelpKey(getRootPane(), "ventana_creacioncarreras", helpset);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
