/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author pedrowarmlingbotelho
 */
public abstract class PadraoCadastro extends javax.swing.JInternalFrame implements ActionListener {

    /**
     * Creates new form FormPadrao
     */
    public PadraoCadastro() {
        initComponents();
        bConfirmar.addActionListener(this);
        bCancelar.addActionListener(this);
        bLimpar.addActionListener(this);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel2 = new javax.swing.JPanel();
        bConfirmar = new javax.swing.JButton();
        bCancelar = new javax.swing.JButton();
        bLimpar = new javax.swing.JButton();
        a = new javax.swing.JButton();

        bConfirmar.setText("Confirmar");

        bCancelar.setText("Cancelar");

        bLimpar.setText("Limpar");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(bConfirmar)
                .addGap(49, 49, 49)
                .addComponent(bCancelar)
                .addGap(50, 50, 50)
                .addComponent(bLimpar)
                .addContainerGap(46, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(a, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(135, 135, 135))
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {bCancelar, bConfirmar, bLimpar});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(a, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bConfirmar)
                    .addComponent(bCancelar)
                    .addComponent(bLimpar))
                .addGap(31, 31, 31))
        );

        getContentPane().add(jPanel2, java.awt.BorderLayout.SOUTH);

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton a;
    private javax.swing.JButton bCancelar;
    public javax.swing.JButton bConfirmar;
    private javax.swing.JButton bLimpar;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables

    @Override
    public void actionPerformed(ActionEvent e) {
        switch(e.getActionCommand()){
            case "Confirmar":
                bConfirmarActionPerformed(e);
                break;
            case "Limpar":
                bLimparActionPerformed(e);
                break;
            case "Cancelar":
                bCancelarActionPerformed(e);
                break;
        }
    }
    public abstract void bConfirmarActionPerformed(ActionEvent ae);
    public abstract void bLimparActionPerformed(ActionEvent ae);
    public abstract void bCancelarActionPerformed(ActionEvent ae);
}
