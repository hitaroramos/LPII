public class Estudante extends Pessoa{
    private String matricula;
    private String curso;
    private String semestre;

    public Estudante(String nome, String cpf, String matricula, String curso, String semestre){
        super.nome = nome;
        super.cpf = cpf;
        this.matricula = matricula;
        this.curso = curso;
        this.semestre = semestre;
    }

    public Estudante(String nome, String matricula, String curso){
        this(nome, null, matricula, curso, null);
    }

    public void setNome(String nome){super.nome = nome;}
    public void setCpf(String cpf){super.cpf = cpf;}
    public void setMatricula(String matricula){this.matricula = matricula;}
    public void setCurso(String curso){this.curso = curso;}
    public void setSemestre(String semestre){this.semestre = semestre;}

    public String getNome(){return super.nome;}
    public String getCpf(){return super.cpf;}
    public String getMatricula(){return this.matricula;}
    public String getCurso(){return this.curso;}
    public String getSemestre(){return this.semestre;}

}