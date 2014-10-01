/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package escalacao;

import javax.swing.JOptionPane;

/**
 *
 * @author Victor Gabriel
 */
public class Escalacao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String j;
        String escala = "Tafarel , Dalessandro,Rivelino , Indio, Gabirú, Daniel, Renan, Maydana, Lucas, Victor, Kariel ";
        int carac;

        carac = escala.length();
        System.out.println("O número de caracteres apresentados são:" + carac);

        escala = escala.replace("Indio", "Dalessandro");

        if (escala.contains("Rivelino")) {
            System.out.println("SIM");
        } else {
            System.out.println("Não");
        }
        j = escala.trim();
        
        System.out.println(j);
    
    String escalacao [] = escala.split (",");
    JOptionPane.showMessageDialog(null,  
         "\nO Goleirão é:" + escalacao [0] 
        +"\nO segundo jogador é:  " + escalacao [1]
        +"\nO terceiro jogador é:" + escalacao [2]
        +"\nO quarto jogador é:" + escalacao [3]
        +"\nO quinto jogador é:" + escalacao [4]
        +"\nO sexto jogador é:" + escalacao [5]
        +"\nO sétimo jogador é:" + escalacao [6]
        +"\nO oitavo jogador é:" + escalacao [7]
        +"\nO nono jogador é:" + escalacao [8]
        +"\nO décimo jogador é:" + escalacao [9]
        +"\nO décimo primeiro jogador é:" + escalacao [10]); 
    }

}
