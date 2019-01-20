package funcionarios;

import abstrato.Funcionario;

public class Motorista extends Funcionario {

    private String numeroDeHabilitacao;

    public Motorista(String nome, String email, String cpf, String telefone, double salario, String numeroDeHabilitacao) {
        super(nome, email, cpf, telefone, salario);
        this.numeroDeHabilitacao = numeroDeHabilitacao;
    }

    @Override
    public String tipo() {
        return "funcionarios.Motorista";
    }

    public String getNumeroDeHabilitacao() {
        return numeroDeHabilitacao;
    }

    public void setNumeroDeHabilitacao(String numeroDeHabilitacao) {
        this.numeroDeHabilitacao = numeroDeHabilitacao;
    }
}
