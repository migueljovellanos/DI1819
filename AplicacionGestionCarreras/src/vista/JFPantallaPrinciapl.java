/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.GestionAplicacion;
import java.awt.Font;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Locale;
import java.util.Timer;
import java.util.TimerTask;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.help.HelpBroker;
import javax.help.HelpSet;
import javax.swing.ImageIcon;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import mdlaf.MaterialLookAndFeel;
import mdlaf.utils.MaterialColors;

/**
 *
 * @author Miguel
 */
public class JFPantallaPrinciapl extends javax.swing.JFrame {

    private GestionAplicacion gestion;
    private int minutos = 2;

    /**
     * Creates new form JFPantallaPrinciapl
     */
    public JFPantallaPrinciapl() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.gestion = new GestionAplicacion();
        ponLaAyuda();
        try {
            UIManager.setLookAndFeel(new MaterialLookAndFeel());
            UIManager.put("Button.background", MaterialColors.BLUE_GRAY_500);
            UIManager.put("Button.foreground", MaterialColors.WHITE);
            SwingUtilities.updateComponentTreeUI(this);
        } catch (UnsupportedLookAndFeelException ex) {
            Logger.getLogger(JFPantallaPrinciapl.class.getName()).log(Level.SEVERE, null, ex);
        }

        Font font = new Font("Dialog", Font.BOLD, 50);
        jLabelTituloAplicacion.setFont(font);
        
        this.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                gestion.GuardarCsvCarreras();
                gestion.GuardarCsvCorredores();
                try {
                    gestion.grabar();
                } catch (IOException ex) {
                    Logger.getLogger(JFPantallaPrinciapl.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        });
        Timer timer = new Timer();
        TimerTask myTask = new TimerTask() {
            @Override
            public void run() {

                try {
                    gestion.grabar();
                } catch (IOException ex) {
                    Logger.getLogger(JFPantallaPrinciapl.class.getName()).log(Level.SEVERE, null, ex);
                }

            }
        };

        timer.schedule(myTask, 0, minutos * 60000);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPPantallaPrincipal = new javax.swing.JPanel();
        jLabelTituloAplicacion = new javax.swing.JLabel();
        jButtonGestionCorredores = new javax.swing.JButton();
        jButtonGestionCarreras = new javax.swing.JButton();
        jLabelImg = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuAyuda = new javax.swing.JMenu();
        jMenuItemAyuda = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPPantallaPrincipal.setToolTipText("");

        jLabelTituloAplicacion.setFont(new java.awt.Font("Dialog", 2, 36)); // NOI18N
        jLabelTituloAplicacion.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelTituloAplicacion.setText("Gestion careras");

        jButtonGestionCorredores.setText("Gestionar Corredores");
        jButtonGestionCorredores.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGestionCorredoresActionPerformed(evt);
            }
        });

        jButtonGestionCarreras.setText("Gestionar Carreras");
        jButtonGestionCarreras.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonGestionCarrerasActionPerformed(evt);
            }
        });

        jLabelImg.setIcon(new javax.swing.ImageIcon(getClass().getResource("/archivos/OQ5DCB0.jpg"))); // NOI18N

        javax.swing.GroupLayout jPPantallaPrincipalLayout = new javax.swing.GroupLayout(jPPantallaPrincipal);
        jPPantallaPrincipal.setLayout(jPPantallaPrincipalLayout);
        jPPantallaPrincipalLayout.setHorizontalGroup(
            jPPantallaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPPantallaPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelTituloAplicacion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(jPPantallaPrincipalLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPPantallaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButtonGestionCarreras, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonGestionCorredores, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 114, Short.MAX_VALUE)
                .addComponent(jLabelImg)
                .addGap(48, 48, 48))
        );
        jPPantallaPrincipalLayout.setVerticalGroup(
            jPPantallaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPPantallaPrincipalLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jLabelTituloAplicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(jPPantallaPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPPantallaPrincipalLayout.createSequentialGroup()
                        .addComponent(jButtonGestionCarreras, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(jButtonGestionCorredores, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabelImg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jMenuAyuda.setText("Ayuda");

        jMenuItemAyuda.setText("mostrar ayuda");
        jMenuAyuda.add(jMenuItemAyuda);

        jMenuBar1.add(jMenuAyuda);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPPantallaPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPPantallaPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButtonGestionCorredoresActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGestionCorredoresActionPerformed
        JDCorredores dialogCorredores = new JDCorredores(this, rootPaneCheckingEnabled, gestion);
        dialogCorredores.setVisible(true);
    }//GEN-LAST:event_jButtonGestionCorredoresActionPerformed

    private void jButtonGestionCarrerasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonGestionCarrerasActionPerformed
        JDCarreras dialogCarreras = new JDCarreras(this, rootPaneCheckingEnabled, gestion);
        dialogCarreras.setVisible(true);
    }//GEN-LAST:event_jButtonGestionCarrerasActionPerformed

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
            java.util.logging.Logger.getLogger(JFPantallaPrinciapl.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFPantallaPrinciapl.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFPantallaPrinciapl.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFPantallaPrinciapl.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                Locale.setDefault(new Locale("es", "ES"));
                new JFPantallaPrinciapl().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonGestionCarreras;
    private javax.swing.JButton jButtonGestionCorredores;
    private javax.swing.JLabel jLabelImg;
    private javax.swing.JLabel jLabelTituloAplicacion;
    private javax.swing.JMenu jMenuAyuda;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItemAyuda;
    private javax.swing.JPanel jPPantallaPrincipal;
    // End of variables declaration//GEN-END:variables

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
            hb.enableHelpOnButton(jMenuItemAyuda, "aplicacion", helpset);
            hb.enableHelpKey(jButtonGestionCarreras, "ventana_carreras", helpset);
            hb.enableHelpKey(jButtonGestionCorredores, "ventana_corredores", helpset);
            hb.enableHelpKey(getRootPane(), "aplicacion", helpset);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
