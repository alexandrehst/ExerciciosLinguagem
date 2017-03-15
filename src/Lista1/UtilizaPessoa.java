/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista1;

import javax.swing.JOptionPane;

/**
 *
 * @author Alexandre.Torres
 */
class Pessoa {
    String nome;
    int anoNascimento;
    
    public boolean isJovem(){
        return ( this.idade() <= 30);
    }
    
    public int idade(){
        return 2017 - anoNascimento;
    }         
}

public class UtilizaPessoa{
    public static void main(String[] args) {
        
        Pessoa p = new Pessoa();
        try{
            String idade = JOptionPane.showInputDialog("Digite o ano de nascimento");
            p.nome = "Antonio";
            p.anoNascimento = Integer.parseInt(idade);
            
            System.out.println(p.nome + " tem " + p.idade() + " anos");
        
            if (p.isJovem())
                System.out.println("É jovem");
            else 
                System.out.println("É jovem há muito tempo");
            
        }catch(Exception erroQueAconteceu){
            JOptionPane.showMessageDialog(null, "Aconteceu um erro!");
            erroQueAconteceu.printStackTrace();
        }
        
        

        

    }
}

