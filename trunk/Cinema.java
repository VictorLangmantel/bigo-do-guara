

package cinema;

import javax.swing.JOptionPane;


public class Cinema {

    
    public static void main(String[] args) {
    Filme f = new Filme ();
    
    String nome, genero, ator;
    Integer duracao, classificacao, idade;
   
    nome = JOptionPane.showInputDialog("Nome do filme");
    f.atribuirnome(nome);
    
    ator =  JOptionPane.showInputDialog("Nome do ator");
    f.atribuirator(ator);
    
    genero =  JOptionPane.showInputDialog("Genero do filme");
    f.atribuirator(genero);
    
    duracao= Integer.parseInt (JOptionPane.showInputDialog("Duração do filme"));
    f.atribuirduracao(duracao);
    
    classificacao= Integer.parseInt (JOptionPane.showInputDialog("Classificação "));
    f.atribuirclassificacao(classificacao);
    
    idade = Integer.parseInt (JOptionPane.showInputDialog("Sua idade"));
    f.atribuiridade(idade);
    
    JOptionPane.showMessageDialog(null," nome " + nome  + "\n ator  " + ator + "\n" + duracao + " min de duração \n" +"\n gênero "+ genero + "\n classificação " + classificacao + "\nDigite sua idade: " + idade    );
            
    }
    
}
