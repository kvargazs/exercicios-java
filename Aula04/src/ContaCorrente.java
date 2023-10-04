public class ContaCorrente extends Conta implements Tributavel {
    @Override
    public double calculaTributos() {
        return getSaldo() * 0.01; // 1% de tributação sobre o saldo
    }
}