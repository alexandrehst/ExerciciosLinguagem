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
public class Multa extends Correspondencia{
    private String dataEntrega;
    
    public String getCaracteristicas(){
        return " Multa de transido entregue no dia " + getDataEntrega();
    }

    /**
     * @return the dataEntrega
     */
    public String getDataEntrega() {
        return dataEntrega;
    }

    /**
     * @param dataEntrega the dataEntrega to set
     */
    public void setDataEntrega(String dataEntrega) {
        this.dataEntrega = dataEntrega;
    }
}
