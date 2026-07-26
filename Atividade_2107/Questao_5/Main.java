package Questao_5;

public class Main 
{
    public static void main(String [] args)
    {
        System.out.println("---------------");

        Aluno a1 = new Aluno("lui", 12);
        a1.realizarMatricula();

        a1.aluno();

        a1.exibirDados();

        System.out.println("---------------");

        Professor p1 = new Professor("fazio", 1234);
        p1.professor();

        p1.ministrarDisciplina("Matemática");

        p1.exibirDados();

        System.out.println("---------------");

        Coordenador c1 = new Coordenador("jorgin", 2122);

        c1.coordenador();

        c1.planoEnsino(true);

        c1.exibirDados();

    }    
}
