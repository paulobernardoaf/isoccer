package abstrato;

import interfaces.TipoDeSocio;

public abstract class Socio extends Pessoa implements TipoDeSocio {

    private String endereco;
    private double contibuicao;
    private String estado;

    public Socio(String nome, String email, String cpf, String telefone, String endereco, double contibuicao, String estado) {
        super(nome, email, cpf, telefone);
        this.endereco = endereco;
        this.contibuicao = contibuicao;
        this.estado = estado;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public double getContibuicao() {
        return contibuicao;
    }

    public void setContibuicao(double contibuicao) {
        this.contibuicao = contibuicao;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
