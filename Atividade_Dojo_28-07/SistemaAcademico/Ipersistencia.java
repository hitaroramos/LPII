public interface Ipersistencia {
    boolean incluir(Estudante estudante);
    boolean excluir(String matricula);
    boolean pesquisar(String matricula);
    boolean lista();
    boolean editar(String matricula, Estudante novoEstudante);
}