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
public class ContaCorrente extends Conta{
    private double limite;
    
    public ContaCorrente(Agencia agencia, Cliente cliente){
        super(agencia, cliente);
    }
    
    @Override
    public void sacar(double valor){
        if (valor <= (this.getSaldo() + limite)){
            super.sacar(valor);
        }
    }

    public void setLimite(double limite) {
        this.limite = limite;
    }
    
    public void atualizacaoMensal(){
        if (getSaldo()<0){
            depositar(getSaldo()*.14);
        }
    }
    
    
}
