package Entidades.Produtos.NaoAlimenticios;

import Entidades.Produtos.ProdutoNaoAlimenticio;

import java.util.ArrayList;

public class Eletronico extends ProdutoNaoAlimenticio {
    private int garantiaMeses;

    public Eletronico(String nome, double preco, int quantidade, int garantiaMeses) {
        super(nome, preco, quantidade);
        this.garantiaMeses = garantiaMeses;
    }

    public int getGarantiaMeses() {
        return garantiaMeses;
    }

    public void setGarantiaMeses(int garantiaMeses) {
        this.garantiaMeses = garantiaMeses;
    }

    @Override
    public String toString() {
        return "Eletronico{" +
                "garantiaMeses=" + garantiaMeses +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                ", codigo=" + codigo +
                '}';
    }
}
