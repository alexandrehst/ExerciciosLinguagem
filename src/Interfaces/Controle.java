/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

/**
 *
 * @author Alexandre.Torres
 */
public class Controle {
    public static void main(String[] args) {
        Pilha p = new Pilha();
        
        Lata l = new Lata();
        l.setPeso(10);
        l.setMarca("Tinta");
        
        p.coloca(l);
    }
    
}
