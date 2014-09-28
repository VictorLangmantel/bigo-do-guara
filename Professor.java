/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package revisao;

/**
 *
 * @author Victor Gabriel
 */
public class Professor {
 String nome;
    String endereço;
    Double salario;
    String escola;
    Boolean aulatecnico;
    Boolean aulasuperior;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    public String getEscola() {
        return escola;
    }

    public void setEscola(String escola) {
        this.escola = escola;
    }

    public Boolean isAulatecnico() {
        return aulatecnico;
    }

    public void setAulatecnico(Boolean aulatecnico) {
        this.aulatecnico = aulatecnico;
    }

    public Boolean isAulasuperior() {
        return aulasuperior;
    }

    public void setAulasuperior(Boolean aulasuperior) {
        this.aulasuperior = aulasuperior;
    }
    
       
}
