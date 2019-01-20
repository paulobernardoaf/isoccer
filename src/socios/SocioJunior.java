package socios;

import abstrato.Socio;

public class SocioJunior extends Socio {

    private static double contribuicao = 100;

    public SocioJunior(String nome, String email, String cpf, String telefone, String endereco, String estado) {
        super(nome, email, cpf, telefone, endereco, estado);
    }

    public static void setContribuicao(double value) {
        contribuicao = value;
    }

    public double getContribuicao() {
        return contribuicao;
    }

    public String tipo() {
        return "Júnior";
    }

}
