package exercicio06;

public class Exercicio06 {
    public static void main(String[] args) {
        Conta conta = new Conta(1000.0);

        try {
            conta.sacar(1200.0);
        } catch (SaldoInsuficienteException e) {
            System.err.println("Erro: " + e.getMessage());
        }

        try {
            conta.sacar(800.0);
        } catch (SaldoInsuficienteException e) {
            System.err.println("Erro: " + e.getMessage());
        }
    }
}

