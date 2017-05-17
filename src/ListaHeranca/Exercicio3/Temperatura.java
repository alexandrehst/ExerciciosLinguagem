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
public class Temperatura {
    private int valor;

    /**
     * @return the valor
     */
    public int getValor() {
        return valor;
    }

    /**
     * @param valor the valor to set
     */
    public void setValor(int valor) {
        this.valor = valor;
    }
    
    public static int converte( Temperatura t){
        return t.getValor() * 2;
    }
    
}
