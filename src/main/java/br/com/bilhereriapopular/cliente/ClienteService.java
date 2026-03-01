package br.com.bilhereriapopular.cliente;

import org.springframework.stereotype.Service;

@Service
public class ClienteService {

    public Cliente visualizarDadosCliente(String id) {
        return new Cliente(id, "Cliente Fulano" + id);
    }
}
