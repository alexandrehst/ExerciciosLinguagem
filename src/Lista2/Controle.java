/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista2;

import javax.swing.JOptionPane;

/**
 *
 * @author Alexandre.Torres
 */
public class Controle {
    public static void main(String[] args) {
       Professor p = new Professor();
       Professor x = new Professor();
       Materia m = new Materia();
       
       x.atribui(m);
       
       if (p.atribui(m))
            System.out.println("Professor atribuído");
       else
            System.out.println("Matéria não disponível");
    }
}
