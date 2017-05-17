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
class FuncionarioComissionado extends Funcionario{
    private double vendasBrutas;
    private double taxaDeComissao;
    public FuncionarioComissionado(String nome, double vendas, double comissao) {
        super(nome);
        vendasBrutas = vendas;
        taxaDeComissao = comissao;
    }

    public double getSalario() {
        return vendasBrutas * taxaDeComissao/100;
    }
    
}
