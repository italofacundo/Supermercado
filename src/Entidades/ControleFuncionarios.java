package Entidades;

import Entidades.Funcionario;

public interface ControleFuncionarios {
    void contratarFuncionario(Funcionario funcionario);
    void demitirFuncionario(int id);
}
