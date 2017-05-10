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
public class Ocupado extends Situacao{
    
    public Ocupado(){
        super("Ocupado");
    }
    
    public boolean cobrar(){
        return true;
    }
}
