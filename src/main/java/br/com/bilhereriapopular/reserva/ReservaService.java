package br.com.bilhereriapopular.reserva;

import br.com.bilhereriapopular.cliente.Cliente;
import br.com.bilhereriapopular.filme.Sessao;
import br.com.bilhereriapopular.sala.Assento;

import java.util.UUID;

public class ReservaService {

    public String gerarTicket(Cliente cliente, Sessao sessao, Assento assento) {
        return new Reserva(UUID.randomUUID().toString(), cliente, sessao, assento).ticket();
    }
}
