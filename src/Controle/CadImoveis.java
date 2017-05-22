/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controle;

/**
 *
 * @author pedrowarmlingbotelho
 */
public class CadImoveis extends FormPadrao {

    /**
     * Creates new form CadImoveis
     */
    public CadImoveis() {
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

        painelC = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        tId = new javax.swing.JTextField();
        lId = new javax.swing.JLabel();
        tTamanho = new javax.swing.JTextField();
        lTamanho = new javax.swing.JLabel();
        lQuartos = new javax.swing.JLabel();
        tQuartos = new javax.swing.JTextField();
        lBanheiros = new javax.swing.JLabel();
        tBanheiros = new javax.swing.JTextField();
        tValor = new javax.swing.JTextField();
        lValor = new javax.swing.JLabel();
        lCEP = new javax.swing.JLabel();
        tfCEP = new javax.swing.JFormattedTextField();
        lEndereco = new javax.swing.JLabel();
        tEndereco = new javax.swing.JTextField();
        lCidade = new javax.swing.JLabel();
        tCidade = new javax.swing.JTextField();
        cbEstado = new javax.swing.JComboBox<>();
        lUF = new javax.swing.JLabel();

        setName("Cadastro de Imóveis"); // NOI18N

        jLabel1.setText("Tipo do Imóvel:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Casa", "Apartamento", "Terreno", "Comercial" }));

        lId.setText("Identificação:");

        lTamanho.setText("Tamanho:");

        lQuartos.setText("Qtd. Quartos:");

        lBanheiros.setText("Qtd. Banheiros:");

        lValor.setText("Valor:");

        lCEP.setText("CEP:");

        try {
            tfCEP.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        lEndereco.setText("Endereço:");

        lCidade.setText("Cidade:");

        cbEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AC", "AL", "AM", "AP", "BA", "CE", "DF", "ES", "GO", "MA", "MG", "MS", "MT", "PA", "PB", "PE", "PI", "PR", "RJ", "RN", "RO", "RR", "RS", "SE", "SP", "TO" }));
        cbEstado.setSelectedIndex(17);

        lUF.setText("UF:");

        javax.swing.GroupLayout painelCLayout = new javax.swing.GroupLayout(painelC);
        painelC.setLayout(painelCLayout);
        painelCLayout.setHorizontalGroup(
            painelCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelCLayout.createSequentialGroup()
                .addGroup(painelCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(painelCLayout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addGroup(painelCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(lId))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(painelCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tTamanho, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(painelCLayout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addGroup(painelCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lCidade)
                            .addComponent(lTamanho)
                            .addComponent(lQuartos)
                            .addComponent(lValor))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(painelCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tId, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(painelCLayout.createSequentialGroup()
                                .addGroup(painelCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(painelCLayout.createSequentialGroup()
                                        .addComponent(tBanheiros, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(lBanheiros)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tQuartos, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(painelCLayout.createSequentialGroup()
                                        .addComponent(tCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(51, 51, 51)
                                        .addComponent(lUF)))
                                .addGap(18, 18, 18)
                                .addComponent(cbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(tValor, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(painelCLayout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addGroup(painelCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lCEP)
                            .addComponent(lEndereco))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(painelCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(tEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 378, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(tfCEP, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(117, Short.MAX_VALUE))
        );
        painelCLayout.setVerticalGroup(
            painelCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelCLayout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(painelCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(painelCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lId)
                    .addComponent(tTamanho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addGroup(painelCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfCEP, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lCEP))
                .addGap(8, 8, 8)
                .addGroup(painelCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lEndereco)
                    .addComponent(tEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(painelCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lUF)
                    .addComponent(cbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lCidade))
                .addGap(18, 18, 18)
                .addGroup(painelCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lTamanho)
                    .addComponent(tId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(painelCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lQuartos)
                    .addComponent(tBanheiros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lBanheiros)
                    .addComponent(tQuartos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(painelCLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lValor)
                    .addComponent(tValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 64, Short.MAX_VALUE))
        );

        getContentPane().add(painelC, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbEstado;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lBanheiros;
    private javax.swing.JLabel lCEP;
    private javax.swing.JLabel lCidade;
    private javax.swing.JLabel lEndereco;
    private javax.swing.JLabel lId;
    private javax.swing.JLabel lQuartos;
    private javax.swing.JLabel lTamanho;
    private javax.swing.JLabel lUF;
    private javax.swing.JLabel lValor;
    private javax.swing.JPanel painelC;
    private javax.swing.JTextField tBanheiros;
    private javax.swing.JTextField tCidade;
    private javax.swing.JTextField tEndereco;
    private javax.swing.JTextField tId;
    private javax.swing.JTextField tQuartos;
    private javax.swing.JTextField tTamanho;
    private javax.swing.JTextField tValor;
    private javax.swing.JFormattedTextField tfCEP;
    // End of variables declaration//GEN-END:variables
}
