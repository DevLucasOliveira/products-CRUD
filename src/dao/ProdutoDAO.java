package dao;

import model.Produto;
import java.sql.Connection;
import java.sql.PreparedStatement;

public class ProdutoDAO {
    
    private Connection conn;
    private PreparedStatement stmt;
    
    public ProdutoDAO(){
        conn = new ConnectionFactory().getConexao();
    }

    
    public void inserir(Produto produto){
        String sql = "INSERT INTO produto (descricao_produto, preco_produto) VALUES (?,?)";
        try{
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, produto.getDescricao_produto());
            stmt.setDouble(2, produto.getPreco_produto());
            stmt.execute();
            stmt.close();
        }catch(Exception erro){
            throw new RuntimeException("Erro 2: "+erro);
        }    
    }
    
    public void inserir(Produto produto){
        String sql = " ";
        try{
            
        }catch(Exception erro){
            throw new RuntimeException("Erro 2: "+erro);
        }
        
    }
    
    public void inserir(Produto produto){
        String sql = " ";
        try{
            
        }catch(Exception erro){
            throw new RuntimeException("Erro 2: "+erro);
        }
        
    }
    
    public void inserir(Produto produto){
        String sql = " ";
        try{
            
        }catch(Exception erro){
            throw new RuntimeException("Erro 2: "+erro);
        }
        
    }
    
         
    
    
    
    
}
