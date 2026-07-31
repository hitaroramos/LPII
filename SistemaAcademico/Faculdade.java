import java.util.ArrayList;

public class Faculdade implements Ipersistencia {
    public static ArrayList<Estudante> listaDeEstudates = new ArrayList<>();

    public boolean incluir(Estudante estudante) {
        if (estudante != null) {
            listaDeEstudates.add(estudante);
            System.out.println("Estudante cadastrado.");
            return true;
        }
        return false;
    }

    public boolean excluir(String matricula) {
        for (Estudante estudante : listaDeEstudates) {
            if (estudante.getMatricula().equals(matricula)) {
                listaDeEstudates.remove(estudante);
                System.out.println("Estudante removido.");
                return true;
            }
        }
        System.out.println("Matrícula não encontrada.");
        return false;
    }

    public boolean pesquisar(String matricula) {
        for (Estudante estudante : listaDeEstudates) {
            if (estudante.getMatricula().equals(matricula)) {
                System.out.printf("Estudante encontrado: %s | Curso: %s ", estudante.getNome(), estudante.getCurso());
                return true;
            }
        }
        System.out.println("Estudante não encontrado.");
        return false;
    }

    public boolean lista() {
        if (listaDeEstudates.isEmpty()) {
            System.out.println("Nenhum estudante cadastrado.");
            return false;
        }
        System.out.println("\n--- Lista de Estudantes ---");
        for (Estudante estudante : listaDeEstudates) {
            System.out.println("Matrícula: " + estudante.getMatricula());
            System.out.println("Nome: " + estudante.getNome()); 
            System.out.println("Curso: " + estudante.getCurso());
        }
        return true;
    }


    public boolean editar(String matricula, Estudante estudanteAtualizado) {
        for (int i = 0; i < listaDeEstudates.size(); i++) {
            if (listaDeEstudates.get(i).getMatricula().equals(matricula)) {
                listaDeEstudates.set(i, estudanteAtualizado);
                System.out.println("Dados do estudante atualizados com sucesso!");
                return true;
            }
        }
        System.out.println("Estudante não encontrado para edição.");
        return false;
    }
}