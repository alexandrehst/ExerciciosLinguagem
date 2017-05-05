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
public class Carteiro {
    
    public String entregar(Correspondencia c){
        
        if (c.verificaEntregaAutorizada()){
            c.setEntregue(true);

            String msg = "Correspondencia de " + c.getRemetente();
            msg += " para " + c.getDestinatario();
            msg += " entregue no endereco " + c.getEnderecoEntrega();
            msg += c.getCaracteristicas();

            return msg;            
        } else {
            return "Entrega não autorizada";
        }
    }
    
}
