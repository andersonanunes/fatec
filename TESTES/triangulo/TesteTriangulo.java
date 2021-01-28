import org.junit.Test;
import static org.junit.Assert.*;
import triangulo.Triangulo;

public class TesteTriangulo {
    
    @Test // verifica se e triangulo
    public void TesteEhTrianguloLadoA() {
        Triangulo Lado = new Triangulo(5, 3, 7);
        boolean condicao = true;
        boolean resp = Lado.ehTriangulo();
        assertEquals("teste", condicao, resp);
    }
    
    @Test // verifica tipo de triangulo
    public void TesteTipoTriangulo1(){
        Triangulo Tipo1 = new Triangulo(5, 5, 5);
        assertEquals("Equilatero", Tipo1.tipoTriangulo());
    }
    
    @Test // verifica tipo de triangulo
    public void TesteTipoTriangulo2(){
        Triangulo Tipo2 = new Triangulo(3, 3, 6);
        assertEquals("Isosceles", Tipo2.tipoTriangulo());
    }    

    @Test // verifica tipo de triangulo
    public void TesteTipoTriangulo3(){
        Triangulo Tipo3 = new Triangulo(3, 2, 4);
        assertEquals("Escaleno", Tipo3.tipoTriangulo());
    }
}
