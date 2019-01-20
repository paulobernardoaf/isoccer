package funcionarios;

import abstrato.Funcionario;

public class Presidente extends Funcionario {

    public Presidente(String nome, String email, String cpf, String telefone, double salario) {
        super(nome, email, cpf, telefone, salario);
    }

    @Override
    public String tipo() {
        return "funcionarios.Presidente";
    }
}
