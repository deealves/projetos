/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.map.projeto_produtos.gui;

import br.com.map.projeto_produtos.dao.ProdutoDao;
import br.com.map.projeto_produtos.model.Produto;
import br.com.map.projeto_produtos.util.MensagensUtil;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author Dennys Alves
 */
public class ProdutoJFrame extends javax.swing.JFrame {

    private ProdutoDao dao ;
    private ProdutosJframe parent ;
    private Produto produto ;
     
    
    public ProdutoJFrame(ProdutosJframe parent, Produto produto) {
        this.parent = parent; 
        this.produto = produto;
        this.dao = new ProdutoDao();
        initComponents();
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        preencherCampos();
    }

     private void preencherCampos(){
     
         if(produto!= null){
             LabelTitulo.setText(MensagensUtil.getString(MensagensUtil.MSG_LABEL_EDITAR_TITULO));
             this.TextNome.setText(produto.getNome_produto());
             this.TextValor.setText(String.valueOf(produto.getPreco_produto()));
             this.TextMarca.setText(produto.getEspecificacao().getMarca());
             this.TextSO.setText(produto.getEspecificacao().getSistemaOpe());
             this.TextCor.setText(produto.getEspecificacao().getCor());
             this.TextDetalhes.setText(produto.getEspecificacao().getDetalhes());
         }
         else
             LabelTitulo.setText(MensagensUtil.getString(MensagensUtil.MSG_LABEL_NOVO_TITULO));
             LabelNome.setText(MensagensUtil.getString(MensagensUtil.MSG_LABEL_NOME));
             LabelValor.setText(MensagensUtil.getString(MensagensUtil.MSG_LABEL_PRECO));
             LabelMarca.setText(MensagensUtil.getString(MensagensUtil.MSG_TABELA_MARCA));
             LabelCor.setText(MensagensUtil.getString(MensagensUtil.MSG_TABELA_COR));
             LabelDetalhes.setText(MensagensUtil.getString(MensagensUtil.MSG_TABELA_DETALHES));        
                     
                     
     }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LabelTitulo = new javax.swing.JLabel();
        LabelNome = new javax.swing.JLabel();
        TextNome = new javax.swing.JTextField();
        LabelValor = new javax.swing.JLabel();
        TextValor = new javax.swing.JTextField();
        ButtonSalvar = new javax.swing.JButton();
        ButtonCancelar = new javax.swing.JButton();
        LabelMarca = new javax.swing.JLabel();
        TextMarca = new javax.swing.JTextField();
        LabelSO = new javax.swing.JLabel();
        TextSO = new javax.swing.JTextField();
        LabelCor = new javax.swing.JLabel();
        TextCor = new javax.swing.JTextField();
        LabelDetalhes = new javax.swing.JLabel();
        TextDetalhes = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        LabelTitulo.setFont(new java.awt.Font("Verdana", 1, 18)); // NOI18N
        LabelTitulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelTitulo.setText("CADASTRAR PRODUTO");

        LabelNome.setText("NOME");

        TextNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextNomeActionPerformed(evt);
            }
        });

        LabelValor.setText("VALOR");

        TextValor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextValorActionPerformed(evt);
            }
        });

        ButtonSalvar.setBackground(new java.awt.Color(51, 51, 255));
        ButtonSalvar.setText("SALVAR");
        ButtonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSalvarActionPerformed(evt);
            }
        });

        ButtonCancelar.setBackground(new java.awt.Color(255, 51, 51));
        ButtonCancelar.setText("CANCELAR");
        ButtonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCancelarActionPerformed(evt);
            }
        });

        LabelMarca.setText("MARCA");

        LabelSO.setText("SISTEMA OPERACIONAL");

        LabelCor.setText("COR");

        LabelDetalhes.setText("DETALHES");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(TextNome, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(LabelDetalhes)
                        .addComponent(LabelCor)
                        .addComponent(LabelValor)
                        .addComponent(LabelMarca)
                        .addComponent(LabelSO)
                        .addComponent(LabelNome)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(ButtonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(36, 36, 36)
                                    .addComponent(ButtonCancelar))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(TextValor, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TextCor, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TextMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TextSO, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(TextDetalhes, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                .addContainerGap(27, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LabelTitulo)
                .addGap(83, 83, 83))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(LabelTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LabelNome)
                .addGap(18, 18, 18)
                .addComponent(TextNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LabelValor, javax.swing.GroupLayout.PREFERRED_SIZE, 9, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(TextValor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LabelMarca)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LabelSO)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextSO, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LabelCor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextCor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LabelDetalhes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TextDetalhes)
                .addGap(45, 45, 45)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCancelarActionPerformed

        this.dispose();
    }//GEN-LAST:event_ButtonCancelarActionPerformed

    private void ButtonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSalvarActionPerformed
        // TODO add your handling code here:
         try {
             
             if(produto!=null){
                   
                 produto.setNome_produto(TextNome.getText());
                 produto.setPreco_produto(Float.parseFloat(TextValor.getText()));
                 produto.getEspecificacao().setMarca(TextMarca.getText());
                 produto.getEspecificacao().setSistemaOpe(TextSO.getText());
                 produto.getEspecificacao().setCor(TextCor.getText());
                 produto.getEspecificacao().setDetalhes(TextDetalhes.getText());
                 
                 dao.editar(produto);
             }
             else{    
             
                Produto prod = new Produto();
        
                 prod.setNome_produto(TextNome.getText());
                 prod.setPreco_produto(Float.parseFloat(TextValor.getText()));
                 prod.getEspecificacao().setMarca(TextMarca.getText());
                 prod.getEspecificacao().setSistemaOpe(TextSO.getText());
                 prod.getEspecificacao().setCor(TextCor.getText());
                 prod.getEspecificacao().setDetalhes(TextDetalhes.getText());
        
       
        dao.inserir(prod);
             }
        } catch (SQLException ex) {
            JOptionPane.showInputDialog(this, "erro" +ex.getMessage());
        }
        
        parent.preencherTabela(null);
        
        dispose();
    }//GEN-LAST:event_ButtonSalvarActionPerformed

    private void TextNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextNomeActionPerformed

    private void TextValorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextValorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextValorActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonCancelar;
    private javax.swing.JButton ButtonSalvar;
    private javax.swing.JLabel LabelCor;
    private javax.swing.JLabel LabelDetalhes;
    private javax.swing.JLabel LabelMarca;
    private javax.swing.JLabel LabelNome;
    private javax.swing.JLabel LabelSO;
    private javax.swing.JLabel LabelTitulo;
    private javax.swing.JLabel LabelValor;
    private javax.swing.JTextField TextCor;
    private javax.swing.JTextField TextDetalhes;
    private javax.swing.JTextField TextMarca;
    private javax.swing.JTextField TextNome;
    private javax.swing.JTextField TextSO;
    private javax.swing.JTextField TextValor;
    // End of variables declaration//GEN-END:variables
}
