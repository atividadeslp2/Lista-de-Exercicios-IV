package com.github.ricardor211.estudo5;

public class Professor extends Pessoa {

    private String disciplina;

    public Professor(String nome, String cpf, String disciplina) {
        super(nome, cpf);
        this.disciplina = disciplina;
    }

    @Override
    protected void exibirDados() {
        System.out.printf("\nDados do professor:" +
                "\nNome: %s" +
                "\nCpf: %s" +
                "\nDisciplina: %s", nome, cpf, disciplina);
    }
}
