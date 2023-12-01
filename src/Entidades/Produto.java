package Entidades;

import java.util.ArrayList;

public abstract class Produto {
    protected String nome;
    protected double preco;
    protected int codigo;

    abstract ArrayList getCategorias();
}
