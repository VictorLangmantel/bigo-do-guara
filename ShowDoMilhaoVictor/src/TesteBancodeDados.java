
import dao.Conexao;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import modelo.Jogador;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Victor
 */
public class TesteBancodeDados {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    inserir();
    List<Jogador> lista= listar();
    
    }
    public static List<Jogador> listar()
    {
        List<Jogador> jogadores = new ArrayList<Jogador>();
        
        try {
        
        String sql = "SELECT * FROM jogador"; 
        PreparedStatement pst 
                = Conexao.getPreparedStatement(sql); 
        
            ResultSet res = pst.executeQuery();
        
        while(res.next())
        {
            Jogador jog = new Jogador(); 
            jog.setLogin(res.getString("login"));
            jog.setSenha(res.getString("senha"));
            jog.setEmail(res.getString("email"));
            
            jogadores.add(jog);
        }
        
        
        
        } catch (SQLException ex) {
            
        }
        
        return jogadores; 
        
    }
        public static void inserir()
       {
         String login;
         login = JOptionPane.showInputDialog("LOGIN");
         
         String senha;
         senha = JOptionPane.showInputDialog("SENHA");
         
         String email;
         email = JOptionPane.showInputDialog("EMAIL");
           String sql;
         sql = "INSERT INTO jogador (login,senha,email)"+
                 "VALUES ('silviosantos','dinheiro','patrao@sbt.com')";
         PreparedStatement pst
                 = Conexao.getPreparedStatement(sql);
         
        try {
            pst.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(TesteBancodeDados.class.getName()).log(Level.SEVERE, null, ex);
        }
         
       }
    
}
