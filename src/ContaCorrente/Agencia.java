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
public class Agencia {
    private Banco banco;
    private int numero;
    private ArrayList<Conta> contas;
    
    public Agencia(Banco banco, int numero){
        this.banco = banco;
        this.numero = numero;
        contas = new ArrayList<Conta>();
    }
    
    public void atualizacao(){
        for(Conta c: contas){
            c.atualizacaoMensal();
            /*
            * Aqui ocorre uma chamada polimórfica pois
            * a classe mais genérica executa um comportamento
            * específico.
            * Isso apenas será resolvido no momento da
            * execução do programa.            
            */
        }
    }
    
    public ArrayList<Conta> getContas(){
        return contas;
    }
    
    public String toString(){
        return banco  + "\n" + "Agência: " + numero;
    }
    
}
