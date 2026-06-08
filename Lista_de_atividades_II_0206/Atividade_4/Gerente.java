public class Gerente extends Funcionario
{
    @Override
    public void gerarRelatorio()
    {
        System.out.println("Não pode gerar relatório.");
    }
}