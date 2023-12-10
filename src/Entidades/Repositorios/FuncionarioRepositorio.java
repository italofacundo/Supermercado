package Entidades.Repositorios;

import Entidades.Funcionario;

import java.util.ArrayList;

public class FuncionarioRepositorio {
    private ArrayList<Funcionario> funcionarios;
    int id = 0;

    public FuncionarioRepositorio() {
        funcionarios = new ArrayList<>();
    }

    public void contratarFuncionario(Funcionario funcionario) {
        funcionario.setId(id++);
        funcionarios.add(funcionario);

        String mensagem = """
        Funcionário contratado!
        Nome do funcionário: %s
        ID do funcionário: %d
        Salário do funcionário: R$ %f
        Cargo do funcionário: %s
        """.formatted(funcionario.getNome(), funcionario.getId(), funcionario.getSalario(), funcionario.getClass().getSimpleName());
        System.out.println(mensagem);
    }

    public void demitirFuncionario(int id) {
        for (Funcionario funcionario : funcionarios) {
            if (funcionario.getId() == id) {
                funcionarios.remove(funcionario);
                String mensagem = """
                Funcionário demitido.
                Nome do funcionário: %s
                ID do funcionário: %d
                Salário do funcionário: R$ %f
                Cargo do funcionário: %s
                """.formatted(funcionario.getNome(), funcionario.getId(), funcionario.getSalario(), funcionario.getClass().getSimpleName());
                System.out.println(mensagem);
                break;
            }
        }
    }
}
