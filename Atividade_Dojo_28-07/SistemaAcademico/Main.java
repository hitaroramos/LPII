import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Faculdade faculdade = new Faculdade();
        int op = -1;

        while (op != 0) {
            System.out.println("\n-- SISTEMA ACADÊMICO DE ESTUDANTES ---");
            System.out.println("1. Cadastrar Estudante");
            System.out.println("2. Buscar Estudante por Matrícula");
            System.out.println("3. Listar todos os Estudantes");
            System.out.println("4. Editar Estudante");
            System.out.println("5. Excluir Estudante");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");

            op = scanner.nextInt();
            scanner.nextLine();

            switch (op) {
                case 1:
                    System.out.println("\n--- Cadastro de Estudante ---");
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("CPF: ");
                    String cpf = scanner.nextLine();
                    System.out.print("Matrícula: ");
                    String matricula = scanner.nextLine();
                    System.out.print("Curso: ");
                    String curso = scanner.nextLine();
                    System.out.print("Semestre: ");
                    String semestre = scanner.nextLine();

                    Estudante novo = new Estudante(nome, cpf, matricula, curso, semestre);
                    faculdade.incluir(novo);
                    break;

                case 2:
                    System.out.println("\n--- Buscar Estudante ---");
                    System.out.print("Digite a Matrícula: ");
                    String matriculaBusca = scanner.nextLine();
                    faculdade.pesquisar(matriculaBusca);
                    break;

                case 3:
                    faculdade.lista();
                    break;

                case 4:
                    System.out.println("\n--- Editar Estudante ---");
                    System.out.print("Digite a Matrícula do estudante a ser alterado: ");
                    String matriculaEdicao = scanner.nextLine();

                    System.out.println("Digite os novos dados:");
                    System.out.print("Novo Nome: ");
                    String novoNome = scanner.nextLine();
                    System.out.print("Novo CPF: ");
                    String novoCpf = scanner.nextLine();
                    System.out.print("Novo Curso: ");
                    String novoCurso = scanner.nextLine();
                    System.out.print("Novo Semestre: ");
                    String novoSemestre = scanner.nextLine();

                    Estudante editado = new Estudante(novoNome, novoCpf, matriculaEdicao, novoCurso, novoSemestre);
                    faculdade.editar(matriculaEdicao, editado);
                    break;

                case 5:
                    System.out.println("\n--- Excluir Estudante ---");
                    System.out.print("Digite a Matrícula a ser removida: ");
                    String matExclusao = scanner.nextLine();
                    faculdade.excluir(matExclusao);
                    break;

                case 0:
                    System.out.println("Saindo do sistema... ");
                    break;

                default:
                    System.out.println("Opção inválida! Tente novamente.");
                    break;
            }
        }

        scanner.close();
    }
}