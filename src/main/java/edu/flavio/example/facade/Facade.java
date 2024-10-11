package edu.flavio.example.facade;
//Para realizarmos a interação com a CepApi de forma a extrairmos e completarmos os valores contidos no CRM,
// faremos uso do Padrão de design "Facade"

import edu.flavio.example.subsistema.cep.CepApi;
import edu.flavio.example.subsistema.crm.CRMService;

public class Facade {

        // detro da classe criamos o método, através dos valores do CRM, buscará os complemento na API e completará os dados
    public void migrarCliente(String nome, String cep){
        String cidade=CepApi.getInstancia().recuperarCidade(cep);
        String estado=CepApi.getInstancia().recuperarEstado(cep);

        CRMService.gravarCliente(nome,cep,cidade,estado);
    }
}
