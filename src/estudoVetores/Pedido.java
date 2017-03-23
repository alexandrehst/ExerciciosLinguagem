/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estudoVetores;

/**
 *
 * @author Alexandre.Torres
 */
public class Pedido {
    private String cliente;
    private double precoTotal;
    private Produto[] produtos = new Produto[2];
    
    public void acrescenta(Produto p, int pos){
        produtos[ pos ] = p;
        atualizaTotal();
    }
    
    public void atualizaTotal(){
        double valor = 0;
        for (Produto p: produtos){
            if (p != null)
                valor += p.getPreco() * p.getQuantidade();
        }
        precoTotal = valor;
    }

    /**
     * @return the precoTotal
     */
    public double getPrecoTotal() {
        return precoTotal;
    }
    
    
}
