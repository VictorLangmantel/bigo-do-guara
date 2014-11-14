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
public class MCoferta {
    String nome, hamburguer,batata, bebida;
    Double preco;
    Integer codigo;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getHamburguer() {
        return hamburguer;
    }

    public void setHamburguer(String hamburguer) {
        this.hamburguer = hamburguer;
    }

    public String getBatata() {
        return batata;
    }

    public void setBatata(String batata) {
        this.batata = batata;
    }

    public String getBebida() {
        return bebida;
    }

    public void setBebida(String bebida) {
        this.bebida = bebida;
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
      
    public String descricaooferta(){
        return nome + "..." + hamburguer + "..."+ batata + "..." + bebida  ;
    }
    public String valoreconomia(){
        return "Com a McOferta voce economizará 6 reais e ganha um brinde no valor de 5,50 R$"; 
    }
}
