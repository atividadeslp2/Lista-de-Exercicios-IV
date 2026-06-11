package com.github.ricardor211.estudo2;

public class Livro extends ItemBiblioteca {

    private String autor;
    private int numeroPaginas;

    public Livro(String titulo, int codigo, String autor, int numeroPaginas) {
        super(titulo, codigo);
        this.autor = autor;
        this.numeroPaginas = numeroPaginas;
    }

    @Override
    public void exibirInformacoes() {
        System.out.printf("\nTitulo: %s, Codigo: %d, Autor: %s, Numero Paginas: %d", titulo, codigo, autor, numeroPaginas);
    }

}
