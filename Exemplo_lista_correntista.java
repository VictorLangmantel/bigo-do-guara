/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package caixaeletrônico;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Aluno
 */
public class Exemplo_lista_correntista {
   
    
public static void main (String[] args){    
    List <Cliente> Lista = new ArrayList<Cliente>();
    Cliente cli = new Cliente();
    cli.setNome("Joãozinho");
    cli.setCpf("123456789");
    cli.setData("00/00");
    
   

    Lista.add(cli);
    
    cli = new Cliente();
    
    cli.setNome("nada");
    cli.setCpf("4321");
    cli.setData("04/08/1997");
 
    Lista.add(cli);
    
    cli = new Cliente();
    
    cli.setNome("J");
    cli.setCpf("098373");
    cli.setData("01/02/1993");
    
    for (Cliente cliente : Lista) {
        System.out.println(cliente.getNome());
        System.out.println(cliente.getCpf());
    }
}
}