/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Construtores;

import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Alexandre.Torres
 */
public class Controle {
    public static void main(String[] args) {
        Date data = new Date( 2017-1900, 10, 20);
        Crianca c = new Crianca("Bruninho", data);
        
        System.out.println(c.getDataNascimento());
        System.out.println(c.getDataNascimento("dd/MM/YYYY"));
        
    }
    
}
