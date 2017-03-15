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
public class Pessoa {
    private String nome;
    private int idade;
    private boolean viva;
    
    public void nascer(){
        viva = true;
        idade = 0;
    }
    
    public boolean aniversario(){
        if (viva){
            idade++;
            return true;
        }
        
        return false;            
    }
    
    public void morrer(){
        viva = false;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public int getIdade(){
        return idade;
    }
    
}
