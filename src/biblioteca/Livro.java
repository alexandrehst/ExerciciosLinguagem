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
    private String titulo;
    private int anoPublicacao;
    private int numeroPags;
    private Editora editora;
    
    public Livro( String titulo){
        this.titulo = titulo;
    }
    
    public Livro(String titulo,Editora e,int ano,int numeroPags ){
        this(titulo);
        this.editora = e;
        this.anoPublicacao = ano;
        this.numeroPags = numeroPags;
    }
    
    public String toString(){
        return getTitulo() + " " + getEditora();
    }

    /**
     * @return the titulo
     */
    public String getTitulo() {
        return titulo;
    }

    /**
     * @return the anoPublicacao
     */
    public int getAnoPublicacao() {
        return anoPublicacao;
    }

    /**
     * @param anoPublicacao the anoPublicacao to set
     */
    public void setAnoPublicacao(int anoPublicacao) {
        this.anoPublicacao = anoPublicacao;
    }

    /**
     * @return the numeroPags
     */
    public int getNumeroPags() {
        return numeroPags;
    }

    /**
     * @param numeroPags the numeroPags to set
     */
    public void setNumeroPags(int numeroPags) {
        this.numeroPags = numeroPags;
    }

    /**
     * @return the editora
     */
    public Editora getEditora() {
        return editora;
    }

    /**
     * @param editora the editora to set
     */
    public void setEditora(Editora editora) {
        this.editora = editora;
    }
     
}
