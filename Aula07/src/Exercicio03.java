import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Digite o primeiro número inteiro:");
            int numero1 = scanner.nextInt();

            System.out.println("Digite o segundo número inteiro:");
            int numero2 = scanner.nextInt();

            System.out.println("Você digitou os números: " + numero1 + " e " + numero2);

            // Realize operações com os números, se necessário
        } catch (InputMismatchException e) {
            System.err.println("Entrada inválida. Certifique-se de inserir números inteiros.");
        }
    }
}
