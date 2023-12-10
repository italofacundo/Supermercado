package Entidades.Produtos;

import Entidades.Produto;

import java.util.ArrayList;
import java.util.Date;

public abstract class ProdutoAlimenticio extends Produto {
    protected Date dataValidade;
    protected String unidadeMedida;

    public ProdutoAlimenticio(String nome, double preco, Date dataValidade, String unidadeMedida) {
        super(nome, preco);
        this.dataValidade = dataValidade;
        this.unidadeMedida = unidadeMedida;
    }
}
