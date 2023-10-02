// 12. Crie um programa que converta uma quantia em dólares para outra moeda, como euros ou reais. Peça ao usuário para inserir a quantia em dólares e a taxa de câmbio atual. Em seguida, calcule e exiba o valor convertido.

import java.util.Scanner;

public class Exercicio12 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor em dólares: ");
        double dolares = scanner.nextDouble();

        System.out.print("Digite a taxa de câmbio atual: ");
        double taxa = scanner.nextDouble();

        double moeda = dolares * taxa;

        System.out.println("O valor convertido é: " + moeda);

        scanner.close();
    }
}
