package com.github.ricardor211.estudo3;

public class Cachorro extends Animal{

    private String raca;

    public Cachorro(String nome, float idade, String raca) {
        super(nome, idade);
        this.raca = raca;
    }

    @Override
    public void emitirSom() {
        System.out.printf("\nO cachorro da raca %s está latindo!", raca);
    }
}
