/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biblioteca;

/**
 *
 * @author Alexandre.Torres
 */
public class Livro {
    String titulo;
    int anoPublicacao;
    int numeroPags;
    Editora editora;
    
    public String toString(){
        return titulo + " " + editora;
    }
    
}
