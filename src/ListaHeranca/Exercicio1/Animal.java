/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListaHeranca.Exercicio1;

/**
 *
 * @author Alexandre.Torres
 */
public class Animal {
    private String raca;
    private String nome;
    
    public Animal(String nome){
        this.nome = nome;
    }
    
    public String caminha(){
        return "um passo";
    }
        
    
}
