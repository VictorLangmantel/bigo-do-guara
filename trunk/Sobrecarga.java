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
public class Sobrecarga {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Celular celular = new Celular();
    celular.setModelo("Nokia lumia 123");
    celular.setPreco(500.0);
    
    System.out.println(celular.retornarPreco("MAX", true));
    }
    
}
