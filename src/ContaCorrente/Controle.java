/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ContaCorrente;

/**
 *
 * @author Alexandre.Torres
 */
public class Controle {
    public static void main(String[] args) {
        Cliente cliente = new Cliente("Joaquim José de Alcântara Xavier");
        Banco banco = new Banco( 1, "Banco do Brasil");
        Agencia agencia = new Agencia( banco, 3030);
        ContaCorrente conta1 = new ContaCorrente( agencia, cliente);
        ContaCorrente conta2 = new ContaCorrente( agencia, 
                                        new Cliente("Antonio Palocci"));
        
        ContaPoupanca poupanca = new ContaPoupanca(agencia, new Cliente("Dona Maria"));

        conta1.setLimite(100);
        conta1.depositar(1000);
        conta1.sacar(1100);
        conta2.setLimite(10000);
        conta2.sacar(5000);
        poupanca.depositar(3000);
        
        agencia.atualizacao();
        
        System.out.println(conta1.extrato());
        System.out.println(conta2.extrato());
        System.out.println(poupanca.extrato());
    }
}
