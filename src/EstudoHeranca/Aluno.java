/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package EstudoHeranca;

/**
 *
 * @author Alexandre.Torres
 */
public class Aluno extends Pessoa{
    private int ra;

    /**
     * @return the ra
     */
    public int getRa() {
        return ra;
    }

    /**
     * @param ra the ra to set
     */
    public void setRa(int ra) {
        this.ra = ra;
    }
    
    @Override
    public String getNome(){
        return "Aluno: " + super.getNome();
    }
    
    public int getId(){
        return ra;
    }
}