package funcionarios;

import abstrato.Funcionario;

public class Tecnico extends Funcionario {

    public Tecnico(String nome, String email, String cpf, String telefone, double salario) {
        super(nome, email, cpf, telefone, salario);
    }

    @Override
    public String tipo() {
        return "Técnico";
    }
}
