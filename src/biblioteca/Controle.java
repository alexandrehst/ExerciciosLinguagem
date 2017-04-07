/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

import javax.swing.JOptionPane;

/**
 *
 * @author Alexandre.Torres
 */
public class Controle {
    public static void main(String[] args) {
        Livro livro = new Livro("Senhor dos Anéis", new Editora("Record"), 1995, 700);
        
               
        Estante e = new Estante(1);
        e.guardaLivro(livro);
        e.guardaLivro(new Livro("As duas torres", new Editora("Record"), 1996, 780));
        e.guardaLivro(new Livro("O Retorno do Rei", new Editora("Record"), 1995, 700));
        System.out.println(e.obtemLivros());
        
        int opt = Integer.parseInt(JOptionPane.showInputDialog("Você quer o livro que qual posição?"));
        
        if (opt >= e.getLivros().size())
            JOptionPane.showMessageDialog(null, "Posição inválida", "Erro", JOptionPane.ERROR_MESSAGE);
        else{
            Livro l = e.getLivros().get(opt);
            JOptionPane.showMessageDialog(null, l);
        }
            
    }
    
    
    
}
