public class Exercicio03 {
    public static void main(String[] args) {
        //criando objetos tributáveis
        ContaCorrente contaCorrente = new ContaCorrente();
        ContaPoupanca contaPoupanca = new ContaPoupanca();
        SeguroDeVida seguroDeVida = new SeguroDeVida();

        //calculo dos tributos
        double tributoContaCorrente = contaCorrente.calculaTributos();
        double tributoContaPoupanca = contaPoupanca.calculaTributos();
        double tributoSeguroDeVida = seguroDeVida.calculaTributos();

        //tributos
        System.out.println("Conta corrente: " + tributoContaCorrente);
        System.out.println("Conta poupança: " + tributoContaPoupanca);
        System.out.println("Seguro de vida: " + tributoSeguroDeVida);

        //gerenciador de imposto de renda
        GerenciadorDeImpostoDeRenda gerenciador = new GerenciadorDeImpostoDeRenda();

        //adicionando objetos tributáveis ao gerenciador
        gerenciador.adicionar(contaCorrente);
        gerenciador.adicionar(contaPoupanca);
        gerenciador.adicionar(seguroDeVida);

        // Obtendo o total de imposto calculado
        double totalImposto = gerenciador.getTotalImposto();

        //total de imposto
        System.out.println("Total de Imposto a Pagar: " + totalImposto);
    }
}

