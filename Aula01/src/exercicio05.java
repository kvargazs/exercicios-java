// 05. Crie um programa que armazene um horário (hora, minuto e segundo) em variáveis, depois, determine e exiba a quantidade de segundos que se passaram desde as 0h00min0s e a quantidade de segundos que faltam para a meia-noite.

import java.util.Scanner;

public class exercicio05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a hora atua (Entre 00h e 23h): "); //Digita a hora
        int horaAtual = scanner.nextInt();
        System.out.print("Digite os minutos atuais (Entre 00min e 59min): "); //Digita os minutos
        int minutoAtual = scanner.nextInt();
        System.out.print("Digite os segundos atuais (Entre 00s e 59s): "); //Digita os segundos
        int segundoAtual = scanner.nextInt();

        //quantidade de segundos desde meia-noite
        int segundosDesdeMeiaNoite = horaAtual * 3600 + minutoAtual * 60 + segundoAtual;

        //quantidade de segundos até meia-noite
        int segundosAteMeiaNoite = 24 * 3600 - segundosDesdeMeiaNoite;

        System.out.println("Segundos desde meia-noite: " + segundosDesdeMeiaNoite);
        System.out.println("Segundos para meia noite: " + segundosAteMeiaNoite);

        scanner.close();
    }
}
