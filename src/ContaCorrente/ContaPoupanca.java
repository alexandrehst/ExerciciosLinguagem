/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ContaCorrente;

import java.util.ArrayList;

/**
 *
 * @author Alexandre.Torres
 */
public class ContaPoupanca extends Conta {
    public ContaPoupanca(Agencia agencia, Cliente cliente){
        super(agencia, cliente);
    }
    
    @Override
    public void sacar(double valor){
        if (getSaldo() >= valor)
            super.sacar(valor);        
    }
    
    public void atualizacaoMensal(){
        depositar(getSaldo()*.06);
    }
}
