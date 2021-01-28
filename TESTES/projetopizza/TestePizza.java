/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import projetopizza.ProjetoPizza;
import projetopizza.CarrinhoCompras;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author AMN
 */
public class TestePizza {

    @Test
    public void testeGetPreco2Sabores(){
        ProjetoPizza p1 = new ProjetoPizza("mussarela");
        p1.adicionaIngrediente("queijo");
        p1.adicionaIngrediente("oregano");
        assertEquals(30., p1.getPreco(),0);
    }
    
    @Test
    public void testeGetPreco5Sabores(){
        ProjetoPizza p1 = new ProjetoPizza("portuguesa");
        p1.adicionaIngrediente("queijo");
        p1.adicionaIngrediente("presunto");
        p1.adicionaIngrediente("ervilha");
        p1.adicionaIngrediente("cebola");
        p1.adicionaIngrediente("catupiry");
        assertEquals(45., p1.getPreco(),0);
    }
    
    @Test
    public void testeGetPreco6Sabores(){
        ProjetoPizza p1 = new ProjetoPizza("especial");
        p1.adicionaIngrediente("queijo");
        p1.adicionaIngrediente("oregano");
        p1.adicionaIngrediente("ervilha");
        p1.adicionaIngrediente("cebola");
        p1.adicionaIngrediente("catupiry");
        p1.adicionaIngrediente("bacon");
        assertEquals(60., p1.getPreco(),0);
    }
    
    @Test public void adicionaIngrediente(){
        ProjetoPizza p1 = new ProjetoPizza("mussarela");
        p1.adicionaIngrediente("azeitonas pretas");
        assertEquals(1, p1.getNumeroIngredientes());
    }
            
}
