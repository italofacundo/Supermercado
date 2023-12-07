import Entidades.AcessoRestrito.FuncionarioRepositorio;
import Entidades.AcessoRestrito.VendasRepositorio;
import Entidades.Estoque;
import Entidades.Produtos.Alimenticios.Bebida;
import Entidades.Produtos.Alimenticios.Carne;
import Entidades.Produtos.NaoAlimenticios.Eletronico;
import Entidades.Produtos.ProdutoAlimenticio;
import Entidades.Produtos.ProdutoNaoAlimenticio;

import java.util.Date;

public class Supermercado {
    public static void main(String[] args) {
        FuncionarioRepositorio funcionarioRepositorio = new FuncionarioRepositorio();
        VendasRepositorio vendasRepositorio = new VendasRepositorio();
        Estoque estoque = new Estoque();

        // ATRIBUIR O CÓDIGO AUTOMATICAMENTE
        // CRIAR PRODUTOS SEM INSTANCIAR MANUALMENTE
        ProdutoAlimenticio leiteItambe = new Bebida("Leite 1L Itambé", 3.50, "001", new Date(), "und", "Laticínios");
        ProdutoAlimenticio sobrecoxaSadia = new Carne("Sobrecoxa de Frango Sadia", 3.50, "002", new Date(), "kg", "Aves");
        ProdutoNaoAlimenticio iphone = new Eletronico("iPhone Apple", 6500.00, "003", 2);

        estoque.adicionarProduto("001", 50);
        estoque.adicionarProduto("002", 40);
        estoque.adicionarProduto("003", 30);
    }
}

