package com.github.ricardor211.estudo2;

public class DVD extends ItemBiblioteca{

    private float duracao;

    public DVD (String titulo, int codigo, float duracao) {
        super(titulo, codigo);
        this.duracao = duracao;
    }

    @Override
    public void exibirInformacoes() {
        System.out.printf("\nTitulo: %s, Codigo: %d, Duracao %.2f", titulo, codigo, duracao);
    }
}
