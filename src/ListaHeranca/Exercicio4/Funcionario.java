/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListaHeranca.Exercicio4;

/**
 *
 * @author Alexandre.Torres
 */
public abstract class Funcionario {
    private String nome;
    
    public Funcionario(String nome){
        this.nome = nome;
    }
    
    public abstract double getSalario();
}
