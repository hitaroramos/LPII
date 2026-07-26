import java.time.LocalDate;

public class Medico extends Pessoa 
{
    private String crm;

    public Medico(String nome, String cpf, String crm) 
    {
        super(nome, cpf);
        this.crm = crm;
    }

    public String getCrm() 
    { 
        return crm; 
    }

    public void agendarConsulta() 
    {
        System.out.println("Consulta agendada sem data definida.");
    }

    public void agendarConsulta(LocalDate data) 
    {
        System.out.println("Consulta agendada para: " + data);
    }

    public void agendarConsulta(LocalDate data, String observacao) 
    {
        System.out.println("Consulta agendada para: " + data + " | Obs: " + observacao);
    }

    @Override
    public void exibirPerfil() 
    {
        System.out.println("=== Médico ===");
        System.out.println("Nome: " + getNome());
        System.out.println("CRM: " + crm);
    }
}
