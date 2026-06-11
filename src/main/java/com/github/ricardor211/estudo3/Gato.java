package com.github.ricardor211.estudo3;

public class Gato extends Animal{

    private String pelagem;

    public Gato(String nome, float idade, String pelagem) {
        super(nome, idade);
        this.pelagem = pelagem;
    }

    @Override
    protected void emitirSom() {
        System.out.printf("\nO gato da pelagem %s esta miando!", pelagem);
    }
}
