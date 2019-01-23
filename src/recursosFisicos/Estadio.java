package recursosFisicos;

import abstrato.Recursos;

public class Estadio extends Recursos {

    String nome;
    private int lotacao;
    private int quantidadeDeLanchonetes;
    private int quantidadeDeBanheiros;

    public Estadio(String nome, int lotacao, int quantidadeDeLanchonetes, int quantidadeDeBanheiros) {
        this.nome = nome;
        this.lotacao = lotacao;
        this.quantidadeDeLanchonetes = quantidadeDeLanchonetes;
        this.quantidadeDeBanheiros = quantidadeDeBanheiros;
    }

    public void informacoes() {
        System.out.println("Informações do Estádio: " +
                "\n\tNome: " + this.getNome() +
                "\n\tLotação: " + this.getLotacao() +
                "\n\tQuantidade de banheiros: " + this.getQuantidadeDeBanheiros() +
                "\n\tQuantidade de lanchonetes: " + this.getQuantidadeDeLanchonetes());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

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
