import org.junit.Test;
import static org.junit.Assert.*;
import contacorrente.ContaCorrente;


public class TesteContaCorrente {
    
    @Test
    public void TesteSacar(){
        int saldo = 100;
        ContaCorrente C0 = new ContaCorrente();
        C0.sacar(saldo);
        assertEquals(0, C0.sacar(saldo));
    }
    
    @Test
    public void TesteDepositar(){
        int saldo = 1000;       
        ContaCorrente C1 = new ContaCorrente();
        C1.depositar(100);
        assertEquals(1100, C1.depositar(saldo));
    }
    
    @Test
    public void EncerrarConta(){
        int saldo = 0;
        ContaCorrente C2 = new ContaCorrente();
        C2.encerrarConta();
        assertEquals(saldo, 0);
    }
    
}
