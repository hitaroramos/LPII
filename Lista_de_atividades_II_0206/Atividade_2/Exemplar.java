public class Exemplar 
{
    private int id;
    private Livro livro;
    private int numeroExemplar;
    private String status;

    public Exemplar(int id, Livro livro, int numeroExemplar, String status) 
    {
        this.id = id;
        this.livro = livro;
        this.numeroExemplar = numeroExemplar;
        this.status = status;
    }

    public int getId() 
    { 
        return id; 
    }
    public Livro getLivro() 
    { 
        return livro; 
    }
    public String getStatus() 
    { 
        return status; 
    }
}
