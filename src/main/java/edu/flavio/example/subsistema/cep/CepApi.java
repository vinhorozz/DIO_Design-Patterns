package edu.flavio.example.subsistema.cep;
// aqui simularemos uma API que consome dados de um sitma de CEP
public class CepApi {
//usamos um padrão Singleton "Eager" para iniciamos a estrutura
    private static CepApi instancia=new CepApi();

    private CepApi() {
        super();
    }

    public static CepApi getInstancia() {
        return instancia;
    }
    // adicionamos métodos para que as solicitações do usuário sejam atendidas de acordo com as informações desejadas
    public String recuperarCidade(String cep){
        return "São Paulo";// fizemos um mock para teste
    }
    public String recuperarEstado( String cep){
        return "SP";// fizemos um mock para teste
    }

}
