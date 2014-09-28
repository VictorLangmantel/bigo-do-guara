/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package televisao;

import javax.swing.JOptionPane;
/**
 *
 * @author Victor Gabriel
 */
public class Televisao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Ator a = new Ator ();
        
    String nome,data_nasci,email,nomea,cidade,endereco,bairro,estado;
    int quantn;
    double salario,cache;
    
    nome=JOptionPane.showInputDialog("Informe o nome do ator: ");
    a.setNome(nome);
    
    data_nasci=JOptionPane.showInputDialog("Informe a data de nascimento do ator: ");
    a.setDatadenas(data_nasci);
    
    email=JOptionPane.showInputDialog("Informe o e-mail do ator: ");
    a.setEmail(email);
    
    nomea=JOptionPane.showInputDialog("Informe o nome artístico do ator: ");
    a.setNomea(nomea);
    
    estado=JOptionPane.showInputDialog("Informe o estado do ator: ");
    a.setEstado(estado);
    
    cidade=JOptionPane.showInputDialog("Informe a cidade do ator: ");
    a.setCidade(cidade);
    
    bairro=JOptionPane.showInputDialog("Informe o bairro do ator: ");
    a.setBairro(bairro);
    
    endereco=JOptionPane.showInputDialog("Informe o endereço do ator: ");
    a.setEndereco(endereco);
    
    quantn=Integer.parseInt(JOptionPane.showInputDialog("Informe a quantidade de novelas que o ator participou: "));
    a.setQuantn(quantn);
    
    salario=Double.parseDouble(JOptionPane.showInputDialog("Informe o salario do ator: "));
    a.setSalario(salario);
    
    cache=Double.parseDouble(JOptionPane.showInputDialog("Informe o cache recebido pelo ator em eventos: "));
    a.setCache(cache);
    
    JOptionPane.showMessageDialog(null, "Nome do ator:" + a.getNome()+ "\nData de nascimento:" + a.getData_nasci()+"\nEmail do ator: "+a.getEmail()+"\nNome artistico: "+ a.getNomea()+"\nEstado do ator: "+a.getEstado()+"\nCidade do ator: "+a.getCidade()+"\nBairro do ator: "+a.getBairro()+"\nEndereço do ator "+a.getEndereco()+"\nQuantidade de novelas: "+a.getQuantn()+"\nSalario do ator: "+a.getSalario()+"\nCache do ator "+a.getCache()+"\nStatus do ator: "+a.getStatus());
    
    }
    }
    

