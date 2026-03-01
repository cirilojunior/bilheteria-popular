package br.com.bilhereriapopular.cliente;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ClienteServiceTest {

    private final ClienteService clienteService = new ClienteService();

    @Test
    public void testVisualizarDadosCliente() {
        Cliente cliente = clienteService.visualizarDadosCliente("123");
        assertEquals("Cliente Fulano123", cliente.nome());
    }
}