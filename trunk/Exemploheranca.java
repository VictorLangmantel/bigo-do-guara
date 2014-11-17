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
public class Exemploheranca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Arquivovideo arquivoV = new Arquivovideo();
    
    
    arquivoV.setNome("herança");
    arquivoV.setTipo("avi");
    arquivoV.setTamanho("120mb");
    arquivoV.setDuracao("20 min");
    arquivoV.setAutor("Vilnei");
    
    System.out.println(arquivoV.retornarInformacoesCompleta());
    }
    
}
    