/*
 * 
 */
package projetocarro;

/**
 *
 * @author AMN
 */
public class Carro {

    // atributos da classe
    private String marca;
    private String modelo;
    private int potencia;
    private int velocidade;

    // metodo construtor
    public Carro(int potencia, int velocidade) {
        this.potencia = potencia;
        this.velocidade = velocidade;
    }

    public Carro(int potencia, int velocidade, String marca, String modelo) {
        this.potencia = potencia;
        this.velocidade = velocidade;
        this.marca = marca;
        this.modelo = modelo;
    }

    // metodos (requisitos funcionais)
    public void frear() {
        reduzir();
        parar();
    }

    public void parar() {
        velocidade = 0;
    }

    public void reduzir() {
        while (velocidade > 10) {
            velocidade -= 10;
        }
    }

    public void acelerar(int potencia) {
        velocidade += potencia;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public boolean ehIgual(Carro p) {
        boolean resposta = false;
        if ((marca == p.marca) && (modelo == p.modelo) && (potencia == p.potencia)) {
            resposta = true;
        }
        return resposta;
    }
}
