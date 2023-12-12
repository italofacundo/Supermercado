package Entidades.Produtos.NaoAlimenticios;

import Entidades.Produtos.ProdutoNaoAlimenticio;

public class Limpeza extends ProdutoNaoAlimenticio {
    private String localUso;

    public Limpeza(String nome, double preco, int quantidade, String localUso) {
        super(nome, preco, quantidade);
        this.localUso = localUso;
    }

    public String getLocalUso() {
        return localUso;
    }

    public void setLocalUso(String localUso) {
        this.localUso = localUso;
    }

    @Override
    public String toString() {
        return "Limpeza{" +
                "localUso='" + localUso + '\'' +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                ", codigo=" + codigo +
                '}';
    }
}
