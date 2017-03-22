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
public class Professor {
    
    private String nome;
    private int matricula;
    private Materia materia;
    
    public boolean atribui(Materia materia){
        if (materia.atribuiProfessor()){
           this.materia = materia;
           return true;
        }
        return false;
    }
    
    public Materia getMateria(){
        return this.materia;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

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
    
}
