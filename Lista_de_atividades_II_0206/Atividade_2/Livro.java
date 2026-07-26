public class Livro 
{
    private int id;
    private String titulo;
    private String isbn;
    private Autor autor;
    private int anoPublicacao;

    public Livro(int id, String titulo, String isbn, Autor autor, int anoPublicacao) 
    {
        this.id = id;
        this.titulo = titulo;
        this.isbn = isbn;
        this.autor = autor;
        this.anoPublicacao = anoPublicacao;
    }

    public int getId() 
    { 
        return id; 
    }
    public String getTitulo() 
    { 
        return titulo; 
    }
    public Autor getAutor() 
    { 
        return autor; 
    }
}
