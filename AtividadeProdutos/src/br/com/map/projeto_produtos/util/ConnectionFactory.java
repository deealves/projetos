package br.com.map.projeto_produtos.util;

/**
 *
 * @author Dennys Alves
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

    public static Connection getConnection(){
        try {
            return DriverManager.getConnection(
                    ConfUtil.getConf(ConfUtil.CONF_JDBC_URL), 
                    ConfUtil.getConf(ConfUtil.CONF_JDBC_USUARIO), 
                    ConfUtil.getConf(ConfUtil.CONF_JDBC_SENHA));
            
        } catch (SQLException ex) {
            System.out.println("Erro: " + ex.getMessage());
            return null;
        }
    }
}