package com.github.ricardor211.estudo3;

import java.util.ArrayList;
import java.util.List;

public class App3 {

    public static void main(String[] args) {
        Animal cachorro = new Cachorro("Cachorro", 5, "Pitbull");
        Gato gato = new Gato("Gato", 6, "Rosa");
        Ave ave = new Ave("Frango", 7, "Trinca-Ferro");

        List<Animal> animais = new ArrayList<>();

        animais.add(cachorro);
        animais.add(gato);
        animais.add(ave);

        for (int i = 0; i < animais.size(); i ++) {
            animais.get(i).emitirSom();
        }

        System.out.println("\n---------------------");
    }
}
