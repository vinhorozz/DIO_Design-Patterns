package edu.flavio.example.sigletonlazy;

/*O Sigleton é um padrão de projeto que determina a instanciação de um objeto uma única vez,
 permitindo que o objeto possa ser utilizado posteiormente
 */
/*No exemplo dessa classe o singleton Lazy, criamos um construtor que não instanciará o objeto,
* mas sim, receberá o resultado através do retorno de um método manipulador
(ou seja, quem deixa para fazer depois, é "preguiso");
 */
public class SingletonLazy {
//Atributo
            private static SingletonLazy instancia;
//Método construtor
            //A grande jogada do "Singleton" é que o construtor deve ser "PRIVADO" para que não seja possível instanciá-lo novamente
            private SingletonLazy(){
                super();// chama o construtor da classe "mãe"
            }
//Método manipulador
            //Para que o método estático realize a instanciação de um objeto, primeiro ele irá conferir se a instância é nula
            public static SingletonLazy getInstancia(){
                if (instancia==null){
                        instancia=new SingletonLazy();
                    }
                return  instancia;
            }
}