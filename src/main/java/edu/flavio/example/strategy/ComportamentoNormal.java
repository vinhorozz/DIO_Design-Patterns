package edu.flavio.example.strategy;

public class ComportamentoNormal implements Comportamento{
    @Override
    public void mover() {
        System.out.println("Movendo normalmente...");
    }
}
