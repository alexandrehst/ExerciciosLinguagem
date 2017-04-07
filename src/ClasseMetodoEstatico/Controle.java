/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ClasseMetodoEstatico;

/**
 *
 * @author Alexandre.Torres
 */
public class Controle {
    public static void main(String[] args) {
        float temp = 0;
        System.out.println(temp + "C é igual a " + 
                Temperatura.fahrenheit(temp));
        
        System.out.println("O zero absoluto em Fahrenheit é " +
                Temperatura.fahrenheit(Temperatura.ZEROABSOLUTO));
    }
    
}
