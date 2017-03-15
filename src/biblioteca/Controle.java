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
        Cidade cidade = new Cidade();
        Endereco end = new Endereco();
        Editora ed = new Editora();
        Livro l = new Livro();

        //, número, CEP e cidade. Uma cidade tem um Estado. 
/*        String titulo = JOptionPane.showInputDialog("Digite o título");
        int ano = Integer.parseInt(JOptionPane.showInputDialog("Digite o ano"));
        int pags = Integer.parseInt(JOptionPane.showInputDialog("Digite o número de páginas"));
        String nomeEd = JOptionPane.showInputDialog("Qual o nome da editora?");
        String rua = JOptionPane.showInputDialog("Ela fica em qual rua?");
        int numEndereco = Integer.parseInt(JOptionPane.showInputDialog("Em que número?"));
        int cep  = Integer.parseInt(JOptionPane.showInputDialog("Qual o CEP?"));
        String cid = JOptionPane.showInputDialog("Qual a cidade?");
        String uf = JOptionPane.showInputDialog("Qual o estado?");
  */      
        cidade.nome = "Brasília";
        cidade.estado = "DF";
        end.cep = 7000000;
        end.numero = 50;
        end.rua = "Castanheiras";
        end.cidade = cidade;
        ed.nome = "Editora Independente";
        ed.endereco = end;
        l.titulo = "Java na marra";
        l.numeroPags = 150;
        l.anoPublicacao = 2015;
        l.editora = ed;
        
        System.out.println( l );
        
               
        
    }
    
    
    
}
