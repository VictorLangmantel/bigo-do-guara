/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package revisao;
import javax.swing.JOptionPane;
/**
 *
 * @author Victor Gabriel
 */
public class Revisao {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Professor p = new Professor();
        
        String nome, endereço, escola, tecnico, stecnico, superior, ssuperior;
        Double salario;
        
        nome=JOptionPane.showInputDialog("Digite o nome do professor: ");
        p.setNome(nome);
        
        endereço=JOptionPane.showInputDialog("Digite o endereço do professor: ");
        p.setEndereço(endereço);
        
        salario=Double.parseDouble(JOptionPane.showInputDialog("Digite o salario do professor"));
        p.setSalario(salario);
        
        escola=JOptionPane.showInputDialog("Digite a escola que o professor lesiona: ");
        p.setEscola(escola);
        
        tecnico=JOptionPane.showInputDialog("O professor da aula para o curso tecnico (S/N):");
        
        if(tecnico.equals("S")){
            p.setAulatecnico(true);
        }
        else{
            p.setAulatecnico(false);
        }
        
        
        if(p.isAulatecnico()== true){
            stecnico = "Sim";
        }
        else{
            stecnico = "Não";
        }
        
        superior=JOptionPane.showInputDialog("O professor da aula para o curso superior (S/N): ");
        
        if(superior.equals("S")){
            p.setAulasuperior(true);
        }
        else{
            p.setAulasuperior(false);
        }
        
        if(p.isAulasuperior()==true){
            ssuperior = "Sim";
        }
        else{
            ssuperior = "Não";
        }
        
        JOptionPane.showMessageDialog(null, " Nome do professor: "+p.getNome()+ "\n Endereço do professor: "+p.getEndereço()+"\n Salario do professor: "+p.getSalario()+ "\n Escola do professor: "+p.getEscola()+ "\n Aula tecnico: "+stecnico+"\n Aula superior"+ssuperior);
        
    }
    
    }
    

