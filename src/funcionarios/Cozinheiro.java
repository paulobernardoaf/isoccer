package funcionarios;

import abstrato.Funcionario;

public class Cozinheiro extends Funcionario {

    public Cozinheiro(String nome, String email, String cpf, String telefone, double salario) {
        super(nome, email, cpf, telefone, salario);
    }

    @Override
    public String tipo() {
        return "funcionarios.Cozinheiro";
    }
}
