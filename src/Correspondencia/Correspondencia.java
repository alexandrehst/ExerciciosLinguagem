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
public abstract class Correspondencia {
    private String destinatario;
    private String remetente;
    private String enderecoEntrega; 
    private boolean entregue = false;

    public boolean verificaEntregaAutorizada(){
        boolean destinatarioValido = (destinatario != null && !destinatario.equals(" "));
        boolean enderecoValido = (enderecoEntrega != null && !enderecoEntrega.equals(" "));
        
        return (destinatarioValido && enderecoValido);
    }
    /**
     * @return the destinatario
     */
    public String getDestinatario() {
        return destinatario;
    }

    /**
     * @param destinatario the destinatario to set
     */
    public void setDestinatario(String destinatario) {
        this.destinatario = destinatario;
    }

    /**
     * @return the remetente
     */
    public String getRemetente() {
        return remetente;
    }

    /**
     * @param remetente the remetente to set
     */
    public void setRemetente(String remetente) {
        this.remetente = remetente;
    }

    /**
     * @return the enderecoEntrega
     */
    public String getEnderecoEntrega() {
        return enderecoEntrega;
    }

    /**
     * @param enderecoEntrega the enderecoEntrega to set
     */
    public void setEnderecoEntrega(String enderecoEntrega) {
        this.enderecoEntrega = enderecoEntrega;
    }

    /**
     * @return the entregue
     */
    public boolean isEntregue() {
        return entregue;
    }

    /**
     * @param entregue the entregue to set
     */
    public void setEntregue(boolean entregue) {
        this.entregue = entregue;
    }
    
    public abstract String getCaracteristicas();
}
