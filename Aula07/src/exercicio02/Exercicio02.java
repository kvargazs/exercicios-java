package exercicio02;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o dia da semana (em maiúsculas):");
        String entradaUsuario = scanner.nextLine();

        try {
            DiaDaSemana dia = DiaDaSemana.valueOf(entradaUsuario);
            switch (dia) {
                case SEGUNDA:
                case TERCA:
                case QUARTA:
                case QUINTA:
                case SEXTA:
                    System.out.println("É um dia útil.");
                    break;
                case SABADO:
                case DOMINGO:
                    System.out.println("É final de semana, dia de dar uma banda!");
                    break;
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Dia da semana inválido. Certifique-se de digitar corretamente.");
        }

        scanner.close();
    }
}
