## Parte A - Análise do Problema

---

### Questão 1
Pessoa, prontuario, Pacientes, Medicos, Enfermeiros e Consultas;

### Questão 2
pessoa: nome, cpf.
medicos e enfermeiros: id, pessoa, cargo, salario;
pacientes: id, pessoa, prontuario medico;
consultas: id, paciente, medico ;
prontuario: relatorio medico, medico;

### Questão 3
Tem uma relação de composição e agregação, entre cada um.

### Questão 4
Pessoa, prontuario, medicos, pacientes, enfermeiros, consultas = composição e herança pois todos estão interligados nos propósitos.

Medicos e enfermeiros = agregação pois um não depende do outro para existir.

### Questão 5

Porque podemos criar uma classe abstract pessoa e suas filhas pacientes, medicos e enfermeiro herdarem nome e cpf.
