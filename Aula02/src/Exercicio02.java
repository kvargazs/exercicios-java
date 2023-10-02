// 02. Implemente uma calculadora, onde o usuário deve entrar com 2 números e escolher a operação que deseja realizar. Durante a execução o programa deve perguntar ao usuário se ele deseja continuar, se ele não quiser, deve digitar ‘n’ para o programa encerrar.

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Digite seu primeiro número: ");
            double numero1 = scanner.nextDouble();

            System.out.println("Digite seu segundo número: ");
            double numero2 = scanner.nextDouble();

            System.out.println("Escolha a operação: \n1. + \n2. - \n3. * \n4. /");
            int operacao = scanner.nextInt();

            if (operacao == 1) {
                double resultado = numero1 + numero2;
                System.out.println("Sua soma é: " + resultado);
            } else if (operacao == 2) {
                double resultado = numero1 - numero2;
                System.out.println("Sua subtração é: " + resultado);
            } else if (operacao == 3) {
                double resultado = numero1 * numero2;
                System.out.println("Sua multiplicação é: " + resultado);
            } else if (operacao == 4) {
                double resultado = numero1 / numero2;
                System.out.println("Sua divisão é: " + resultado);
            } else {
                System.out.println("Opção inválida.");
            }
            System.out.println("Deseja continuar? (s/n): ");
            String resposta = scanner.next();
            if (resposta.equalsIgnoreCase("n")) {
                break;
            }
        }
        System.out.println("Programa encerrado!");
        scanner.close();
    }
}
