/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.projeto_map.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Dennys
 */
public class ConnectionFactory {
    private static final String URL = "jdbc:postgresql://localhost:5432/Projeto_Map";
    private static final String USUARIO = "postgres";
    private static final String SENHA = "admin";
    
    public static Connection getConnection(){
        try {
            return DriverManager.getConnection(URL, USUARIO, SENHA);
        } catch (SQLException ex) {
            System.out.println("Erro: " + ex.getMessage());
            return null;
        }
    }
}
