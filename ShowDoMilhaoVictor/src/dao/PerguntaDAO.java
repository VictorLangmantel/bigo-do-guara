/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import modelo.Pergunta;

/**
 *
 * @author Victor
 */
public class PerguntaDAO {
public Boolean inserir (Pergunta pergunta)
    {
        Boolean retorno;
        String sql ="INSERT INTO PERGUNTA(a,b,c,d,certa,enunciado,nivel)"+"VALUES (?,?,?,?,?,?,?)"; 
    PreparedStatement pst = Conexao.getPreparedStatement(sql);
    try
    {
    pst.setString(1, pergunta.getA());
        pst.setString(2, pergunta.getB());
        pst.setString(3, pergunta.getC());
        pst.setString(4, pergunta.getD());
        pst.setString(5, pergunta.getCerta());
        pst.setString(6, pergunta.getEnunciado());
        pst.setInt(7,pergunta.getNivel());
        
        
 pst.executeUpdate();
 retorno = true;

    }
catch (Exception ex)
{
    ex.printStackTrace();
retorno = false;
}
        
   return retorno;
    }
public List<Pergunta> listar() throws SQLException 
{
    List <Pergunta> lista = new ArrayList<Pergunta>();
String sql = "SELECT * FROM PERGUNTA";
PreparedStatement pst = Conexao.getPreparedStatement(sql);
try
{
    ResultSet res = pst.executeQuery();
    while(res.next())
    {
        Pergunta pergunta = new Pergunta();
        pergunta.setA(res.getString("A"));
        pergunta.setB(res.getString("B"));
        pergunta.setC(res.getString("C"));
        pergunta.setD(res.getString("D"));
        pergunta.setEnunciado(res.getString("Certa"));
        pergunta.setId(res.getInt("id"));
        pergunta.setNivel(res.getInt(sql));



    }
} catch (SQLException ex){
    ex.printStackTrace();
        
        }    
return lista;
}
}
    

