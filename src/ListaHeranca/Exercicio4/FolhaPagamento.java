/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListaHeranca.Exercicio4;

import java.util.ArrayList;

/**
 *
 * @author Alexandre.Torres
 */
public class FolhaPagamento {
    ArrayList<Funcionario> funcionarios;
    
    public FolhaPagamento(){
        funcionarios = new ArrayList<>();
    }
    public void adicionaFuncionario(Funcionario f){
        funcionarios.add(f);
    }
    
    public double calcula(){
        double total = 0;
        for (Funcionario f : funcionarios){
            total += f.getSalario();
        }
        
        return total;
    }
    
}
