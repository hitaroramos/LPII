public abstract class Pessoa
{
    private String nome;
    private String cpf;

    public void setNome(String pNome)
    {
        this.nome = pNome;
    }

    public String getNome()
    {
        return this.nome;
    }

    public void setCpf(String pCpf)
    {
        this.cpf = pCpf;
    }

    public String getCpf()
    {
        return this.cpf;
    }
}