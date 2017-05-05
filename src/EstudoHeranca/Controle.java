/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EstudoHeranca;

import javax.swing.JOptionPane;

/**
 *
 * @author Alexandre.Torres
 */
public class Controle {
    public static void main(String[] args) {
        Aluno a;
        Professor p;
        String opts = JOptionPane.showInputDialog("Que objeto você quer criar? 1, 2 ou 3");
        int opt = Integer.parseInt(opts);
        
        switch (opt){
            case 1:
                a = new Aluno();
                a.setNome("Aluno");
                a.setRa(1234);
                mostraId(a);
                break;
            case 2:                
                p = new Professor();
                p.setNome("Professor");
                p.setMatricula(4567);                
                mostraId(p);
        }
     
    }
    
    public static void mostraId( Pessoa p){
        System.out.println(p.getNome());
        System.out.println(p.getId());
        
    }
    
}
