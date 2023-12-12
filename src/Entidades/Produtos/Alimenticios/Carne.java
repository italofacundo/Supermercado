package Entidades.Produtos.Alimenticios;

import Entidades.Produtos.ProdutoAlimenticio;

import java.util.Date;

public class Carne extends ProdutoAlimenticio {
    private String tipoCarne;

    public Carne(String nome, double preco, int quantidade, Date dataValidade, String unidadeMedida, String tipoCarne) {
        super(nome, preco, quantidade, dataValidade, unidadeMedida);
        this.tipoCarne = tipoCarne;
    }

    public String getTipoCarne() {
        return tipoCarne;
    }

    public void setTipoCarne(String tipoCarne) {
        this.tipoCarne = tipoCarne;
    }

    @Override
    public String toString() {
        return "Carne{" +
                "tipoCarne='" + tipoCarne + '\'' +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                ", codigo=" + codigo +
                ", dataValidade=" + dataValidade +
                ", unidadeMedida='" + unidadeMedida + '\'' +
                '}';
    }
}
