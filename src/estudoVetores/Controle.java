/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estudoVetores;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Alexandre.Torres
 */
public class Controle {
    public static void main(String[] args) {
        ArrayList<Produto> produtos = new ArrayList<>();
        
        produtos.add( new Produto());

        p.setNome("Feijão");

        produtos.add( p);
        
        Produto x = produtos.get(0);
        System.out.println(x.getNome());
        
        
    }
    
}
