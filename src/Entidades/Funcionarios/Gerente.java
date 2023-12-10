package Entidades.Funcionarios;


import Entidades.*;
import Entidades.ControleFuncionarios;
import Entidades.Repositorios.Estoque;
import Entidades.Repositorios.FuncionarioRepositorio;
import Entidades.RelatorioAdministrativo;
import Entidades.Repositorios.VendasRepositorio;

public class Gerente extends Funcionario implements RelatorioAdministrativo, ControleEstoque, ControleFuncionarios, ControleVendas {
    private Venda vendaAtual;

    public Gerente(String nome, double salario) {
        super(nome, salario);
    }

    @Override
    public void contratarFuncionario(Funcionario funcionario) {

    }

    @Override
    public void demitirFuncionario(int id) {

    }

    @Override
    public String gerarRelatorioEstoque(Estoque estoque) {
        return null;
    }

    @Override
    public String gerarRelatorioVendas(VendasRepositorio vendasRepositorio) {
        return null;
    }

    @Override
    public String gerarRelatorioFuncionarios(FuncionarioRepositorio funcionarioRepositorio) {
        return null;
    }

    @Override
    public void adicionarProduto(Estoque estoque, Produto produto, int quantidade) {
        estoque.adicionarProduto(produto, quantidade);
    }

    @Override
    public void removerProduto(Estoque estoque, Produto produto, int quantidade) {
        estoque.removerProduto(produto, quantidade);
    }

    @Override
    public void consultarEstoque(Estoque estoque) {
        estoque.consultarEstoque();
    }

    @Override
    public void consultarEstoque(Estoque estoque, String nome) {
        estoque.consultarEstoque(nome);
    }

    @Override
    public void iniciarVenda(Estoque estoque) {
        vendaAtual = new Venda(estoque);
    }

    @Override
    public void adicionarProdutoVenda(Produto produto, int quantidade) {
        if (vendaAtual == null) {
            System.out.println("Nenhuma venda iniciada.");
            return;
        }
        vendaAtual.adicionarProduto(produto, quantidade);
    }

    @Override
    public void concluirVenda() {
        if (vendaAtual != null) {
            vendaAtual.concluirVenda();
            vendaAtual = null;
        } else {
            System.out.println("Nenhuma venda para concluir.");
        }
    }
}
