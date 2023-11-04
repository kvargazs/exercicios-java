package Exercicio03;

import java.util.Scanner;
import java.util.TreeMap;

public class Exercicio03 {
    public static void main(String[] args) {
        //TreeMap armazena os contatos
        TreeMap<String, Contatos> agenda = new TreeMap<>();

        //contatos da agenda:
        agenda.put("Ana", new Contatos("12467452034", "Ana", "458 São Paulo", "Norte"));
        agenda.put("Roberta", new Contatos("51357356074", "Roberta", "2108 Porto Alegre", "Sul"));
        agenda.put("Murilo", new Contatos("42435345233", "Murilo", "1003 Boa Vista", "Leste"));
        agenda.put("Márcio", new Contatos("21888999900", "Márcio", "4070 Uberlândia", "Oeste"));
        agenda.put("Pedro", new Contatos("51667778899", "Pedro", "1102 Tramandaí", "Centro"));
        agenda.put("Bruna", new Contatos("11305826756", "Bruna", "302 Neópolis", "Sul"));

        //scanner que recebe a entrada do usuário
        Scanner scanner = new Scanner(System.in);

        //contatos em ordem alfabética
        System.out.println("Contatos em ordem alfabética:");
        for (String nome : agenda.keySet()) {
            Contatos contato = agenda.get(nome);
            System.out.println(nome + ": " + contato);
        }

        while (true) {
            //usuário escolhe a região
            System.out.print("\nEscolha a região (Norte, Sul, Leste, Oeste) ou 'sair' para encerrar: ");
            String escolha = scanner.nextLine();

            if (escolha.equalsIgnoreCase("sair")) {
                break;
            }

            System.out.println("Contatos na região " + escolha + " em ordem alfabética:");
            for (Contatos contato : agenda.values()) {
                if (contato.getLocal().equalsIgnoreCase(escolha)) {
                    System.out.println("Nome: " + contato.getNome() + ", " + contato);
                }
            }
        }
        scanner.close();
    }
}