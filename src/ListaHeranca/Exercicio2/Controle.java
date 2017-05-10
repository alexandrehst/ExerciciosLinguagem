/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListaHeranca.Exercicio2;

/**
 *
 * @author Alexandre.Torres
 */
public class Controle {
    public static void main(String[] args) {
        Imovel ap = new Imovel();
        
        ap.ocupa();
        
        System.out.println( ap.geraCobranca());
        
        ap.desocupar();
        System.out.println( ap.geraCobranca());
        
        
    }
    
}
