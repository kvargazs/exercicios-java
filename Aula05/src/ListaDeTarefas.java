import java.util.ArrayList;
import java.util.Scanner;

public class ListaDeTarefas {
    public static void main(String[] args) {
        ArrayList<Exercicio03> listaDeTarefas = new ArrayList<>(); //cria uma lista de tarefas usando ArrayList
        Scanner scanner = new Scanner(System.in);

        while (true) {  //inicia um loop infinito para permitir a interação contínua do usuário
            System.out.println("Escolha uma opção: \n");  //menu de opções
            System.out.println("1 - Adicionar tarefa");
            System.out.println("2 - Remover tarefa");
            System.out.println("3 - Exibir todas as tarefas");
            System.out.println("4 - Sair");

            int opcao = scanner.nextInt();

            //estrutura de controle switch
            switch (opcao) {
                case 1: //opcao 1 escolhida, logo:
                    scanner.nextLine();

                    System.out.print("Digite o título da tarefa: ");
                    String titulo = scanner.nextLine();  //lê o título da tarefa
                    System.out.print("Digite a data da tarefa: ");
                    String data = scanner.nextLine();  //lê a data da tarefa
                    System.out.print("Digite a descrição da tarefa: ");
                    String descricao = scanner.nextLine();  //lê a descrição da tarefa

                    Exercicio03 novaTarefa = new Exercicio03(titulo, data, descricao);  //cria uma nova tarefa com os dados fornecidos
                    listaDeTarefas.add(novaTarefa);  //adiciona a nova tarefa à lista de tarefas
                    System.out.println("Tarefa adicionada com sucesso!");
                    break;

                case 2:
                    if (listaDeTarefas.isEmpty()) { //ve se a lista de tarefas ta vazia
                        System.out.println("A lista de tarefas está vazia."); //se sim, essa mensagem aparece
                    } else { //se nao, mostra as tarefas da lista
                        System.out.println("Tarefas na lista:");
                        for (int i = 0; i < listaDeTarefas.size(); i++) {
                            Exercicio03 tarefa = listaDeTarefas.get(i); //pega a tarefa da lista e mostra
                            System.out.println((i + 1) + ". " + tarefa.getTitulo() + " (Data: " + tarefa.getData() + ")");
                        }
                        System.out.print("Digite o número da tarefa a ser removida: ");
                        int numeroTarefa = scanner.nextInt(); //le o número da tarefa para remover
                        if (numeroTarefa >= 1 && numeroTarefa <= listaDeTarefas.size()) { //verifica se o numero de tarefas existe
                            listaDeTarefas.remove(numeroTarefa - 1); //remove a tarefa da lista
                            System.out.println("Tarefa removida com sucesso!");
                        } else { //se o numero de tarefas não existir ele consta:
                            System.out.println("Número de tarefa inválido.");
                        }
                    }
                    break;

                case 3:
                    if (listaDeTarefas.isEmpty()) { //ve se a lista de tarefas ta vazia
                        System.out.println("A lista de tarefas está vazia.");
                    } else { //se nao estiver mostra as tarefas da lista
                        System.out.println("Tarefas na lista:");
                        for (int i = 0; i < listaDeTarefas.size(); i++) {
                            Exercicio03 tarefa = listaDeTarefas.get(i); //pega a  tarefa e mostra os detalhes
                            System.out.println((i + 1) + ". Título: " + tarefa.getTitulo());
                            System.out.println("   Data: " + tarefa.getData());
                            System.out.println("   Descrição: " + tarefa.getDescricao());
                        }
                    }
                    break;

                case 4:
                    System.out.println("Encerrando o programa.");
                    scanner.close();
                    System.exit(0);

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}