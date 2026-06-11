package com.github.ricardor211.estudo2;

public class Revista extends ItemBiblioteca{
    private String edicao;

    public Revista (String titulo, int codigo, String edicao) {
        super(titulo, codigo);
        this.edicao = edicao;
    }

    @Override
    public void exibirInformacoes() {
        System.out.printf("\nTitulo: %s, Codigo: %d, Edicao: %s", titulo, codigo, edicao);
    }
}
