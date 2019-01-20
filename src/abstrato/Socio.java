package abstrato;

import interfaces.TipoDeSocio;

public abstract class Socio extends Pessoa implements TipoDeSocio {

    private String endereco;
    private String estado;

    public Socio(String nome, String email, String cpf, String telefone, String endereco, String estado) {
        super(nome, email, cpf, telefone);
        this.endereco = endereco;
        this.estado = estado;
    }

    public abstract double getContribuicao();

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
