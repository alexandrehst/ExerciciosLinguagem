/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListaHeranca.Exercicio3;

/**
 *
 * @author Alexandre.Torres
 */
public class AreaVip extends Area{
    
    public boolean entradaPermitida(Ingresso ingresso){
        if (ingresso instanceof IngressoVip)
            return true;
        
        return false;
    }
    
}
