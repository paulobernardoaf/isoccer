package funcionarios;

import abstrato.Funcionario;

public class Jogador extends Funcionario {

    private String tipo;
    private boolean apto;

    public Jogador(String nome, String email, String cpf, String telefone, double salario, String tipo, boolean apto) {
        super(nome, email, cpf, telefone, salario);
        this.tipo = tipo;
        this.apto = apto;
    }

    @Override
    public String tipo() {
        return "funcionarios.Jogador";
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public boolean isApto() {
        return apto;
    }

    public void setApto(boolean apto) {
        this.apto = apto;
    }
}
