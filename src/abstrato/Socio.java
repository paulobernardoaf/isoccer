package abstrato;

import interfaces.TipoDeSocio;

public abstract class Socio extends Pessoa implements TipoDeSocio {

    public static int quantidadeAdimplentes;
    public static int quantidadeInadimplentes;
    private String endereco;
    private String estado;


    public Socio(String nome, String email, String cpf, String telefone, String endereco, String estado) {
        super(nome, email, cpf, telefone);
        this.endereco = endereco;
        this.estado = estado;
        if(estado.equals("1")) {
            Socio.setQuantidadeAdimplentes(Socio.getQuantidadeAdimplentes() + 1);
        } else {
            Socio.setQuantidadeInadimplentes(Socio.getQuantidadeInadimplentes() + 1);
        }
    }

    public static int getQuantidadeAdimplentes() {
        return quantidadeAdimplentes;
    }

    public static void setQuantidadeAdimplentes(int quantidadeAdimplentes) {
        Socio.quantidadeAdimplentes = quantidadeAdimplentes;
    }

    public static int getQuantidadeInadimplentes() {
        return quantidadeInadimplentes;
    }

    public static void setQuantidadeInadimplentes(int quantidadeInadimplentes) {
        Socio.quantidadeInadimplentes = quantidadeInadimplentes;
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
