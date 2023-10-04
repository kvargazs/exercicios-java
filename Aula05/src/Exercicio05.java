import java.util.LinkedList;
import java.util.Scanner;

public class Exercicio05 {
    public static void main(String[] args) {
        LinkedList<Documentos> filaDeImpressao = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        boolean sair = false;

        while (!sair) {
            System.out.println("1 - Adicionar documento à fila");
            System.out.println("2 - Imprimir documento da fila");
            System.out.println("3 - Sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do documento: ");
                    String nomeDocumento = scanner.next();
                    System.out.print("Digite o número de páginas: ");
                    int numeroPaginas = scanner.nextInt();
                    Documentos documento = new Documentos(nomeDocumento, numeroPaginas);
                    filaDeImpressao.add(documento);
                    System.out.println("Documento adicionado à fila de impressão!");
                    break;
                case 2:
                    if (!filaDeImpressao.isEmpty()) {
                        Documentos documentoParaImprimir = filaDeImpressao.poll();
                        System.out.println("Imprimindo documento: " + documentoParaImprimir.getNome() + " (" + documentoParaImprimir.getNumeroPaginas() + " páginas)");
                    } else {
                        System.out.println("Fila de impressão vazia.");
                    }
                    break;
                case 3:
                    System.out.println("Saindo... bye.");
                    scanner.close();
                    sair = true;
                    break;
                default:
                    System.out.println("Opção inválida! Digite um número válido.");
            }
        }
    }
}