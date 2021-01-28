package triangulo;

public class Triangulo {

    int a, b, c;
    int data[];

    public Triangulo(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
         
    public boolean ehTriangulo() {
        boolean triangulo;
        if ((a<=b+c) && (b<=a+c) && (c<=a+b)){
            triangulo = true;
        } else {
            triangulo = false;
        }
        return triangulo;
    }

    public String tipoTriangulo() {
        String tipo = null;
        if(this.ehTriangulo()) {
            if (a == b && b == c) {
                tipo = "Equilatero";
            }
            if ((a == b) || (a == c) || (b==c)) {
                tipo = "Isosceles";
            }
            else{
                tipo = "Escaleno";
            }
        }
        return tipo;
    }
}
