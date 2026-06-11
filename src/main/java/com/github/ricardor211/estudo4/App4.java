package com.github.ricardor211.estudo4;

import java.util.ArrayList;
import java.util.List;

public class App4 {

    public static void main(String[] args) {
        Bicicleta bicicleta = new Bicicleta(5, true);
        Carro carro = new Carro(5, "Soja");
        Onibus onibus = new Onibus(3, "linha");

        List<Transporte> frota = new ArrayList<>();
        frota.add(bicicleta);
        frota.add(carro);
        frota.add(onibus);

        for (int i = 0; i < frota.size(); i++) {
            frota.get(i).mostrarDetalhes();
        }


        System.out.println("\n-------------------");
    }

}
