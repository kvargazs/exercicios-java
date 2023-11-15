package exercicio06;

public class Conta {
    private double saldo;

    public Conta(double saldoInicial) {
        saldo = saldoInicial;
    }
    public void sacar(double valor) throws SaldoInsuficienteException {
        if (valor > saldo) {
            throw new SaldoInsuficienteException("Saldo insuficiente para sacar " + valor);
        }
        saldo -= valor;
        System.out.println("Saque de " + valor + " realizado com sucesso. Novo saldo: " + saldo);
    }
}


