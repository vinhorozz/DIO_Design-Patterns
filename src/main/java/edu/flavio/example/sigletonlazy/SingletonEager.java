package edu.flavio.example.sigletonlazy;

/*O Sigleton é um padrão de projeto que determina a instanciação de um objeto uma única vez,
 permitindo que o objeto possa ser utilizado posteiormente
 */
/*No exemplo dessa classe o singleton Eager, criamos a instancia do objeto, assim que o atributos é declarado
 (ou seja, ele não perde tempo, por isso, é "apressado");
 */
public class SingletonEager {
//Atributo
            private static SingletonEager instancia=new SingletonEager();
//Método construtor
            //A grande jogada do "Singleton" é que o construtor deve ser "PRIVADO" para que não seja possível instanciá-lo novamente
            private SingletonEager(){
                super();// chama o construtor da classe "mãe"
            }
//Método manipulador

            public static SingletonEager getInstancia(){
                return  instancia;
            }
}
