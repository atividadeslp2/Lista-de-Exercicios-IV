package com.github.ricardor211.estudo5;

public class Aluno extends Pessoa {

    private int matricula;

    public Aluno(String nome, String cpf, int matricula) {
        super(nome, cpf);
        this.matricula = matricula;
    }

    @Override
    protected void exibirDados() {
        System.out.printf("\nDados do aluno:" +
                "\nNome: %s" +
                "\nCpf: %s" +
                "\nMatricula: %d", nome, cpf, matricula);
    }
}
