/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.map.projeto_produtos.gui;

import br.com.map.projeto_produtos.dao.ProdutoDao;
import br.com.map.projeto_produtos.model.Produto;
import java.sql.SQLException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Dennys Alves
 */
public class ProdutosJframe extends javax.swing.JFrame {

     private ProdutoDao dao;
     private Produto produtoSelecionado;
    
    public ProdutosJframe()  {
       
        this.setTitle("Produtos");
        dao = new ProdutoDao();
        initComponents();
        preencherTabela(null);
        
    }
    public void preencherTabela( List<Produto> lista) 
    {
       try{
        List<Produto> produtos = (lista == null) ? dao.listar() : lista ;
        
        DefaultTableModel model = new DefaultTableModel();
        
        model.setColumnCount(7);
        model.setColumnIdentifiers(new String[]{"Código", "Nome", "Valor", "Marca", "Sist. Ope.", "Cor", "Detalhes"});
        model.setRowCount(produtos.size());
        
        for( int i = 0; i < produtos.size(); i++){
            
            Produto p = produtos.get(i);
            
            model.setValueAt(p.getCodigo(), i, 0);
            model.setValueAt(p.getNome_produto(), i, 1);
            model.setValueAt(p.getPreco_produto(), i, 2);
            model.setValueAt(p.getEspecificacao().getMarca(), i, 3);
            model.setValueAt(p.getEspecificacao().getSistemaOpe(), i, 4);
            model.setValueAt(p.getEspecificacao().getCor(), i, 5);
            model.setValueAt(p.getEspecificacao().getDetalhes(), i, 6);
            
        }
        TableProdutos.setModel(model);
        
        
    }
       catch(Exception ex){
           ex.printStackTrace();
           JOptionPane.showMessageDialog(this, "Erro:" + ex.getMessage());
       
       }
       
    }   

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LabelProdutos = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableProdutos = new javax.swing.JTable();
        ButtonNovo = new javax.swing.JButton();
        ButtonEditar = new javax.swing.JButton();
        ButtonExcluir = new javax.swing.JButton();
        ButtonSair = new javax.swing.JButton();
        TextBuscar = new javax.swing.JTextField();
        LabelBuscar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        LabelProdutos.setFont(new java.awt.Font("Laksaman", 1, 18)); // NOI18N
        LabelProdutos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        LabelProdutos.setText("PRODUTOS");
        LabelProdutos.setToolTipText("");

        TableProdutos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "PRODUTO", "PREÇO", "MARCA", "DETALHES"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Float.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        TableProdutos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableProdutosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TableProdutos);

        ButtonNovo.setText("CADASTRAR");
        ButtonNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonNovoActionPerformed(evt);
            }
        });

        ButtonEditar.setText("EDITAR");
        ButtonEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonEditarActionPerformed(evt);
            }
        });

        ButtonExcluir.setText("EXCLUIR");
        ButtonExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonExcluirActionPerformed(evt);
            }
        });

        ButtonSair.setText("SAIR");
        ButtonSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSairActionPerformed(evt);
            }
        });

        TextBuscar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                TextBuscarKeyReleased(evt);
            }
        });

        LabelBuscar.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        LabelBuscar.setText("Buscar :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(211, Short.MAX_VALUE)
                .addComponent(LabelProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(212, 212, 212))
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(ButtonEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(LabelBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ButtonExcluir, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ButtonNovo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 419, Short.MAX_VALUE)
                    .addComponent(TextBuscar)
                    .addComponent(ButtonSair, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(LabelProdutos, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TextBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ButtonNovo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ButtonEditar)
                        .addGap(35, 35, 35)
                        .addComponent(ButtonExcluir))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(ButtonSair)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSairActionPerformed

        this.dispose();
    }//GEN-LAST:event_ButtonSairActionPerformed

    private void ButtonNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonNovoActionPerformed

        ProdutoJFrame janela = new ProdutoJFrame(this, null);
        janela.setVisible(true);
    }//GEN-LAST:event_ButtonNovoActionPerformed

    private void TextBuscarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_TextBuscarKeyReleased
         try {
             String busca= TextBuscar.getText();
             List<Produto> produtos = dao.buscar(busca);
             
             preencherTabela( produtos);
         } catch (SQLException ex) {
             JOptionPane.showMessageDialog(this, "Erro"+ex.getMessage(), "Erro", JOptionPane.ERROR_MESSAGE);
         }
    }//GEN-LAST:event_TextBuscarKeyReleased

    private void TableProdutosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TableProdutosMouseClicked
         try {
        JTable TableProdutos = (JTable) evt.getSource();
        int linha = TableProdutos.rowAtPoint(evt.getPoint());
        int codigo = (int) TableProdutos.getModel().getValueAt(linha, 0);
        
        
             produtoSelecionado = dao.buscarPorCodigo(codigo);
             
         } catch (SQLException ex) {
             JOptionPane.showMessageDialog(this, "erro: "+ex.getMessage());
         }
        
        
    }//GEN-LAST:event_TableProdutosMouseClicked

    private void ButtonExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonExcluirActionPerformed
        try {       
        if (produtoSelecionado!=null){
           int op = JOptionPane.showConfirmDialog(this, "Excluir "+ produtoSelecionado.getNome_produto()+ "?", "Excluir", JOptionPane.OK_CANCEL_OPTION);
           if(op == JOptionPane.OK_OPTION)
               dao.excluir(produtoSelecionado);
           produtoSelecionado = null;
           preencherTabela(null);
           }
        } catch (SQLException ex) {
               JOptionPane.showMessageDialog(this, "erro: "+ex.getMessage());
        }        
    }//GEN-LAST:event_ButtonExcluirActionPerformed

    private void ButtonEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonEditarActionPerformed
        
        if(produtoSelecionado!=null){
            ProdutoJFrame janela = new ProdutoJFrame(this, produtoSelecionado);
            janela.setVisible(true);
            
        }
    }//GEN-LAST:event_ButtonEditarActionPerformed

  
    public static void main(String args[]) {

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                 new ProdutosJframe().setVisible(true);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonEditar;
    private javax.swing.JButton ButtonExcluir;
    private javax.swing.JButton ButtonNovo;
    private javax.swing.JButton ButtonSair;
    private javax.swing.JLabel LabelBuscar;
    private javax.swing.JLabel LabelProdutos;
    private javax.swing.JTable TableProdutos;
    private javax.swing.JTextField TextBuscar;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
