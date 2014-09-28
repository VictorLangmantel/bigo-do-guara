/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package televisao;

/**
 *
 * @author Victor Gabriel
 */
public class Ator {
    
 private String nome,data_nasci,email,nomea,cidade,endereco,bairro,estado,status;
    private int quantn;
    private double salario,cache;
    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getData_nasci() {
        return data_nasci;
    }

    public void setDatadenas(String data_nasci) {
        this.data_nasci = data_nasci;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNomea() {
        return nomea;
    }

    public void setNomea(String nomea) {
        this.nomea = nomea;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public int getQuantn() {
        return quantn;
    }

    public void setQuantn(int quantn) {
        this.quantn = quantn;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public double getCache() {
        return cache;
    }

    public void setCache(double cache) {
        this.cache = cache;
    }

    public String getStatus() {
        if((quantn < 3) && (salario < 5000)){
            status =  "Calouro";
        }
        else if ((quantn < 6) && (salario < 30000)){
            status = "Revelação";
        }
        else if (quantn < 6){
            status = "Joia";
        }
        else if ((quantn < 9 ) && (salario < 30000)){
                status = "Elenco de apoio";
        }
        else if ((salario > 30000)&&(salario < 100000)){
            status = "Elenco principal";
        }
        else if (salario > 10000){
            status =  "Estela";
        }
        else {
            status = "Elenco regular";
            
        }
       return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    
    
}

