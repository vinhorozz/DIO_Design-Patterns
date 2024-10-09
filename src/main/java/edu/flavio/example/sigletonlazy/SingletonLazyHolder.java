package edu.flavio.example.sigletonlazy;

/*O Sigleton é um padrão de projeto que determina a instanciação de um objeto uma única vez,
 permitindo que o objeto possa ser utilizado posteiormente
 */
/*No exemplo dessa classe o singleton LazyHolder, é criada uma "classe estática interna" para encapsularmos a instanciação do objeto!
* Isso permite uma otimização de memória pois é uma formato "thread Safe"
* @see <a href="https://stackoverflow.com/a/24018148">Referência</a>
 */
public class SingletonLazyHolder {
//não haverá Atributo
    //Nova classe para encapsulamento o atributo e instância
        private static class instanceHolder {
         //Atributo "público e estático" para que seja manipulado pelo método da classe externa
         public static SingletonLazyHolder instancia= new SingletonLazyHolder(); //
}
//Método construtor
            //A grande jogada do "Singleton" é que o construtor deve ser "PRIVADO" para que não seja possível instanciá-lo novamente
            private SingletonLazyHolder(){
                super();// chama o construtor da classe "mãe"
            }
//Método manipulador
            //Para que o método estático realize a instanciação de um objeto, primeiro ele irá conferir se a instância é nula
            public static SingletonLazyHolder getInstancia(){
                return  instanceHolder.instancia;
            }
}