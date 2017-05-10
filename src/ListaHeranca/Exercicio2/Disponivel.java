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
public class Disponivel extends Situacao{
    
    public Disponivel(){
        super("Disponivel");
    }
    
    public boolean cobrar(){
        return false;
    }
    
}
