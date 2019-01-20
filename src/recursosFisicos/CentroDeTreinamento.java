package recursosFisicos;

import abstrato.Recursos;

public class CentroDeTreinamento extends Recursos {

    private int quantidadeDeDormitorios;

    public int getQuantidadeDeDormitorios() {
        return quantidadeDeDormitorios;
    }

    public void setQuantidadeDeDormitorios(int quantidadeDeDormitorios) {
        this.quantidadeDeDormitorios = quantidadeDeDormitorios;
    }
}
