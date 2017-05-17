/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListaHeranca.Exercicio3;

/**
 *
 * @author Alexandre.Torres
 */
public class IngressoVip extends Ingresso{
    private double valorAdicional;
    
    public IngressoVip(double valor, double valorAdicional) {
        super(valor);
        this.valorAdicional = valorAdicional;
    }
    
    public double getValor(){
        return super.getValor() + this.valorAdicional;
    }
}
