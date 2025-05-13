import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Gerenciador gerenciador = new Gerenciador();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\n1. Adicionar tarefa");
            System.out.println("2. Listar tarefas");
            System.out.println("3. Sair");
            System.out.print("Escolha: ");

            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    System.out.print("Digite a tarefa: ");
                    String descricao = scanner.nextLine();
                    gerenciador.adicionarTarefa(descricao);
                    break;
                case 2:
                    gerenciador.listarTarefas();
                    break;
                case 3:
                    scanner.close();
                    System.exit(0);
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }
}