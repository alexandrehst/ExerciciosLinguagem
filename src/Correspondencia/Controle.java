/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Correspondencia;

import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Alexandre.Torres
 */
public class Controle {
    public static void main(String[] args) {
                       
        Carteiro ze = new Carteiro();
        ArrayList<Correspondencia> entregas = new ArrayList<>();
        
        Correspondencia c;
        
        do {
            String opt = JOptionPane.showInputDialog("Digite (P)acote, (C)arta, (M)ulta ou (S)air");  
            
            if (opt.equals("S"))
                break;
            
            String remetente = JOptionPane.showInputDialog("Qual o rementente?");
            String destinatario = JOptionPane.showInputDialog("Qual o destinatario?");
            String endereco = JOptionPane.showInputDialog("Qual o enderco de entrega?");
            
            if (opt.equals("P")){
                c = new Pacote();
            } else if (opt.equals("C")){
                c = new Carta();
            } else {
                c = new Multa();
            }
            
            c.setDestinatario(destinatario);
            c.setRemetente(remetente);
            c.setEnderecoEntrega(endereco);
            
            entregas.add( c );
                                      
        } while (true);
        
        for(Correspondencia corresp :entregas){
            System.out.println(ze.entregar(corresp));            
        }
        
        
    }
    
}
