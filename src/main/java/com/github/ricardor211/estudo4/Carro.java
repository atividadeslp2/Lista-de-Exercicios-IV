package com.github.ricardor211.estudo4;

public class Carro extends Transporte{

    private String tipoCombustivel;

    public Carro(int capacidade, String tipoCombustivel) {
        super(capacidade);
        this.tipoCombustivel = tipoCombustivel;
    }

    @Override
    public void mostrarDetalhes() {
        System.out.printf("\nO carro comporta %d passageiros e usa combustível do tipo %s", capacidade, tipoCombustivel);
    }
}
