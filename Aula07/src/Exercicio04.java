import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio04 {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Digite o primeiro número: ");
            int numero1 = scanner.nextInt();

            System.out.println("Digite o segundo número: ");
            int numero2 = scanner.nextInt();

            System.out.println("Escolha a operação:\n 0 - Adição\n 1 - Subtração\n 2 - Multiplicação\n 3 - Divisão\n");
            int escolhaOperacao = scanner.nextInt();

            OperacaoDesejada operacao = OperacaoDesejada.values()[escolhaOperacao];

            Calculadora calculadora = new Calculadora();

            int resultado = 0;

            switch (operacao) {
                case ADICAO:
                    resultado = calculadora.adicionar(numero1, numero2);
                    System.out.println("Resultado da adição: " + resultado);
                    break;
                case SUBTRACAO:
                    resultado = calculadora.subtrair(numero1, numero2);
                    System.out.println("Resultado da subtração: " + resultado);
                    break;
                case MULTIPLICACAO:
                    resultado = calculadora.multiplicar(numero1, numero2);
                    System.out.println("Resultado da multiplicação: " + resultado);
                    break;
                case DIVISAO:
                    try {
                        resultado = calculadora.dividir(numero1, numero2);
                        System.out.println("Resultado da divisão: " + resultado);
                    } catch (ArithmeticException e) {
                        System.err.println("Erro: " + e.getMessage());
                    }
                    break;
                default:
                    System.err.println("Operação inválida. Escolha uma operação válida.");
            }
        } catch (InputMismatchException e) {
            System.err.println("Números inválidos! Você inseriu números inteiros.");
        }
    }
}