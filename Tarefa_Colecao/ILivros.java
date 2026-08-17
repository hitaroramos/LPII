public interface ILivros {
    void adicionar(Livro livroAdicionar);
    void remove(Livro livroRemove);
    void listar();
    boolean encontrar(Livro livroProcura);
    Livro obter(Livro livroObter);
    boolean quantidade();
}
