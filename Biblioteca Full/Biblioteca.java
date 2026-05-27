public class Biblioteca {
    String nomeBiblioteca;

    public static int quantidadeTotalLivro;

    public Biblioteca(String nome) {
        this.nomeBiblioteca = nome;
    }

    public static void exibirTotalLivros() {
        System.out.println("Total de livros: " + quantidadeTotalLivro);
    }

}