/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

/**
 *
 * @author Alexandre.Torres
 */
public class BatataFrita implements Empilhavel{

    @Override
    public double getPeso() {
        return .200;
    }

    @Override
    public double getPesoSuportado() {
        return 1000;
    }

    @Override
    public String getDescricao() {
        return "Batata Frita";
    }
    
}
