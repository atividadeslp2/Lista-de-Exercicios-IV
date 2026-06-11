package com.github.ricardor211.estudo3;

public class Ave extends Animal{

    private String tipo;

    public Ave(String nome, float idade, String tipo) {
        super(nome, idade);
        this.tipo = tipo;
    }

    @Override
    protected void emitirSom() {
        System.out.printf("\nO passarinho do tipo %s está cantando!", tipo);
    }
}
