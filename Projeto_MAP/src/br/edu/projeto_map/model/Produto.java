/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.projeto_map.model;

/**
 *
 * @author Dennys
 */
public class Produto {
    private String nome;
    private float preco;
    private int id;
    private Especificacao especificacao;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Especificacao getEspecificacao() {
        return especificacao;
    }

    public void setEspecificacao(Especificacao especificacao) {
        this.especificacao = especificacao;
    }
    
    @Override
    public String toString() {
        
        StringBuilder sb = new StringBuilder();
        sb.append(nome).append(" -- ").append(preco).append(" -- ").append(id).append("  ---- ").append(especificacao).append(" -- ");
        return sb.toString();
    }
}
