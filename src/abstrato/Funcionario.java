package abstrato;

import interfaces.TipoDeFuncionario;

public abstract class Funcionario extends Pessoa implements TipoDeFuncionario {

    private double salario;

    public Funcionario(String nome, String email, String cpf, String telefone, double salario) {
        super(nome, email, cpf, telefone);
        this.salario = salario;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
}
