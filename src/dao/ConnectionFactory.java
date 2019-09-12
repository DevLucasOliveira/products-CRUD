package dao;


import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionFactory {

    public Connection getConexao(){
        try{
            return DriverManager.getConnection("jdbc:mysql://localhost","root","a102030a");
        }catch(Exception erro){
            throw new RuntimeException("Erro 1: "+erro);
        }
        
        
    }

    
}
