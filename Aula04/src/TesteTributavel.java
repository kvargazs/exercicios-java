public class TesteTributavel {
    public static void main(String[] args) {
        // Criando objetos tributáveis
        ContaCorrente contaCorrente = new ContaCorrente();
        ContaPoupanca contaPoupanca = new ContaPoupanca();
        SeguroDeVida seguroDeVida = new SeguroDeVida();

        // Calculando tributos
        double tributoContaCorrente = contaCorrente.calculaTributos();
        double tributoContaPoupanca = contaPoupanca.calculaTributos();
        double tributoSeguroDeVida = seguroDeVida.calculaTributos();

        // Exibindo tributos
        System.out.println("Tributo da Conta Corrente: " + tributoContaCorrente);
        System.out.println("Tributo da Conta Poupança: " + tributoContaPoupanca);
        System.out.println("Tributo do Seguro de Vida: " + tributoSeguroDeVida);
    }
}