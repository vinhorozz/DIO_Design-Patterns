package edu.flavio.example.strategy;

public class ComportamentoAgressivo implements Comportamento{


    @Override
    public void mover() {
        System.out.println("Movendo rapidamente...");
    }
}
