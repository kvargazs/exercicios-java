// 07. Criar para uma empresa de consórcio. No teste inicial, você deve perguntar para o usuário a idade dele e o seu salário. A pessoa só pode comprar um automóvel se for de maior e ganhar mais de R$ 2.000,00.

import java.util.Scanner;

public class exercicio07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("===== SEJA BEM-VINDO(A) A MOTOCARS! =====");

        System.out.print("Digite sua idade: ");
        int idade = scanner.nextInt();
        System.out.print("Digite seu salário: R$");
        double salario = scanner.nextInt();

        if (idade >= 18 && salario >= 2000) { //se idade for maior ou igual a 18 e salário maior ou igual a R$2000, pode comprar
            System.out.print("Escolha seu carro: \nPOPULARES: \n1 - Chevrolet Onix R$81.170 \n2 - Volkswagen Gol R$78.160 \n3 - Hyundai HB20 R$77.790 \n4 - Fiat Cronos R$81.990 \n5 - Renault Kwid R$66.590\n\nMÉDIOS: \n6 - Chevrolet Tracker R$120.990 \n7 - Volkswagen T-Cross R$136.990 \n8 - Jeep Compass R$176.790 \n9 - Toyota Corolla R$148.290 \n10 - Volkswagen Nivus R$127.390");
            int escolhaCarro = scanner.nextInt();

            double precoCarro = 0;

            if (escolhaCarro >= 1 && escolhaCarro <= 10) {
                if (escolhaCarro == 1) {
                    precoCarro = 81.170;
                } else if (escolhaCarro == 2) {
                    precoCarro = 78.160;
                } else if (escolhaCarro == 3) {
                    precoCarro = 77.790;
                } else if (escolhaCarro == 4) {
                    precoCarro = 81.990;
                } else if (escolhaCarro == 5) {
                    precoCarro = 66.590;
                }else if (escolhaCarro == 6) {
                    precoCarro = 120.990;
                } else if (escolhaCarro == 7) {
                    precoCarro = 136.990;
                } else if (escolhaCarro == 8) {
                    precoCarro = 176.790;
                } else if (escolhaCarro == 9) {
                    precoCarro = 148.290;
                } else if (escolhaCarro == 10) {
                    precoCarro = 127.390;
                } else {
                    System.out.println("Opção inválida.");
                }

                System.out.println("Você escolheu o carro " + escolhaCarro);
                System.out.println("O preço a pagar é: R$" + precoCarro);
            } else {
                System.out.println("Opção de carro inválida.");
            }

        } else {
            System.out.println("Você não pode comprar na MotoCars, você é menor de idade ou tem um salário menor que R$2000");
        }

        scanner.close();
    }
}
