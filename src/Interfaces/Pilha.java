/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import java.util.ArrayList;

/**
 *
 * @author Alexandre.Torres
 */
public class Pilha {
    private ArrayList<Empilhavel> pilha = new ArrayList<>();
    
    public void coloca(Empilhavel obj){
        if (podeEmpilhar(obj))
            pilha.add(obj);
    }
    
    public boolean podeEmpilhar(Empilhavel obj){
        double peso = 0;
        for (Empilhavel e:pilha){
            peso = e.getPesoSuportado();        
        }
        
        if (obj.getPeso() > peso)
            return false;
        
        return true;
    }
}
