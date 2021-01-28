package parentizacao;

/* 
 *Classe Pilha
*/

public class Pilha {
    private int topo;
    private String[] expressao;

    public Pilha () {
        this.topo = 0;
        expressao = new String[100];
    }

    public Pilha (int capacidade) {
        this.topo = 0;
        expressao = new String[capacidade];
    }

    public boolean pilhaVazia () {
        return this.topo == 0;
    }

    public boolean pilhaCheia () {
        return this.topo == expressao.length;
    }

    public void push (String elemento) {
        this.expressao[this.topo++] = elemento;
    }

    public String pop () {
        return this.expressao[--this.topo];
    }

    public int tamanhoPilha() {
        return this.topo;
    }

    public String consultaTopo () {
        return this.expressao[this.topo-1];
    }

    @Override
    public String toString() {
        String aux = "Pilha: ";
        if (this.pilhaVazia()) {
            aux += "vazia";
        }
        else {
            for (int i = this.topo-1; i >= 0; i--) {
                aux += this.expressao[i] + " ";
            }
        }
        aux += "\n";
        return aux;
    }
}

/* Classe Main
 * Fazer a leitura de uma String com uma expressao matematica e verificar se faltam abertura ou fechamento de parenteses.
 * Varrer a posição da string até encontrar o parenteses, quando for abertura empilha, quando for fechamento desempilha. 
*/

package parentizacao;

import java.util.Scanner;

public class ValidaExpressao {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite uma expressao matematica: ");
        String c = scan.nextLine();
        int tamanho = (int)c.length();
        
        // instancia o objeto
        Pilha pilha = new Pilha ();
        
        int i;
        for(i = 0; i < tamanho; i++){
            if (c.charAt(i) == '('){ 
                pilha.push(c);
            }  
            if (c.charAt(i) == ')') {
                if(!pilha.pilhaVazia()){
                    pilha.pop();
                } else {
                    i = tamanho + 100;
                }
            }
        }
        
        if (pilha.tamanhoPilha() == 0){
            if(i >= 100){
                System.out.println("Falta abertura de parênteses.");
            } else {
                System.out.println("Expressao ok");
            }
        } else {
            System.out.println("Falta fechamento de parênteses.");    
        }
        scan.close();
    }
}
