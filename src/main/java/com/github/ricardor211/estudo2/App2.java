package com.github.ricardor211.estudo2;


import java.util.ArrayList;
import java.util.List;

public class App2 {

    public static void main(String[] args) {
        Livro livro = new Livro("Nome", 5, "autor", 50);
        Revista revista = new Revista("Revista", 6, "2026");
        DVD dvd = new DVD("DVD", 7, 5045f);

        Livro livro2 = new Livro("Nome2", 8, "autor", 50);
        Revista revista2 = new Revista("Revista2", 9, "2026");
        DVD dvd2 = new DVD("DVD2", 10, 5045f);

        List<ItemBiblioteca> listaItens = new ArrayList<>();

        //Preenchendo lista
        listaItens.add(livro);
        listaItens.add(revista);
        listaItens.add(dvd);

        listaItens.add(livro2);
        listaItens.add(revista2);
        listaItens.add(dvd2);


        for (int i = 0; i < listaItens.size(); i++) {
            listaItens.get(i).exibirInformacoes();
        }

        System.out.println("\n-------------------");
    }
}
