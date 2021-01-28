import org.junit.Test;
import static org.junit.Assert.*;
import projetopizza.CarrinhoCompras;
import projetopizza.ProjetoPizza;

/**
 *
 * @author AMN
 */
public class TesteCarrinho {

    @Test
    public void testeAdicionarPizzas() {
        CarrinhoCompras c1 = new CarrinhoCompras();
        
        ProjetoPizza p1 = new ProjetoPizza("Portuguesa");
        p1.adicionaIngrediente("mossarela");
        p1.adicionaIngrediente("presunto");
        p1.adicionaIngrediente("ovos");
        p1.adicionaIngrediente("cebola");
        
        ProjetoPizza p2 = new ProjetoPizza("Marguerita");
        p2.adicionaIngrediente("mossarela de búfala");
        p2.adicionaIngrediente("manjericão");
        p2.adicionaIngrediente("tomate");
        
        ProjetoPizza p3 = new ProjetoPizza("Genérica");

        c1.adicionarItem(p1);
        c1.adicionarItem(p2);
        c1.adicionarItem(p3);
        
        assertEquals(2, c1.totalPizzasAdicionadas());
    }
    
    @Test
    public void testeTotalPagar(){
        CarrinhoCompras c1 = new CarrinhoCompras();
        
        ProjetoPizza p1 = new ProjetoPizza("Portuguesa");
        p1.adicionaIngrediente("mossarela");
        p1.adicionaIngrediente("presunto");
        p1.adicionaIngrediente("ovos");
        p1.adicionaIngrediente("cebola"); //45.00
        
        ProjetoPizza p2 = new ProjetoPizza("Marguerita");
        p2.adicionaIngrediente("mossarela de búfala");
        p2.adicionaIngrediente("manjericão");
        p2.adicionaIngrediente("tomate");//45.00
        
        ProjetoPizza p3 = new ProjetoPizza("Calabreza");
        p3.adicionaIngrediente("calabreza");
        p3.adicionaIngrediente("cebola"); //30.00

        c1.adicionarItem(p1);
        c1.adicionarItem(p2);
        c1.adicionarItem(p3);
        
        assertEquals(120, c1.getTotalPagar(),0);
    }
    
}
