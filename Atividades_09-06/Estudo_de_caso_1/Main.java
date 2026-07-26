package Estudo_de_caso_1;

public class Main
{
    public static void main(String[] args) 
    {
        Funcionario h1 = new FuncionarioHorista("hg", "124425", 2, 10);
        Funcionario m1 = new FuncionarioMensalista("hd", "2348", 2000);

        h1.exibirInformacoes();
        m1.exibirInformacoes();

        Funcionario h2 = new FuncionarioHorista("zenteber", "124425", 3, 10);
        Funcionario m2 = new FuncionarioMensalista("ranzo", "2348", 3000);

        h2.exibirInformacoes();
        m2.exibirInformacoes();

        Funcionario h3 = new FuncionarioHorista("giorgo", "4444", 4, 10);
        Funcionario m3 = new FuncionarioMensalista("lafond", "33338", 4000);

        h3.exibirInformacoes();
        m3.exibirInformacoes();

        Funcionario h4 = new FuncionarioHorista("jalim", "12222", 5, 10);
        Funcionario m4 = new FuncionarioMensalista("rasta", "888888", 5000);

        h4.exibirInformacoes();
        m4.exibirInformacoes();
    }
}