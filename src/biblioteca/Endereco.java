/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

/**
 *
 * @author Alexandre.Torres
 */
public class Endereco {
    String rua;
    int numero;
    int cep;
    Cidade cidade;
    
    public String toString(){
        return "rua " + rua + " " + numero + " CEP " + cep + " " + cidade;
    }
    
}
