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
public class FuncionarioComissionadoTest {
    
    @Test
    public void testGetSalario(){
       FuncionarioComissionado f = new FuncionarioComissionado("Antonio", 10000, 1.5);
       double salario = f.getSalario();
       
       assertEquals(150, salario,0 );
    }
    
}
