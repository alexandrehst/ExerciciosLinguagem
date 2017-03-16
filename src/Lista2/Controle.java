/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista2;

import javax.swing.JOptionPane;

/**
 *
 * @author Alexandre.Torres
 */
public class Controle {
    public static void main(String[] args) {
        Carro ka = new Carro();
        
        ka.setMotor("1.6");
        ka.ligar();
        
        ka.acelerar();
        ka.acelerar();
        ka.acelerar();
                
        
        if (ka.acelerar())
            JOptionPane.showMessageDialog(null, "A velocidade é " + ka.getVelocidade());
        else
           JOptionPane.showMessageDialog(null, "Não consegui acelerar.");
        
        ka.frear();
        ka.frear();        
        JOptionPane.showMessageDialog(null, "A velocidade é " + ka.getVelocidade());

        if (ka.desligar())
            JOptionPane.showMessageDialog(null, "Carro desligado");
        else
           JOptionPane.showMessageDialog(null, "Não consegui desligar.");
        
        
    }
}
