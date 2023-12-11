import Entidades.Funcionarios.Gerente;
import Entidades.Produto;
import Entidades.Repositorios.FuncionarioRepositorio;
import Entidades.Repositorios.VendasRepositorio;
import Entidades.Repositorios.Estoque;
import Entidades.Produtos.Alimenticios.Bebida;
import Entidades.Venda;

public class Supermercado {
    public static void main(String[] args) {
        FuncionarioRepositorio fr = new FuncionarioRepositorio();
        VendasRepositorio vr = new VendasRepositorio();
        Estoque estoque = new Estoque();
        String arquivoProdutos = "src/produtos.txt";

        Gerente joao = new Gerente("João", 5000);
        fr.contratarFuncionario(joao);

        joao.carregarProdutos(estoque, arquivoProdutos);
        joao.consultarEstoque(estoque);

        Venda venda = new Venda(estoque);

        Produto produto1 = estoque.getProduto("Café");
        if (produto1 != null) {
            venda.adicionarProduto(produto1, 2);
        }

        Produto produto2 = estoque.getProduto("Detergente");
        if (produto2 != null) {
            venda.adicionarProduto(produto2, 1);
        }

        venda.concluirVenda();

    }
}

