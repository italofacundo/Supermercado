package Entidades.Produtos.NaoAlimenticios;

import Entidades.Produtos.ProdutoNaoAlimenticio;

public class Utensilio extends ProdutoNaoAlimenticio {
    private String material;

    public Utensilio (String nome, double preco, int quantidade, String material) {
        super(nome, preco, quantidade);
        this.material = material;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString () {
        return "Utensilio{" +
                "material='" + material + '\'' +
                ", nome='" + nome + '\'' +
                ", preco=" + preco +
                ", quantidade=" + quantidade +
                ", codigo=" + codigo +
                '}';
    }
}
