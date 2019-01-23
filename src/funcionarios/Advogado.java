package funcionarios;

import abstrato.Funcionario;

public class Advogado extends Funcionario {

    public Advogado(String nome, String email, String cpf, String telefone, double salario) {
        super(nome, email, cpf, telefone, salario);
    }

    @Override
    public String tipo() {
        return "Advogado";
    }
}
