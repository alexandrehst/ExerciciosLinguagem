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
public class Materia {
    private String nome;
    private boolean disponivel = true;
    
    public boolean atribuiProfessor(){
        if (disponivel){
            disponivel = false;
            return true;
        }
        return false;
    }
    
}
