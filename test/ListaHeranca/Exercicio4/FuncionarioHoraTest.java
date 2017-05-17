/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListaHeranca.Exercicio4;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 *
 * @author Alexandre.Torres
 */
public class FuncionarioHoraTest
{
    
    @Test
    public void testGetSalario(){
       FuncionarioHora f = new FuncionarioHora("Antonio", 100, 100);
       double salario = f.getSalario();
       
       assertEquals(10000, salario,0 );
    }

}
