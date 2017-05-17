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
public class FuncionarioHora extends Funcionario{
    private double horasTrabalhadas;
    private double valorHora;
    
    public FuncionarioHora(String nome, double horasTrabalhadas, double valorHora){
        super(nome);
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorHora = valorHora;
    }
    
    public double getSalario(){
        return horasTrabalhadas * valorHora;
    
    }
}
