/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.projeto_map.dao;

import br.edu.projeto_map.model.Produto;
import br.edu.projeto_map.util.ConnectionFactory;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Dennys
 */
public class ProdutoDAO {
      private Connection con;
    private PreparedStatement st;
    private String sql;
    
    public void inserir(Produto produto) throws SQLException{
        // inserir caracteristica
        sql = "insert into caracteristicas (marca, sistema_operacional, cor) values(?, ?, ?)";
        
        con = ConnectionFactory.getConnection();
        
        // avisa que retornará  a chave primaria gerada, que será usada como chave estrangeira na tabela produto
        st = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
                        
        st.setString(1, produto.getEspecificacao().getFabricante());
        st.setString(2, produto.getEspecificacao().getSistemas());
        st.setString(3, produto.getEspecificacao().getCor());
        
        st.executeUpdate();
        
        // recuperar a chave primaria(codigo) gerado
        ResultSet rs = st.getGeneratedKeys();
        int codigoEsp = 0;
        if(rs.next())
            codigoEsp = rs.getInt(1);
                        
        System.out.println(st);
        
        //inserir produto
        sql = "insert into produtos (nome_produto , preco_produto, codigo_caract) values(?, ?, ?)";
        
        con = ConnectionFactory.getConnection();
        
        st = con.prepareStatement(sql);
                        
        st.setString(1, produto.getNome());
        st.setFloat(2, produto.getPreco());
        st.setInt(3, codigoEsp);
                        
        st.executeUpdate();
                        
        System.out.println(st);
        con.close();
    }
    public void editar(Produto produto) throws SQLException{
        sql = "update produtos set nome_produto = ?, preco_produto = ? where codigo = ?";
               // + "select c.*, e.*  "
               // + "from clientes c, enderecos e "
               // + "where c.codigo_endereco = e.codigo";
        con = ConnectionFactory.getConnection();
        st = con.prepareStatement(sql);
        st.setString(1, produto.getNome());
        st.setFloat(2, produto.getPreco());
        st.setInt(3, produto.getId());
        st.executeUpdate();
        
        sql = "update caracteristicas set marca = ?, sistema_operacional = ?, cor = ?, detalhes = ? where codigo_caract = ?";
        st = con.prepareStatement(sql);
        st.setString(1, produto.getEspecificacao().getFabricante());
        st.setString(2, produto.getEspecificacao().getSistemas());
        st.setString(3, produto.getEspecificacao().getCor());
        st.setString(4, produto.getEspecificacao().getDetalhes());
        st.setInt(5, produto.getEspecificacao().getId());
        st.executeUpdate();
        
        con.close();

    }
    public List<Produto> listar() throws SQLException{
        sql="select p.*, c.* "
                + "from produtos p , caracteristicas c "
                + "where p.codigo_caract = c.codigo_caract";
        con= ConnectionFactory.getConnection();
        st = con.prepareStatement(sql);
        ResultSet rs =  st.executeQuery();
        List<Produto> list = null;
        while(rs.next()){
            list = new ArrayList<>();
            int codigo = rs.getInt("codigo");
            String nome = rs.getString(2);
            float preco = rs.getFloat(3);
            int codigo_espec = rs.getInt(4);
            String fabricante = rs.getString(6);
            String sistemas = rs.getString(7);
            String cor = rs.getString("cor");
            String detalhes = rs.getString(9);
            
            Produto p = new Produto();
            p.setId(codigo);
            p.setNome(nome);
            p.setPreco(preco);
            p.getEspecificacao().setId(codigo_espec);
            p.getEspecificacao().setFabricante(fabricante);
            p.getEspecificacao().setSistemas(sistemas);
            p.getEspecificacao().setCor(cor);
            p.getEspecificacao().setDetalhes(detalhes);
            list.add(p);
        }
        con.close();
        return list;
    }
    
    public Produto buscarPorCodigo(int codigo) throws SQLException{
       sql= "select p.*, c.* "
                + "from produtos p , caracteristicas c "
                + "where p.codigo_caract = c.codigo_caract "
                + "and p.codigo = ?";
       con = ConnectionFactory.getConnection();
       st = con.prepareStatement(sql);
       st.setInt(1, codigo);
      
       ResultSet rs = st.executeQuery();
       Produto p = null;
       if(rs.next()){
            
            String nome = rs.getString(2);
            float preco = rs.getFloat(3);
            int codigo_espec = rs.getInt(4);
            String fabricante = rs.getString(6);
            String sistemas = rs.getString(7);
            String cor = rs.getString("cor");
            String detalhes = rs.getString(9);
           
            p = new Produto();
            p.setId(codigo);
            p.setNome(nome);
            p.setPreco(preco);
            p.getEspecificacao().setId(codigo_espec);
            p.getEspecificacao().setFabricante(fabricante);
            p.getEspecificacao().setSistemas(sistemas);
            p.getEspecificacao().setCor(cor);
            p.getEspecificacao().setDetalhes(detalhes);
            
       }
       con.close();
       return p;
       
    }
    
    public void excluir(Produto produto) throws SQLException
    {
        sql = "delete from produtos where codigo = ?";
        con =  ConnectionFactory.getConnection();
        st = con.prepareStatement(sql);
        st.setInt(1, produto.getId());
        st.executeUpdate();
        
        sql = "delete from caracteristicas where codigo_caract = ?";
        st = con.prepareStatement(sql);
        st.setInt(1, produto.getEspecificacao().getId());
        st.executeUpdate();
        
        con.close();
    }
}
