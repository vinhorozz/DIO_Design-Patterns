package edu.flavio.example;

import edu.flavio.example.sigletonlazy.SingletonEager;
import edu.flavio.example.sigletonlazy.SingletonLazy;
import edu.flavio.example.sigletonlazy.SingletonLazyHolder;


public class MainSingleton {
    public static void main(String[] args) {
        /*Apenas para mostrar que Singleton não permite ser instanciado
        *com "new", pois seu construtor é privado
         */

       // SingletonLazy lazy= new SingletonLazy();

        // Aqui acessamos a instância, dentro da classe privada, através do método que é público
        SingletonLazy lazy=SingletonLazy.getInstancia();
        System.out.println(lazy);
        lazy=SingletonLazy.getInstancia();
        System.out.println(lazy);

        // Aqui acessamos a instância, dentro da classe privada, através do método que é público
        SingletonEager eager=SingletonEager.getInstancia();
        System.out.println(eager);
        eager=SingletonEager.getInstancia();
        System.out.println(eager);

        // Aqui acessamos a instância encapsualda na classe privada, através do método que é público estático da classe "SingletonLazyholder"
        SingletonLazyHolder holder=SingletonLazyHolder.getInstancia();
        System.out.println(holder);
        holder=SingletonLazyHolder.getInstancia();
        System.out.println(holder);
    }


    }
