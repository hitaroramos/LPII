public class Aluno extends Pessoa
{
    private static int matricula;
    private String curso;

    public void gerarMatricula()
    {
        matricula++;
    }

    public int getMatricula()
    {
        return matricula;
    }

    public void setCurso(String curso)
    {
        this.curso = curso;
    }
    public String getCurso()
    {
        return this.curso;
    }

    
}