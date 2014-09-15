/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package caixaeletrônico;

/**
 *
 * @author Aluno
 */

import javax.swing.JOptionPane;

public class Conta {
    
 private String agencia, numeroconta, nomecorrentista;
    private Double saldo; 
    private Boolean ativa;

    public String getAgencia() {
        return agencia;
    }

    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNumeroconta() {
        return numeroconta;
    }

    public void setNumeroconta(String numeroconta) {
        this.numeroconta = numeroconta;
    }

    public String getNomecorrentista() {
        return nomecorrentista;
    }

    public void setNomecorrentista(String nomecorrentista) {
        this.nomecorrentista = nomecorrentista;
    }

    public Boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(Boolean ativa) {
        this.ativa = ativa;
    }
    
    
     
    void abrir (String vagencia, String vnumero, String vcorrentista)
    {
        agencia = vagencia ;
        numeroconta = vnumero;
        nomecorrentista = vcorrentista ;
        
        saldo = 0.0; 
        ativa = true;   
      
    }
    
    Boolean sacar (Double valor)          
    {
        if(ativa == true)
        {
           if(valor <= saldo)
           {
               saldo = saldo - valor;
               return true;
           }
           else
           {
               return false;
           }
        }
        else
        {
            return false;
        }
        
    }
    
    Boolean depositar (Double valor)
    {
        Boolean retorno = null;
        
        if(ativa == true)
        {
            saldo = saldo + valor;
            retorno = true;
        }
        else
        {
            retorno = false;
        }
        return retorno;       
    }
    
    void fecharconta ()
    {
        ativa = false;
    }
    Boolean retornarfecharconta ()
    {
        return ativa;
    }
}


