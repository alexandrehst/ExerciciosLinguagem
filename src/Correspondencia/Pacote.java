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
public class Pacote extends Correspondencia{
    private int peso;
    private int largura;
    private int altura;
    private int profundidade;

    /**
     * @return the peso
     */
    public int getPeso() {
        return peso;
    }

    /**
     * @param peso the peso to set
     */
    public void setPeso(int peso) {
        this.peso = peso;
    }

    /**
     * @return the largura
     */
    public int getLargura() {
        return largura;
    }

    /**
     * @param largura the largura to set
     */
    public void setLargura(int largura) {
        this.largura = largura;
    }

    /**
     * @return the altura
     */
    public int getAltura() {
        return altura;
    }

    /**
     * @param altura the altura to set
     */
    public void setAltura(int altura) {
        this.altura = altura;
    }

    /**
     * @return the profundidade
     */
    public int getProfundidade() {
        return profundidade;
    }

    /**
     * @param profundidade the profundidade to set
     */
    public void setProfundidade(int profundidade) {
        this.profundidade = profundidade;
    }
    
    public String getCaracteristicas(){
        String msg = " Largura: " + largura;
        msg += " Altura: " + altura;
        msg += " Profundidade: " + profundidade;
        msg += " Peso: " + peso;
        
        return msg;
    }
    
           
    
}
