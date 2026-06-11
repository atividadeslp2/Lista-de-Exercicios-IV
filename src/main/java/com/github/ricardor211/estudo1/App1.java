package com.github.ricardor211.estudo1;

import java.util.ArrayList;
import java.util.List;

public class App1 {

    public static void main(String[] args) {

        //Criando uma lista mista
        //Usando polimorfismo

        FuncionarioHorista funcionarioHorista = new FuncionarioHorista("Nome1", "cpf1", 40f, 500f);
        FuncionarioMensalista funcionarioMensalista = new FuncionarioMensalista("Nome2", "cpf2", 1500f);
        Funcionario funcionarioHorista2 = new FuncionarioHorista("Nome3", "cpf3", 50f, 600f);

        List<Funcionario> funcionarios = new ArrayList<>();

        //Adiciando funcionarios
        funcionarios.add(funcionarioHorista);
        funcionarios.add(funcionarioMensalista);
        funcionarios.add(funcionarioHorista2);

        for (int i = 0; i < funcionarios.size(); i++) {
            funcionarios.get(i).calcularPagamento();
        }
    }
}
