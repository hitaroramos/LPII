public class Produto
{
    private String nome;
    private double preco;
    private int quant_estoque;
    private static int count = 0;

    public Produto(String nome)
    {
        this.nome = nome;
        count++;
    }

    public String getNome()
    {
        return nome;
    }

    public void setPreco(float preco)
    {
        if(preco > 0.0)
        {
            this.preco = preco;
        }
        else
        {
            System.out.println("Erro, valor inexistente.");
        }
    }
    
    public void setEstoque(int quant_estoque)
    {
        if(quant_estoque > 0)
        {
            this.quant_estoque = quant_estoque;
        }
        else
        {
            System.out.println("Erro, valor inexistente.");
        }
    }

    public double calcularValorEstoque()
    {
        double valor_estoque = this.preco * this.quant_estoque; 
        return valor_estoque;
    }

    public static int getCount()
    {
        return count;
    }

}