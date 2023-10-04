import java.util.LinkedList;
import java.util.Scanner;

public class Exercicio06 {
    public static void main(String[] args) {
        LinkedList<Reserva> listaDeReservas = new LinkedList<>();
        Scanner scanner = new Scanner(System.in);
        boolean sair = false;

        while (!sair) {
            System.out.println("1 - Reservar passagem");
            System.out.println("2 - Cancelar reserva");
            System.out.println("3 - Exibir lista de reservas");
            System.out.println("4 - Sair do programa");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite o nome do passageiro: ");
                    String nome = scanner.nextLine();
                    System.out.print("Digite o local de destino: ");
                    String local = scanner.nextLine();
                    System.out.print("Digite o CPF do passageiro: ");
                    String cpf = scanner.nextLine();
                    System.out.print("Digite a data de entrada: ");
                    String dataEntrada = scanner.nextLine();
                    System.out.print("Digite a data de saída: ");
                    String dataSaida = scanner.nextLine();

                    Reserva reserva = new Reserva(nome, local, cpf, dataEntrada, dataSaida);
                    listaDeReservas.add(reserva);
                    System.out.println("Reserva feita!");
                    break;
                case 2:
                    System.out.print("Digite o CPF do passageiro para cancelar a reserva: ");
                    String cpfCancelar = scanner.nextLine();
                    boolean removida = false;

                    if (!listaDeReservas.isEmpty()) {
                        Reserva reservaParaCancelar = listaDeReservas.peek();
                        if (reservaParaCancelar.getCpf().equals(cpfCancelar)) {
                            listaDeReservas.poll();
                            System.out.println("Reserva cancelada!");
                            removida = true;
                        }
                    }
                    if (!removida) {
                        System.out.println("Reserva não encontrada ou lista vazia.");
                    }
                    break;
                case 3:
                    System.out.println("Lista de reservas:");
                    for (Reserva r : listaDeReservas) {
                        System.out.println("Nome: " + r.getNome());
                        System.out.println("Local: " + r.getLocal());
                        System.out.println("CPF: " + r.getCpf());
                        System.out.println("Data de entrada: " + r.getDataEntrada());
                        System.out.println("Data de saída: " + r.getDataSaida());
                        System.out.println();
                    }
                    break;
                case 4:
                    System.out.println("Saindo... bye.");
                    scanner.close();
                    sair = true;
                    break;
                default:
                    System.out.println("Opção inválida! Digite uma opção válida.");
            }
        }
    }
}