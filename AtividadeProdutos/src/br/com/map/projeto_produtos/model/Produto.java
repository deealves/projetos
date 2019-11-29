/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.map.projeto_produtos.model;

/**
 *
 * @author Dennys Alves
 */
public class Produto {
    
    private String nome_produto;
    private double preco_produto;
    private int codigo;
    private Especificacao especificacao;

    public Produto() {
        especificacao = new Especificacao();
    }

    public Especificacao getEspecificacao() {
        return especificacao;
    }

    public void setEspecificacao(Especificacao especificacao) {
        this.especificacao = especificacao;
    }
    
    public String getDetalhes() {
        return especificacao.getDetalhes();
    }
    
      public String getMarca() {
        return especificacao.getMarca();
    }
      
      public String getSistemaOpe() {
        return especificacao.getSistemaOpe();
    }
      public String getCor() {
        return especificacao.getCor();
    }
      
    public String getNome_produto() {
        return nome_produto;
    }

    public void setNome_produto(String nome_produto) {
        this.nome_produto = nome_produto;
    }

    public double getPreco_produto() {
        return preco_produto;
    }

    public void setPreco_produto(double preco_produto) {
        this.preco_produto = preco_produto;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        
        StringBuilder sb = new StringBuilder();
        sb.append(nome_produto).append(" -- ").append(preco_produto).append(" -- ").append(codigo).append("  ---- ").append(especificacao).append(" -- ");
        return sb.toString();
    }
}
