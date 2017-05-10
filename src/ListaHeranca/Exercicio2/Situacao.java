/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListaHeranca.Exercicio2;

/**
 *
 * @author Alexandre.Torres
 */
public abstract class Situacao {
    private String descricao;
    
    public abstract boolean cobrar();
    
    public Situacao(String descricao){
        this.descricao = descricao;
    }
    
    public String getDescricao(){
        return descricao;
    }
    
}
