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
public class Professor extends Pessoa{
    
    private int matricula;

    /**
     * @return the matricula
     */
    public int getMatricula() {
        return matricula;
    }

    /**
     * @param matricula the matricula to set
     */
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    
    public int getId(){
        return matricula;
    }
    
    
}
