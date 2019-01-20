package funcionarios;

import abstrato.Funcionario;

public class Medico extends Funcionario {

    private String crm;

    public Medico(String nome, String email, String cpf, String telefone, double salario, String crm) {
        super(nome, email, cpf, telefone, salario);
        this.crm = crm;
    }

    @Override
    public String tipo() {
        return "Médico";
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }
}
