public class Main 
{
    public static void main(String[] args)
    {
        Pessoa aluno = new Aluno("jorge", "9347", "84957");

        aluno.exibirDados();

        Pessoa professor = new Professor("jonas", "193475", "Matemática");

        professor.exibirDados();
        
    }    
}
