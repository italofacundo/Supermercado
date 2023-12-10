import Entidades.Funcionarios.Gerente;
import Entidades.Repositorios.FuncionarioRepositorio;
import Entidades.Repositorios.VendasRepositorio;
import Entidades.Repositorios.Estoque;
import Entidades.Produtos.Alimenticios.Bebida;
import Entidades.Venda;

import java.util.Date;

public class Supermercado {
    public static void main(String[] args) {
        FuncionarioRepositorio fr = new FuncionarioRepositorio();
        VendasRepositorio vr = new VendasRepositorio();
        Estoque estoque = new Estoque();

        Bebida leiteItambe = new Bebida(
                "Leite Itambé 1L",
                3.50,
                10,
                new Date(2024, 4, 10),
                "und",
                false
        );

        estoque.adicionarProduto(leiteItambe, 10);
        estoque.adicionarProduto(leiteItambe, 10);
        estoque.removerProduto(leiteItambe, 5);

        Gerente joao = new Gerente("João", 5000);
        fr.contratarFuncionario(joao);

        Venda venda = new Venda(estoque);
        venda.adicionarProduto(leiteItambe, 5);
        venda.adicionarProduto(leiteItambe, 2);
        venda.concluirVenda();

    }
}

