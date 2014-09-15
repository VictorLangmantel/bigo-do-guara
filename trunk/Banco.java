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
public class Banco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    String nome, numero, sim="Sim", não="Não";
    Boolean empretimoimovel, emprestimocarro; 

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String isEmpretimoimovel() {
        if (empretimoimovel == true)
        {
            return sim;
        }
        else
        {
            return não;
        }
    }

    public void setEmpretimoimovel(Boolean empretimoimovel) {
        this.empretimoimovel = empretimoimovel;
    }

    public String isEmprestimocarro() {
        if (emprestimocarro == true)
        {
            return sim;
        }
        else
        {
            return não;
        }
    }

    public void setEmprestimocarro(Boolean emprestimocarro) {
        this.emprestimocarro = emprestimocarro;
    
    
    


    }
    
}
