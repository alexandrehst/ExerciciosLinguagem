/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListaHeranca.Exercicio4;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Alexandre.Torres
 */
public class FuncionarioSalarioTest {
    
    @Test
    public void testGetSalario(){
       FuncionarioSalario f = new FuncionarioSalario("Antonio", 10000);
       double salario = f.getSalario();
       
       assertEquals(10000, salario,0 );
       
    }
    
}
