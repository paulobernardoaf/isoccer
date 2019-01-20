package socios;

import abstrato.Socio;

public class SocioSenior extends Socio {

    private static double contribuicao = 150;

    public SocioSenior(String nome, String email, String cpf, String telefone, String endereco, String estado) {
        super(nome, email, cpf, telefone, endereco, estado);

    }

    public static void setContribuicao(double value) {
        contribuicao = value;
    }

    public double getContribuicao() {
        return contribuicao;
    }

    public String tipo() {
        return "Sênior";
    }

}
