package Entidades.Funcionarios;


import Entidades.*;
import Entidades.ControleFuncionarios;
import Entidades.Repositorios.Estoque;
import Entidades.Repositorios.FuncionarioRepositorio;
import Entidades.RelatorioAdministrativo;
import Entidades.Repositorios.VendasRepositorio;

public class Gerente extends Funcionario implements RelatorioAdministrativo, ControleEstoque, ControleFuncionarios, ControleVendas {

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
    public void adicionarProduto(Produto produto, int quantidade) {

    }

    @Override
    public void removerProduto(Produto produto, int quantidade) {

    }

    @Override
    public void consultarEstoque() {

    }

    @Override
    public void consultarEstoque(String nome) {

    }

    @Override
    public void vender() {

    }

    @Override
    public void cancelarVenda() {

    }

    @Override
    public void emitirRecibo() {

    }
}
