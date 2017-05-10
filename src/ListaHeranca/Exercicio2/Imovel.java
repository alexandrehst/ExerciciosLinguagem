/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListaHeranca.Exercicio2;

/**
 *
 * @author Alexandre.Torres
 */
public class Imovel {
    private Situacao situacao;

    /**
     * @return the situacao
     */
    public Situacao getSituacao() {
        return situacao;
    }

    public void ocupa(){
        situacao = new Ocupado();
    }
    
    public void desocupar(){
        situacao = new Disponivel();
    }
    
    public String geraCobranca(){
        if (situacao.cobrar()){
            return "R$ 1.000,00";
        } else {
            return "sem cobrança";
        }
    }
    
}
