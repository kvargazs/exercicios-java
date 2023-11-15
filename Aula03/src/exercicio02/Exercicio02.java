package exercicio02;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Informe o raio do círculo: ");
        double raio = scanner.nextDouble();
        Circulo circulo1 = new Circulo(raio);

        System.out.println("Informe o raio do segundo círculo: ");
        double raio2 = scanner.nextDouble();
        Circulo circulo2 = new Circulo(raio2);

        boolean iguais = circulo1.doisCirculos(circulo2);

        //calculando a área e a circunferência
        double area1 = circulo1.calcularArea();
        double area2 = circulo2.calcularArea();
        double circunferencia1 = circulo1.calcularCircunferencia();
        double circunferencia2 = circulo2.calcularCircunferencia();

        System.out.println("Círculo 1: " + circulo1.toString());
        System.out.println("Círculo 2: " + circulo2.toString());
        System.out.println("Círculos são iguais? " + iguais);

        scanner.close();
    }
}
