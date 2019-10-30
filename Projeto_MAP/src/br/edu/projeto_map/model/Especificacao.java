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
public class Especificacao {
    private String fabricante;
    private String cor;
    private String sistemas;
    private int id;
    private String detalhes;

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getSistemas() {
        return sistemas;
    }

    public void setSistemas(String sistemas) {
        this.sistemas = sistemas;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDetalhes() {
        return detalhes;
    }

    public void setDetalhes(String detalhes) {
        this.detalhes = detalhes;
    }
    
     @Override
    public String toString() {
         StringBuilder sb = new StringBuilder();
         sb.append(id).append("  //  ").append(fabricante).append("  //  ").append(sistemas).append("  //  ").append(cor).append("// ").append(detalhes);
        return sb.toString();
    }
}
