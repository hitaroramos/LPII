public class Produto 
{
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade) 
    {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public Produto(String nome, double preco) 
    {
        this(nome, preco, 0); 
    }

    public Produto(String nome) 
    {
        this(nome, 0.0, 0);
    }

    public String getNome() 
    { 
        return nome; 
    }

    public double getPreco() 
    { 
        return preco; 
    }

    public int getQuantidade() 
    { 
        return quantidade; 
    }
}    

