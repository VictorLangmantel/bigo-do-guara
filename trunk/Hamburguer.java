/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package mcdonalds;

/**
 *
 * @author Aluno
 */
public class Hamburguer {
    String nome;
    Double preco;
    Integer codigo;
    Boolean novo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Boolean isNovo() {
        return novo;
    }

    public void setNovo(Boolean novo) {
        this.novo = novo;
    }
    public String descricaocardapio(){
        if (novo== true){
            return nome + "..." + preco + "NOVO";
        } else {
            return nome + "..." + preco;
        }
    }
}
