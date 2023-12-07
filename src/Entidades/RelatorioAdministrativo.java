package Entidades;

import Entidades.AcessoRestrito.FuncionarioRepositorio;
import Entidades.AcessoRestrito.VendasRepositorio;

public interface RelatorioAdministrativo {
    String gerarRelatorioEstoque();
    String gerarRelatorioVendas();
    String gerarRelatorioFuncionarios();
}
