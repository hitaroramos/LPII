import java.util.Scanner;
import java.util.ArrayList;

public class App {

    static ArrayList<Livro> listaDeLivros = new ArrayList<>();

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int op, id = 0;

        do{
            System.out.println("\n---  MENU  ---");
            System.out.println("(1) - Cadastra Livro");
            System.out.println("(2) - Buscar Livro");
            System.out.println("(3) - Emprestimo de Livro");
            System.out.println("(4) - Devolver Livro");
            System.out.println("(5) - Teste");
            System.out.println("(0) - Sair");
            System.out.println("--------------");

            Biblioteca.exibirTotalLivros();
            System.out.print("\nDIGITE: ");

            op = scan.nextInt();
            scan.nextLine();
            
            if (op == 1) {
                cadastraLivro(scan, listaDeLivros);
            }
            
            else if (op == 2) {
                System.out.println("\n---  BUSCAR LIVROS  ---\n");
                System.out.println("Digite o nome do livro: ");
                String buscador = scan.nextLine();
                buscarLivro(buscador, listaDeLivros);
            }

            else if (op == 3) {
                System.out.println("\n---  Emprestimo de LIVROS  ---\n");
                System.out.println("Digite o nome do livro voce quer: ");
                String nome = scan.nextLine();
                Emprestimo(nome, listaDeLivros);
            }

            else if (op == 4) {
                System.out.println("\n---  Devolucao de LIVROS  ---\n");
                System.out.println("Digite o nome do livro voce quer devolver: ");
                String nome = scan.nextLine();
                Devolucao(nome, listaDeLivros);
            }

            else if (op == 5) {
                Livro livro1 = new Livro("Java", "professor", 2020, "2ed", 10);
                listaDeLivros.add(livro1);

                Livro livro2 = new Livro("ebook", "aluno", 2018, "1e", 4);
                listaDeLivros.add(livro2);
                
                Livro livro3 = new Livro("C#", "programador");
                listaDeLivros.add(livro3);


                Usuario user = new Usuario("test", "2026ru", "pedagogia");


                Biblioteca biblioteca = new Biblioteca("Biblioteca publica");



                Livro livroEncontrado = null;

                for (Livro livro : listaDeLivros) {
                    livroEncontrado = livro;

                    livro.exibirInformacoes();
                    System.out.println("-------------------------");
                }
                
                Biblioteca.exibirTotalLivros();


                System.out.println("\n-------------------------");
                user.exibirUsuario();
                System.out.println("");
            }

            else if (op == 0) {
                break;
            }

            else{
                System.out.println("Escolha uma das opções");
            }
        } while (op != -1);

    }

    static void Emprestimo(String nome, ArrayList<Livro> listaDeLivros){
        Livro livroEncontrado = null;

        for (Livro livro : listaDeLivros) {
            if (livro.getTitulo().equalsIgnoreCase(nome)) {
                livroEncontrado = livro; 
                break; 
            }
        }
            if(livroEncontrado != null) {
                livroEncontrado.emprestarLivro();
                livroEncontrado.exibirInformacoes();
            } else {
                System.out.println("livro nao encontrado");
            }        
    }


    static void Devolucao(String nome, ArrayList<Livro> listaDeLivros){
        Livro livroEncontrado = null;

        for (Livro livro : listaDeLivros) {
            if (livro.getTitulo().equalsIgnoreCase(nome)) {
                livroEncontrado = livro; 
                break; 
            }
        }
            if(livroEncontrado != null) {
                livroEncontrado.devolverLivro();
                livroEncontrado.exibirInformacoes();
            } else {
                System.out.println("livro nao cadastrado");
            }        
    }


    static void cadastraLivro(Scanner scan, ArrayList<Livro> listaDeLivros){

        System.out.println("\n---  CADASTRO LIVRO  ---\n");
        System.out.println("Digite o nome do livro: ");
        String nome = scan.next();

        System.out.println("Digite o autor do livro: ");
        String autor = scan.next();

        System.out.println("Digite o ano de publicação do livro: ");
        int ano = scan.nextInt();
        scan.nextLine();

        System.out.println("Digite o Isbn do livro: ");
        String isbn = scan.next();

        System.out.println("Digite o quantidade de livros: ");
        int quant = scan.nextInt();
        scan.nextLine();

        Livro livro = new Livro(nome, autor, ano, isbn, quant);
        listaDeLivros.add(livro);
    }


    static void buscarLivro(String buscador, ArrayList<Livro> listaDeLivros){
        
        Livro livroEncontrado = null;

        for (Livro livro : listaDeLivros) {
            if (livro.getTitulo().equalsIgnoreCase(buscador)) {
                livroEncontrado = livro; 
                break; 
            }
        }

        if (livroEncontrado != null) {
            livroEncontrado.exibirInformacoes();
        } else {
            System.out.println("Livro nao encontrado.");
        }

    }


}