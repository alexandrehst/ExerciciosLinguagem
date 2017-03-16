/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Lista2;

/**
 *
 * @author Alexandre.Torres
 */
public class Carro {
    
    private int velocidade;
    private String motor;
    private boolean ligado;
    
    public boolean acelerar(){
        
        if (getVelocidade() >= 120 && getMotor().equals("1.0")) return false;
        if (getVelocidade() >= 160 && getMotor().equals("1.6")) return false;
        if (getVelocidade() >= 180 && getMotor().equals("1.8")) return false;        
        if (!ligado) return false;
        
        velocidade +=5;
        
        return true;        
    }
    
    public void frear(){
        velocidade -= 10;
        
        // Este é o operador ternário. Não entendeu? Google
        velocidade = getVelocidade() < 0 ? 0 : getVelocidade();
    }
    
    public void ligar(){
        ligado = true;
    }
    
    public boolean desligar(){
        ligado = (getVelocidade() > 0);
        return !ligado;
        
        /*if (velocidade > 0)
            return false;
        
        ligado = false;
        return true;
        */
        
        
        
    }

    /**
     * @return the velocidade
     */
    public int getVelocidade() {
        return velocidade;
    }

    /**
     * @return the motor
     */
    public String getMotor() {
        return motor;
    }

    /**
     * @param motor the motor to set
     */
    public void setMotor(String motor) {
        this.motor = motor;
    }
    
}
