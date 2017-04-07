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
public class Temperatura {
    public static final float ZEROABSOLUTO = -273;
    
    public static float celsius( float f ){ 
        return (f - 32) * 5/9;
    }
    
    public static float fahrenheit( float c){
        return c * 9 / 5 + 32;
    } 
    
}
