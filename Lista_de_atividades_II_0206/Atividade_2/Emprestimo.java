public class Emprestimo 
{
    private int id;
    private Exemplar exemplar;
    private String dataEmprestimo;
    private String dataDevolucao;
    private String status;

    public Emprestimo(int id, Exemplar exemplar, String dataEmprestimo, String dataDevolucao, String status) 
    {
        this.id = id;
        this.exemplar = exemplar;
        this.dataEmprestimo = dataEmprestimo;
        this.dataDevolucao = dataDevolucao;
        this.status = status;
    }

    public int getId() 
    { 
        return id; 
    }
    public Exemplar getExemplar() 
    { 
        return exemplar; 
    }
    public String getStatus() 
    { 
        return status; 
    }
}
