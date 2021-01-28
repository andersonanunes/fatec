/*
 * Exemplo de teste de classe
 * 
 * 
 */

import org.junit.Test;
import static org.junit.Assert.*;
import projetocarro.Carro;

/**
 *
 * @author AMN
 */
public class TesteCarro {

    @Test
    public void testeParar(){
        Carro gol = new Carro(10, 0); // criando instancia
        gol.acelerar(10);
        gol.acelerar(20);
        gol.acelerar(30);
        gol.parar();
        assertEquals(0, gol.getVelocidade());
    }
    
    @Test
    public void testeReduzir(){
        Carro c1 = new Carro(10,75);
        c1.reduzir();
        c1.reduzir();
        c1.reduzir();
        assertEquals(5, c1.getVelocidade());
    }
    
    @Test
    public void testeAcelerar(){
        Carro c2 = new Carro(20, 0);
        c2.acelerar(10);
        c2.acelerar(20);
        c2.acelerar(30);
        c2.acelerar(40);
        assertEquals(100, c2.getVelocidade());
    }
    
    @Test
    public void testeFrear(){
        Carro c3 = new Carro(20, 100);
        c3.acelerar(20);
        c3.frear();
        assertEquals(0, c3.getVelocidade());
    }
    
    @Test
    public void testeGetVelocidade(){
        Carro c4 = new Carro(10, 200);
        assertEquals(200, c4.getVelocidade());
    }
    
    @Test
    public void testeEhIgual(){
        Carro c4 = new Carro(100, 200, "Ferrari", "F350");
        Carro c5 = new Carro(100, 200, "Ferrari", "F350");
        assertTrue(c4.ehIgual(c5));
    }
    
    @Test
    public void testeNaoEhIgual(){
        Carro c4 = new Carro(100, 200, "Ferrari", "F350");
        Carro c5 = new Carro(100, 200, "Audi", "A8");
        assertFalse(c5.ehIgual(c4));       
    }
    
    
}
