

package cinema;

import javax.swing.JOptionPane;


class Filme {
String nome, genero, ator;
    
    Integer classificacao, duracao, idade, midade;
    
    void atribuirnome(String valor)
      {
          
      nome = valor;    
      }
    String retornarnome ()
    {
    return nome;
    }
    
    void atribuirator(String valor)
      {
          
      ator = valor;    
      }
    String retornarator ()
    {
    return ator;
    }
    void atribuirgenero(String valor) {

        genero = valor;
    }

    String retornargenero() {
        return genero;
    }    
 void atribuirduracao(Integer valor) {

        duracao = valor;
    }

    Integer retornarduracao() {
        return duracao;
    
    }
    void atribuirclassificacao(Integer valor) {

        classificacao = valor;
    }

    Integer retornarclassificacao() {
        return classificacao;
    }
    
     void atribuiridade(Integer valor) {

        idade = valor;
        boolean midade = classificacao < idade;
         if ( midade == false){
             JOptionPane.showMessageDialog(null, "Não pode assistir");
         } 
         else {
             JOptionPane.showMessageDialog(null,"Você pode assistir");
         }
     }
Integer retornaridade()
{
    return idade;
}

    
    void atribuirnome() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void atribuirator() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void atribuirator(Integer duracao) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
