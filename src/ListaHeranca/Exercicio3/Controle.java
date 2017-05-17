/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListaHeranca.Exercicio3;

import java.util.Scanner;

/**
 *
 * @author Alexandre.Torres
 */
public class Controle {
    public static void main(String[] args) {  
        Scanner teclado = new Scanner(System.in);
        Area a;
        Ingresso i;
        
        System.out.println("Deseja qual ingresso? 1-normal, 2-vip");
        int tipo = teclado.nextInt();
        
        if (tipo == 1){
            i = new IngressoNormal(100);
        } else {
            i = new IngressoVip(100, 50);
        }
        
        System.out.println("Você está entrando em qual área? 1 - normal, 2 - vip");

        tipo = teclado.nextInt();
        
        if (tipo == 1){
            a = new AreaNormal();
        } else {
            a = new AreaVip();
        }
        
        if ( entrar(a, i) )
            System.out.println("Pode entrar");
        else
            System.out.println("Não pode entrar");;
        
    }
    
    public static boolean entrar( Area area, Ingresso ingresso){
        return area.entradaPermitida(ingresso);
    }
    
}
