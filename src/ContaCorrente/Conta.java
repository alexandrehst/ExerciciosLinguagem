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
public abstract class Conta {
    private Cliente cliente;
    private Agencia agencia;
    private double saldo;
    private ArrayList<Movimentacao> historico;
    
    public abstract void atualizacaoMensal();
    
    public Conta(Agencia agencia, Cliente cliente){
        this.agencia = agencia;
        this.cliente = cliente;
        saldo = 0;
        historico = new ArrayList<>();
        this.agencia.getContas().add(this);
    }
    
    public double getSaldo(){
        return saldo;
    }
    
    public void depositar(double valor){
        saldo += valor;
        historico.add( new Movimentacao( "Depósito..", valor));
    }
    
    public void sacar(double valor){
        saldo -= valor;
        historico.add( new Movimentacao( "Sacar.....", valor*-1));
    }
    
    public String extrato(){
        String txt = cliente + "\n";
        txt += agencia + "\n";
        txt += "Extrato\n------------\n\n";
        
        for (Movimentacao m:historico){
            txt += m + "\n";
        }
        
        txt += "\n------------\nR$ " + saldo;
        
        return txt;
        
    }
    
}
