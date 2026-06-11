package com.github.ricardor211.estudo4;

public class Bicicleta extends Transporte{

    //"Indicam se possuem marchas"
    private boolean possuiMarcha;

    public Bicicleta(int capacidade, boolean possuiMarcha) {
        super(capacidade);
        this.possuiMarcha = possuiMarcha;
    }

    @Override
    public void mostrarDetalhes() {
        if(possuiMarcha) System.out.print("A bicicleta possui marcha");
        else System.out.print("A bicicleta não possui marcha");
    }
}
