package socios;

import abstrato.Socio;

public class SocioElite extends Socio {

    public SocioElite(String nome, String email, String cpf, String telefone, String endereco, double contibuicao, String estado) {
        super(nome, email, cpf, telefone, endereco, contibuicao, estado);
    }

    public String tipo() {
        return "Elite";
    }

}
