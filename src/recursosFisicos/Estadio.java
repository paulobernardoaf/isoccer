package recursosFisicos;

import abstrato.Recursos;

public class Estadio extends Recursos {

    private int lotacao;
    private int quantidadeDeLanchonetes;
    private int quantidadeDeBanheiros;

    public int getLotacao() {
        return lotacao;
    }

    public void setLotacao(int lotacao) {
        this.lotacao = lotacao;
    }

    public int getQuantidadeDeLanchonetes() {
        return quantidadeDeLanchonetes;
    }

    public void setQuantidadeDeLanchonetes(int quantidadeDeLanchonetes) {
        this.quantidadeDeLanchonetes = quantidadeDeLanchonetes;
    }

    public int getQuantidadeDeBanheiros() {
        return quantidadeDeBanheiros;
    }

    public void setQuantidadeDeBanheiros(int quantidadeDeBanheiros) {
        this.quantidadeDeBanheiros = quantidadeDeBanheiros;
    }
}
