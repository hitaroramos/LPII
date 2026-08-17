import java.util.List;
import java.util.ArrayList;

public class LivroService implements ILivros
{
    List<Livro> lista_Livros = new ArrayList<>();

    @Override
    public void adicionar(Livro livroAdicionar)
    {
        lista_Livros.add(livroAdicionar);
    }

    @Override
    public void remove(Livro livroRemove)
    {
        lista_Livros.remove(livroRemove);
    }

    @Override
    public void listar()
    {
        for(Livro livro : lista_Livros)
        {
            System.out.println("\nExibindo Livro: ");
            System.out.println("Titulo: " + livro.getLivroTitulo());
            System.out.println("Lsbn: " + livro.getLsbn());
            System.out.println("Autor: " + livro.getAutor());
            System.out.println("Editora: " + livro.getEditora() + "\n");
        }
    }

    @Override
    public boolean encontrar(Livro livroEncontrar)
    {
        for(Livro livro : lista_Livros)
        {
            if(livroEncontrar.getLivroTitulo().equals(livro.getLivroTitulo()))
            {
                System.out.println("\nLivro encontrado!");
              return true;
            }
        }

        System.out.println("\nLivro não encontrado!");
        return false;
    }

    @Override
    public Livro obter(Livro livroObter)
    {
        System.out.println("\nLivro obtido! ");

        for(Livro livro : lista_Livros)
        {
            if(livro.getLivroTitulo().equals(livroObter.getLivroTitulo()))
            {
                System.out.println("\nLivro excluido da lista!");
                lista_Livros.remove(livro);
                return livro;
            }
        }

        System.out.println("\nLivro não encontrado!");
        return null;
    }

    @Override
    public boolean quantidade()
    {
        return lista_Livros.isEmpty();
    }


}
