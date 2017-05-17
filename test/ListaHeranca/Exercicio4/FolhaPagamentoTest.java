/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListaHeranca.Exercicio4;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author Alexandre.Torres
 */
public class FolhaPagamentoTest {
    
    @Test
    public void testCalcula(){
       FuncionarioHora f = new FuncionarioHora("Antonio", 100, 100);
       FuncionarioComissionado f1 = new FuncionarioComissionado("Antonio", 10000, 1.5);
       FuncionarioSalario f2 = new FuncionarioSalario("Antonio", 10000);
       
       FolhaPagamento folha = new FolhaPagamento();
       folha.adicionaFuncionario(f);
       folha.adicionaFuncionario(f1);
       folha.adicionaFuncionario(f2);
       
       double total = folha.calcula();
              
       assertEquals(20150, total,0 );
    }
    
}
