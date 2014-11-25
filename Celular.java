/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sobrecarga;

/**
 *
 * @author Aluno
 */
public class Celular {
    private String modelo;
    private Double preco;

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
public Double retornarPreco(){
    return preco;
}
public Double retornarPreco(String plano, Boolean dados){
   Double retorno;
   if (plano.equals("MAX"))
   {
       retorno = 0.0;
   }else{
       if (plano.equals ("PLUS")){
           retorno = this.preco / 2;
           
       } else {
           retorno = this.preco;
           
       }
   }
 if (dados == true && retorno >= 50)
 {
      
 }
   return retorno;
}
}