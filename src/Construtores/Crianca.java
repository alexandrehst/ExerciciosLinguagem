/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Construtores;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Alexandre.Torres
 */
public class Crianca {
    private String nome;
    private String sexo;
    private int idade;
    private Date dataNascimento;
    
    public int getIdade(){
        return idade;
    }
    
    public Crianca(String nome){
        setNome(nome);
        idade = 0;
    }
    
    public Crianca(String nome, Date data){
        this(nome);
        dataNascimento = data;
    }
    
    public Crianca(String nome, String sexo){
        this(nome);
        this.sexo = sexo;        
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
    
    public Date getDataNascimento(){
        return dataNascimento;
    }
    
    public String getDataNascimento(String formato){
        SimpleDateFormat formatoData = new SimpleDateFormat( formato);
        String dataFormatada = formatoData.format(getDataNascimento());
        
        return dataFormatada;
    }
    
}
