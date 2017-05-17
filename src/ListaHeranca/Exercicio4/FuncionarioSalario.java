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
class FuncionarioSalario extends Funcionario{
    
    double salario;
    public FuncionarioSalario(String nome, double salario) {
        super(nome);
        this.salario = salario;
    }
    
    public double getSalario(){
        return salario;
    }
    
}
