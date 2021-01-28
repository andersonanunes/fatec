/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetopizza;

import java.util.ArrayList;

/**
 *
 * @author AMN
 */
public class CarrinhoCompras {
    ArrayList<ProjetoPizza> carrinhoCompras = new ArrayList();
    private double totalPagar = 0;
    
    public void adicionarItem(ProjetoPizza obj) {
        if (obj.getNumeroIngredientes()>0){
            carrinhoCompras.add(obj);
            totalPagar += obj.getPreco();
        }
    }

    public int totalPizzasAdicionadas() {
        return carrinhoCompras.size();
    }
    
    public double getTotalPagar(){
        return totalPagar;
    }    
}