package edu.flavio.example.subsistema.crm;
// aqui vamos simular um sistema de CRM com os usuários já estão cadastrados precisaremos migrar com informações adcionais para outros sistema
public class CRMService {

    private CRMService(){
        super();
    }
    public static void gravarCliente( String nome, String cep,String cidade, String estado){
        System.out.println("Cliente salvo no sistema de CRM");
    }
}
