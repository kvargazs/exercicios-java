// 06. Escreva um programa que leia a idade do usuário e imprima respostas diferentes dependendo do número colocado:
// Se for menor de 16 anos, avisar que não pode votar;
// Se tiver 16 ou 17, avisar que o voto é facultativo;
// Se tiver mais de 65, avisar que também é facultativo o voto;
// De 18 até 65, é obrigatório votar.

import java.util.Scanner;

public class exercicio06 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite sua idade: "); //digitar idade
        int idade = scanner.nextInt();

        if (idade < 16) { //se idade for menor que 16, não vota
            System.out.println("Não pode votar!");
        } else if (idade >= 16 && idade < 18 || idade > 65) { //se idade for entre 16 e 17, voto facultativo
            System.out.println("Voto facultativo!");
        } else { //se nao, voto obrigatório
            System.out.println("É obrigado a votar!");
        }
        scanner.close();
    }
}
