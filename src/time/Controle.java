/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package time;

/**
 *
 * @author Alexandre.Torres
 */
public class Controle {
    public static void main(String[] args) {
        Time t = new Time();
        t.setNome("São Paulo Futebol Clube O SOBERANO");
        
        Jogador j = new Jogador();
        j.setNome("Waldisnei Wallace");
        j.contratar(t);
        j.marcarGol();
        j.marcarGol();
        
        t.setNome("São Paulo");
        Jogador x = new Jogador();
        x.setNome("Zezinho");
        x.contratar(t);
        x.marcarGol();
        
        System.out.println(j.getNome() + " do time " 
                + j.getTime().getNome() + " marcou " 
                + j.getGolsMarcados() + " gols ");

        System.out.println(x.getNome() + " do time " 
                + x.getTime().getNome() + " marcou " 
                + x.getGolsMarcados() + " gols ");        
    }
}
