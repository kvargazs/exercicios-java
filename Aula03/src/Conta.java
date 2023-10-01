import java.util.Scanner;

public class Conta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        ContaBancaria minhaConta = new ContaBancaria(
                "Karoline Vargas",    // Nome do titular da conta
                "03448829860",              // CPF
                295730782,                  // Número de identificação da conta
                "Av. Oswaldo Aranha, 4720", // Endereço
                1000.0                      // Saldo inicial
        );

        //imrpime informações da conta
        System.out.println("Deseja verificar suas informações? \n1 - SIM \n2 - NÃO");
        int opcao = scanner.nextInt();
        if (opcao == 1) {
            minhaConta.verificarInformacoes();
        }

        //operações da conta (saque, depósito, etc)
        minhaConta.saque(200.0);
        minhaConta.deposito(500.0);
        minhaConta.verificarSaldo();

        scanner.close();
    }
}
