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
public class Curso {
    
    private String nome;
    private int vagasDisponiveis = 1;
    
    public boolean matricula(){
        if (vagasDisponiveis == 0)
            return false;
        
        vagasDisponiveis--;
        return true;
                    
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
}
