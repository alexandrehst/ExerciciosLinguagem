/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package time;

/**
 *
 * @author Alexandre.Torres
 */
public class Jogador {
    private String nome;
    private int golsMarcados =0;
    private boolean contratado = false;
    private Time time;
    
    public boolean contratar(Time time){
        if (!contratado){
            this.time = time;
            contratado = true;
        }
        return contratado;
    }
    public void setNome(String nome){
        this.nome = nome;
    }
    
    public String getNome(){
        return nome;
    }
    
    public int getGolsMarcados(){
        return golsMarcados;
    }
    public void marcarGol(){
        golsMarcados++;
    }

    public Time getTime() {
        return time;
    }
    
}
