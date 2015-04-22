

package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.Cidade;


public class CidadeDAO {
    public Boolean inserir (Cidade cidade)
    {
        
        Boolean retorno = false;
       
        String sql = "INSERT INTO cidade (nome)" +
                "VALUES (?)";
        
        PreparedStatement pst = Conexao.getPreparedStatement(sql);
        
       try{ 
        pst.setString(1, cidade.getNome());
        
        
        pst.executeUpdate();
                retorno = true;
       }
       
       catch(Exception ex)
       {
           ex.printStackTrace();
           retorno = false;
       }
        
       return retorno;
 
    }
    
      public Boolean excluir (Cidade cidade)
    {
        
        Boolean retorno = false;
       
        String sql = "DELETE FROM cidade WHERE login = ?";
        
        PreparedStatement pst = Conexao.getPreparedStatement(sql);
        
       try{ 
        pst.setInt(1, cidade.getCodigo());
       
       
        pst.executeUpdate();
                retorno = true;
       }
       
       catch(Exception ex)
       {
           ex.printStackTrace();
           retorno = false;
       }
        
       return retorno;
 
    }
    
    public List<Cidade> listar()
    {
        
        
        
        List<Cidade> lista = new ArrayList<Cidade>();
        String sql = "SELECT * FROM cidade";
        PreparedStatement pst = Conexao.getPreparedStatement(sql);
        
        try {
            
            ResultSet res = pst.executeQuery();
             
            while(res.next())
            {
                Cidade cidade = new Cidade();
                cidade.setCodigo(res.getInt("id"));
                cidade.setNome(res.getString("nome"));
                lista.add(cidade);
            }
            } catch(SQLException ex){
               
               ex.printStackTrace();
            }
        return lista;
        }
}
