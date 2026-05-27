public class Usuario {
    private String nome;
    private String matricula;
    private String curso;


    public Usuario(String nome, String matricula, String curso) {
        setNome(nome);
        setMatricula(matricula);
        setCurso(curso);
    }    

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return this.nome;
    }


    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getMatricula() {
        return this.matricula;
    }


    public void setCurso(String curso) {
        this.curso = curso;
    }
    
    public String getCurso() {
        return this.curso;
    }

    public void exibirUsuario() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Matricula: " + this.matricula);
        System.out.println("Curso: " + this.curso);
    }

}