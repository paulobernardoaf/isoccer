package funcionarios;

import abstrato.Funcionario;

public class PreparadorFisico extends Funcionario {

    public PreparadorFisico(String nome, String email, String cpf, String telefone, double salario) {
        super(nome, email, cpf, telefone, salario);
    }

    @Override
    public String tipo() {
        return "Preparador Físico";
    }
}
