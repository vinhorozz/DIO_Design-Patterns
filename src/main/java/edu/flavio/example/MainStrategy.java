package edu.flavio.example;

import edu.flavio.example.strategy.*;

public class MainStrategy {
    public static void main(String[] args) {

        //Criamos uma instância para cada comportamento que o robo poderia realizar
        Comportamento normal=new ComportamentoNormal();
        Comportamento agressivo= new ComportamentoAgressivo();
        Comportamento defensivo= new ComportamentoDefensivo();

        //criamos a instância de utilização da interface
        Robo robo=new Robo();

        robo.setComportamento(normal);

        robo.mover();
        robo.setComportamento(agressivo);
        robo.mover();
        robo.mover();
        robo.setComportamento(defensivo);
        robo.mover();
        robo.setComportamento(normal);
        robo.mover();

    }
}