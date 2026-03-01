package br.com.bilhereriapopular.reserva;

import br.com.bilhereriapopular.cliente.Cliente;
import br.com.bilhereriapopular.filme.Sessao;
import br.com.bilhereriapopular.sala.Assento;

public record Reserva(String ticket, Cliente cliente, Sessao sessao, Assento assento) {
}
