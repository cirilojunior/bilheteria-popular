package br.com.bilhereriapopular.cliente;

public class ClienteService {

    public Cliente visualizarDadosCliente(String id) {
        return new Cliente(id, "Cliente Fulano" + id);
    }
}
