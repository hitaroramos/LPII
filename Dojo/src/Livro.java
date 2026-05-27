import java.util.ArrayList;

public class Livro {
    private String titulo;
    private String autor;
    private int anoPublicacao;
    private String isbn;
    private int quantidadeDisponivel;

    public static int objetoLivro;
    private static ArrayList<Livro> listaDeIsbn = new ArrayList<>();

public Livro(String titulo, String autor, int anoPublicacao, String isbn, int quantidadeDisponivel) {
        this.titulo = titulo;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
        setIsbn(isbn);
        this.quantidadeDisponivel = quantidadeDisponivel;
        Biblioteca.quantidadeTotalLivro += this.quantidadeDisponivel;
        this.objetoLivro++;
    }


    public Livro(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
        this.quantidadeDisponivel = 1;
        Biblioteca.quantidadeTotalLivro++;
        this.objetoLivro++;
    }


    public void setIsbn(String isbn) {
        boolean testIsbn = true;

        for (Livro livro : listaDeIsbn) {
            if (livro.getIsbn().equals(isbn)) {
                System.out.println("Isbn ja cadastrado");
                testIsbn = false;
                break; 
            }
        }

        if(testIsbn) {
            this.isbn = isbn; 
            listaDeIsbn.add(this);
        } else {
            System.out.println("isbn ja castrado");
        }
    }
    
    public String getTitulo() {
        return this.titulo;
    }

    public String getIsbn() {
        return this.isbn;
    }

    public void emprestarLivro() {
        if(this.quantidadeDisponivel > 0){
            this.quantidadeDisponivel--;
            Biblioteca.quantidadeTotalLivro--;
        }
        else{
            System.out.println("Sem livro disponiveis\n\n");
        }
    }

    public void devolverLivro() {
        this.quantidadeDisponivel++;
            Biblioteca.quantidadeTotalLivro++;
    }

    public void exibirInformacoes() {
        System.out.println("Titulo: " + this.titulo);
        System.out.println("Autor: " + this.autor);
        System.out.println("Ano de Publicação: " + this.anoPublicacao);
        System.out.println("Isbn: " + this.isbn);
        System.out.println("Livros disponiveis: " + this.quantidadeDisponivel);
    }

}