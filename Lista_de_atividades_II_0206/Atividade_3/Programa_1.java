public class Programa_1 {
    public static void main(String[] args)
    {
        Aluno a1 = new Aluno();
        a1.setNome("jorge");
        System.out.println(a1.getNome());
        a1.setCpf("12334");
        System.out.println(a1.getCpf());
        a1.gerarMatricula();
        System.out.println(a1.getMatricula());
        a1.setCurso("mecanica");
        System.out.println(a1.getCurso());

        System.out.println("------");

        Aluno a2 = new Aluno();
        a2.setNome("costela");
        System.out.println(a2.getNome());
        a2.gerarMatricula();
        System.out.println(a1.getMatricula());

        System.out.println("------");

        System.out.println("PROFESSOR:");

        Professor p1 = new Professor();
        p1.setNome("anton");
        System.out.println(p1.getNome());
        p1.setCpf("283478");
        p1.setSalario(12000);
        System.out.println(p1.getSalario());

    }
}
