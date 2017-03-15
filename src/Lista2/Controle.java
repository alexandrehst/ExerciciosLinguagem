/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista2;

/**
 *
 * @author Alexandre.Torres
 */
public class Controle {
    public static void main(String[] args) {
        Pessoa p = new Pessoa();
        
        p.setNome("João");
        p.nascer();
        p.morrer();
        if (!p.aniversario())
            System.out.println("A pessoa não está viva");
        else
            System.out.println("Parabéns!");
    }
}
