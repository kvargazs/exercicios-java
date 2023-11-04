import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio03 {
    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Digite o primeiro número: ");
            int numero1 = scanner.nextInt();

            System.out.println("Digite o segundo número: ");
            int numero2 = scanner.nextInt();

            System.out.println("Números digitados: " + numero1 + " e " + numero2);
        } catch (InputMismatchException e) {
            System.err.println("Números inválidos! Você inseriu números inteiros.");
        }
    }
}
