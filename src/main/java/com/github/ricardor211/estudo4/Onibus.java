package com.github.ricardor211.estudo4;

public class Onibus extends Transporte{

    private String linha;

    public Onibus(int capacidade, String linha) {
        super(capacidade);
        this.linha = linha;
    }

    @Override
    public void mostrarDetalhes() {
        System.out.printf("\nEsse onibus percorre a linha '%s' com capacidade para %d pessoas.", linha, capacidade);
    }
}
