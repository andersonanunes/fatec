package contacorrente;

/**
 *
 * @author AMN
 */
public class ContaCorrente {

    int saldo;

    public int sacar(int valor){
        if (valor > saldo)
            return 0;
        else {
            saldo -= valor;

            return valor;
        }
    }
    public int depositar(int valor){
        saldo += valor;
        
        return saldo;
    }
    public void encerrarConta(){
        saldo = 0;
    }

    public class ContaEspecial extends ContaCorrente {
        int limite;
        ContaEspecial(int limite){
            this.limite = limite;
        }
        
        @Override
        public int sacar(int valor){
            if (valor > (saldo+limite))
                return 0;
            else{
                saldo -=valor;
            return valor;
            }
        }
    }
}

