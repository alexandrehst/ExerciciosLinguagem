/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ContaCorrente;

/**
 *
 * @author Alexandre.Torres
 */
public class Banco {
    private String nome;
    private int numero;
    
    public Banco( int numero, String nome){
        this.nome = nome;
        this.numero = numero;
    }
    
    public String toString(){
        return "Banco: " + numero + " - " + nome;
    }
           
    
}
