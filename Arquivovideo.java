/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exemploheranca;

/**
 *
 * @author Aluno
 */
public class Arquivovideo extends Arquivo {
   private String duracao;
   private String autor;

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    public String retornarInformacoesCompleta(){
        String retorno;
        retorno = this.getNome() + "," + this.getTipo() + "," + this.getTamanho()
                + "-" + this.getAutor() + "/" + this.getDuracao();
     return retorno;
    }
}
