package socios;

import abstrato.Socio;

public class SocioSenior extends Socio {

    public SocioSenior(String nome, String email, String cpf, String telefone, String endereco, double contibuicao, String estado) {
        super(nome, email, cpf, telefone, endereco, contibuicao, estado);
    }

    public String tipo() {
        return "Sênior";
    }

}
