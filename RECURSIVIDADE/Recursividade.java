package Recursividade;

/* Exercício 6
 * A multiplicacao de dois numeros inteiros pode ser feita atraves de somas sucessivas.
 * Proponha um algoritmo recursivo Multip Rec(n1,n2) que calcule a multiplicacao de dois
 * inteiros. 
*/

import java.util.Scanner;

public class MultiplicaInteiro {

    static Scanner scanner = new Scanner(System.in);

    // multiplica 2 numeros inteiros
    static int Multip_Rec(int n1, int n2) {
        if (n2 == 0) return n2;
        else return n1 + Multip_Rec(n1, n2-1);
    }

    public static void main(String[] args) {
        //System.out.println("O resultado é: " + Multip_Rec(4, 5));

        int n1;
        int n2;

        System.out.print("Digite o primeiro numero inteiro: ");
        n1 = scanner.nextInt();
        
        System.out.print("Digite o segundo numero inteiro: ");
        n2 = scanner.nextInt();

        System.out.println("O resultado é: " + Multip_Rec(n1, n2));

        scanner.close();
    }
}

/* Exercicio 10
 * Faca uma funcao recursiva que receba um numero inteiro positivo par N e imprima todos
 * os numeros pares de 0 ate N em ordem decrescente.
*/

import java.util.Scanner;

public class ImprimePares {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        // instancia o objeto
        ImprimePares nPares = new ImprimePares();
        
        // entrada de dados
        System.out.print("Digite um numero inteiro: ");
        int n = scanner.nextInt();      
        
        // faz a chamada recursiva passando o parametro
        System.out.println(nPares.ImprimeParesRecursivo(n));
        
        // encerra o scanner
        scanner.close();
    }

    // recebe um inteiro N e imprime todos os pares em ordem decrescente
    private int ImprimeParesRecursivo(int n){
        
        // para a chamada do metodo recursivo
        if (n == 0) return 0;
        
        // se o resto da divisao for 0 o numero é par e exibe na tela
        if (n % 2 == 0) 
        System.out.println("Números Pares: " + n);
        
        // senao decrementa o valor e chama novamente o metodo recursivamente
        return ImprimeParesRecursivo(n - 1);
    }
}

/* Exercicio 11
 * Escreva uma funcao recursiva que exibe todos os elementos em um array de inteiros,
 * separados por espaco.
*/

import java.util.Random;
import java.util.Scanner;

public class ArrayVetor {

    public static void main(String[] args) {

        int[] v;
        int n;
    
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite o tamanho do vetor: ");
        n = scanner.nextInt();
        
        // instancia o objeto
        v = new int[n];    
        ArrayVetor vArray = new ArrayVetor();
        
        geraVetor(v, n);
        vArray.print (v); // chamada da funcao recursiva
        scanner.close();
    }

    // gera o vetor com numeros aleatorios
    static void geraVetor(int[] v, int n){
        int i;
        Random random = new Random();
        for(i = 0; i < n; i++){
            v[i] = random.nextInt(n * 10);
        }
    }

    public void print (int[] v) {
        print (v, 0);
    }

    private void print (int[] v, int n) {
        if (n >= v.length) return;
        else
            System.out.print (v [n] + " ");
            print (v, n + 1);
    }
}

/* Exercicio 16
 * Faca uma funcao recursiva que receba um numero inteiro positivo impar N e retorne
 * o fatorial duplo desse numero. O fatorial duplo e definido como o produto de todos os
 * numeros naturais ımpares de 1 ate algum numero natural ımpar N. Assim, o fatorial duplo
 * de 5 e 5!! = 1 * 3 * 5 = 15
*/

import java.util.Scanner;

public class FatDuplo {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        // instancia o objeto
        FatDuplo nFat = new FatDuplo();

        System.out.println("Digite um número inteiro: ");
        int n = scanner.nextInt();
        
        // faz a chamada recursiva passando o parametro
        System.out.println(nFat.recebeFatDuplo(n));
        scanner.close();
    }

    // recebe um inteiro e calcula o fatorial duplo
    private int recebeFatDuplo(int n){
        if (n == 1) return 1;
        if (n % 2 == 0) return recebeFatDuplo(n - 1);
        return n * recebeFatDuplo(n - 2);
    }
}


