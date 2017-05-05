/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Correspondencia;

/**
 *
 * @author Alexandre.Torres
 */
public class Carta extends Correspondencia{
    private boolean seloColado;

    /**
     * @return the seloColado
     */
    public boolean isSeloColado() {
        return seloColado;
    }

    /**
     * @param seloColado the seloColado to set
     */
    public void setSeloColado(boolean seloColado) {
        this.seloColado = seloColado;
    }
    
    public boolean verificaEntregaAutorizada(){
        return isSeloColado() && super.verificaEntregaAutorizada();        
    }     
    
    public String getCaracteristicas(){
        return " Selada: " + isSeloColado();
    }
    
}
