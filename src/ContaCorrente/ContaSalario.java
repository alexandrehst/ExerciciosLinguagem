/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ContaCorrente;

/**
 *
 * @author Alexandre.Torres
 */
public class ContaSalario extends Conta {
    private String empresa;
    
    public ContaSalario(Agencia agencia, Cliente cliente){
        super(agencia, cliente);
    }
    
    
    
    public void atualizacaoMensal(){}
    
}
