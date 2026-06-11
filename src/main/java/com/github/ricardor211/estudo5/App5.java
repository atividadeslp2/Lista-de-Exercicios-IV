package com.github.ricardor211.estudo5;

import java.util.ArrayList;
import java.util.List;

public class App5 {

    public static void main(String[] args) {
        Aluno aluno = new Aluno("Aluno", "123.456.789-10", 123);
        Professor professor = new Professor("Professor", "123.456.789-10", "LP2");

        List<Pessoa> listaPessoa = new ArrayList<>();
        listaPessoa.add(aluno);
        listaPessoa.add(professor);

        for (int i = 0; i < listaPessoa.size(); i++) {
            listaPessoa.get(i).exibirDados();
            System.out.printf("\n");
        }
        System.out.println("---------------");
    }
}
