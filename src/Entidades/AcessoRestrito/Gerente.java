package Entidades.AcessoRestrito;


import Entidades.Estoque;
import Entidades.Funcionario;
import Entidades.RelatorioAdministrativo;

public class Gerente extends Funcionario implements RelatorioAdministrativo {

    @Override
    public String gerarRelatorioEstoque(Estoque estoque) {
        return "";
    }

    @Override
    public String gerarRelatorioVendas(VendasRepositorio vendasRepositorio) {
        return "";
    }

    @Override
    public String gerarRelatorioFuncionarios(FuncionarioRepositorio funcionarioRepositorio) {
        return "";
    }
}
