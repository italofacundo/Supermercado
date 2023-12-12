import Entidades.Funcionarios.*;
import Entidades.MenuVendas;
import Entidades.Produto;
import Entidades.Repositorios.FuncionarioRepositorio;
import Entidades.Repositorios.VendasRepositorio;
import Entidades.Repositorios.Estoque;
import Entidades.Produtos.Alimenticios.Bebida;
import Entidades.Venda;

import java.util.Map;

public class Supermercado {
    public static void main(String[] args) {
        FuncionarioRepositorio fr = new FuncionarioRepositorio();
        VendasRepositorio vr = new VendasRepositorio();
        Estoque estoque = new Estoque();
        String arquivoProdutos = "src/produtos.txt";

        Gerente joao = new Gerente("João", 4000);
        fr.contratarFuncionario(joao);

        joao.contratarFuncionario(fr, new Estoquista("José", 2000));
        joao.contratarFuncionario(fr, new OperadorCaixa("Maria", 1500));
        Estoquista jose = (Estoquista) fr.getFuncionario(2);
        OperadorCaixa maria = (OperadorCaixa) fr.getFuncionario(3);

        jose.carregarProdutos(estoque, arquivoProdutos);

        MenuVendas menuVendas = new MenuVendas();
        maria.iniciarVenda(estoque);
        Map<Produto, Integer> produtosSelecionados = menuVendas.selecionarProdutos(estoque);
        for (Map.Entry<Produto, Integer> entrada : produtosSelecionados.entrySet()) {
            maria.adicionarProdutoVenda(entrada.getKey(), entrada.getValue());
        }
        maria.concluirVenda();

    }
}

