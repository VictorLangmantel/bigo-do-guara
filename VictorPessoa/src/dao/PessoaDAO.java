
package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.Pessoa;


public class PessoaDAO {
    public Boolean inserir (Pessoa pessoa)
    {
        
        Boolean retorno = false;
       
        String sql = "INSERT INTO pessoa (nome,sexo)" +
                "VALUES (?,?)";
        
        PreparedStatement pst = Conexao.getPreparedStatement(sql);
        
       try{ 
        pst.setString(1, pessoa.getNome());
        pst.setString(2, pessoa.getSexo());
        
        
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
    
      public Boolean excluir (Pessoa pessoa)
    {
        
        Boolean retorno = false;
       
        String sql = "DELETE FROM pessoa WHERE login = ?";
        
        PreparedStatement pst = Conexao.getPreparedStatement(sql);
        
       try{ 
        pst.setInt(1, pessoa.getCodigo());
       
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
    
    public List<Pessoa> listar()
    {
        
       
        
        List<Pessoa> lista = new ArrayList<Pessoa>();
        String sql = "SELECT * FROM pessoa";
        PreparedStatement pst = Conexao.getPreparedStatement(sql);
        
        try {
            
            ResultSet res = pst.executeQuery();
            
            while(res.next())
            {
                Pessoa pessoa = new Pessoa();
               
                pessoa.setCodigo(res.getInt("id"));
                pessoa.setNome(res.getString("nome"));
                pessoa.setSexo(res.getString("sexo"));
                lista.add(pessoa);
            }
            } catch(SQLException ex){
               
               ex.printStackTrace();
            }
        return lista;
        }
}
