package recursosFisicos;

import abstrato.Recursos;


public class Onibus extends Recursos {

    String placa;

    public Onibus(String placa) {
        this.placa = placa;
    }

    public String getPlaca() {
        return placa;
    }
}
