import java.util.Scanner;

public class Conta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ContaBancaria minhaConta = new ContaBancaria(
                "Karoline Vargas",    // Nome do titular da conta
                "03448829860",              // CPF
                295730782,                  // Número de identificação da conta1
                "Av. Oswaldo Aranha, 4720", // Endereço
                0                      // Saldo inicial
        );

        //imrpime informações da conta
        System.out.println("Deseja verificar suas informações? \n1 - SIM \n2 - NÃO");
        int opcaoInfo = scanner.nextInt();
        if (opcaoInfo == 1) {
            minhaConta.verificarInformacoes();
        }

        System.out.println("O que deseja? \n1 - Saque \n2 - Deposito \n3 - Pix");
        int opcaoBanco = scanner.nextInt();
        if (opcaoBanco == 1) {
            System.out.println("Digite o valor de saque: R$");
            double saque = scanner.nextDouble();
            minhaConta.saque(saque);
            minhaConta.verificarSaldo();
        } else if (opcaoBanco == 2) {
            System.out.println("Digite o valor do depósito: R$");
            double deposito = scanner.nextDouble();
            minhaConta.deposito(deposito);
            minhaConta.verificarSaldo();
        } else if (opcaoBanco == 3) {
            System.out.println("Digite o valor do pix: R$");
            double pix = scanner.nextDouble();
            minhaConta.pix(pix);
            minhaConta.verificarSaldo();
        } else {
            System.out.println("Opção inválida!");
        }
        //operações da conta (saque, depósito, etc)
        //minhaConta.saque(200.0);
        //minhaConta.deposito(600.0);
        //minhaConta.verificarSaldo();

        scanner.close();
    }
}
