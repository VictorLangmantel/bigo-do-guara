/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package victorcidade;
import javax.swing.JOptionPane;
import victorcidade.modelo.Cidade;
/**
 *
 * @author Victor
 */
public class VictorCidade {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Cidade cidade = new Cidade() ;
        
        while(cidade.getCodigo()==null)
    try
    {
        cidade.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Digite Código:")));  
        
    }
    catch(Exception ex)
    {
           JOptionPane.showMessageDialog(null, "É O NÚMERO O CÓDIGO");
    }
      cidade.setCodigo(Integer.parseInt(JOptionPane.showInputDialog("Digite Código:")));  
      cidade.setNome(JOptionPane.showInputDialog("Digite nome:"));
    
      JOptionPane.showMessageDialog(null, cidade.getCodigo() +"\n" +
                                          cidade.getNome  () );
    }
    
    }
    

