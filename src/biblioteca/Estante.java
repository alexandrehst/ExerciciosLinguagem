/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

import java.util.ArrayList;

/**
 *
 * @author Alexandre.Torres
 */
public class Estante {
    private int numero;
    private ArrayList<Livro> livros;
    
    public Estante(int numero){
        this.numero = numero;
        livros = new ArrayList<>();
        
    }
    
    public void guardaLivro(Livro l){
        getLivros().add(l);
        
    }
    /**
     * @return the numero
     */
    public int getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String obtemLivros(){
        String texto = "Estante: " + getNumero() + "\n";
        
        for (Livro l:getLivros()){
            texto += l + "\n";
        }
        
        return texto;
    }

    /**
     * @return the livros
     */
    public ArrayList<Livro> getLivros() {
        return livros;
    }
    
}
