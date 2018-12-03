/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cronometro;

import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author Miguel
 */
public class Cronometro extends javax.swing.JPanel {

    private int minutos;
    private int segundos;
    private int milisegundos;
    private Timer timer;

    /**
     * Creates new form Cronometro
     */
    public Cronometro() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLCronometroTexto = new javax.swing.JLabel();
        jBIniciar = new javax.swing.JButton();
        jBFinalizar = new javax.swing.JButton();
        jBReiniciar = new javax.swing.JButton();

        jLCronometroTexto.setFont(new java.awt.Font("Dialog", 1, 36)); // NOI18N
        jLCronometroTexto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLCronometroTexto.setText("00:00:000");
        jLCronometroTexto.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        jBIniciar.setText("Iniciar cronometro");
        jBIniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBIniciarActionPerformed(evt);
            }
        });

        jBFinalizar.setText("Parar cronometro");
        jBFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBFinalizarActionPerformed(evt);
            }
        });

        jBReiniciar.setText("Reiniciar");
        jBReiniciar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBReiniciarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLCronometroTexto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jBIniciar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBReiniciar, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jBFinalizar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLCronometroTexto, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBIniciar)
                    .addComponent(jBFinalizar)
                    .addComponent(jBReiniciar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jBIniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBIniciarActionPerformed
        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                milisegundos++;
                if (milisegundos == 100) {
                    segundos++;
                    milisegundos = 0;
                }
                if (segundos == 60) {
                    minutos++;
                    segundos = 0;
                }
                jLCronometroTexto.setText(minutos + ":" + segundos + ":" + milisegundos);
            }
        }, 0, 10);
    }//GEN-LAST:event_jBIniciarActionPerformed

    private void jBFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBFinalizarActionPerformed
        timer.cancel();
    }//GEN-LAST:event_jBFinalizarActionPerformed

    private void jBReiniciarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBReiniciarActionPerformed
        timer.cancel();
        milisegundos = 0;
        segundos = 0;
        minutos = 0;
        jLCronometroTexto.setText(minutos + ":" + segundos + ":" + milisegundos);
    }//GEN-LAST:event_jBReiniciarActionPerformed

    public String getTiempo() {
        String tiempo = minutos + ":" + segundos + ":" + milisegundos;
        return tiempo;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBFinalizar;
    private javax.swing.JButton jBIniciar;
    private javax.swing.JButton jBReiniciar;
    private javax.swing.JLabel jLCronometroTexto;
    // End of variables declaration//GEN-END:variables
}