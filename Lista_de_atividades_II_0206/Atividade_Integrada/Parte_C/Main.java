import java.time.LocalDate;

public class Main 
{
    public static void main(String[] args) 
    {

        // Composição: Paciente exige Prontuario
        Prontuario prontuario = new Prontuario("Paciente com histórico de hipertensão.");
        Paciente paciente = new Paciente(1, "Ana Silva", "18234872", prontuario);

        // Agregação: Medico existe independentemente da Consulta
        Medico medico = new Medico("Carlos Souza", "1823772844", "CRM-12345");

        Enfermeiro enfermeiro = new Enfermeiro("João Lima", "18237748234");

        // Sobrescrita
        paciente.exibirPerfil();
        medico.exibirPerfil();
        enfermeiro.exibirPerfil();

        // Sobrecarga
        medico.agendarConsulta();
        medico.agendarConsulta(LocalDate.of(2025, 7, 10));
        medico.agendarConsulta(LocalDate.of(2025, 7, 10), "Trazer exames anteriores");

        // Consulta com agregação
        Consulta consulta = new Consulta(paciente, medico);
        consulta.exibirDetalhes();
    }
}
