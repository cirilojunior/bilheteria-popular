package br.com.bilhereriapopular.reserva;

import br.com.bilhereriapopular.cliente.Cliente;
import br.com.bilhereriapopular.filme.Filme;
import br.com.bilhereriapopular.filme.Sessao;
import br.com.bilhereriapopular.sala.Assento;
import br.com.bilhereriapopular.sala.Sala;
import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.assertNotNull;

/**
 * Unit tests for the ReservaService class.
 * This class tests the behavior of the gerarTicket method, which generates a unique ticket
 * for a reservation by taking Cliente, Sessao, and Assento as inputs.
 */
class ReservaServiceTest {

    private final ReservaService reservaService = new ReservaService();

    @Test
    void shouldGenerateTicketForValidInput() {
        // Arrange
        Cliente cliente = new Cliente("CL001", "John Doe");
        Filme filme = new Filme("FL123", "Inception");
        Sessao sessao = new Sessao("SS001", filme, LocalDateTime.of(2026, 3, 10, 20, 0));
        Sala sala = new Sala(1);
        Assento assento = new Assento(sala, "A1");

        // Act
        String ticket = reservaService.gerarTicket(cliente, sessao, assento);

        // Assert
        assertNotNull(ticket, "Ticket should not be null");
    }

    @Test
    void shouldHandleTicketGenerationForEdgeCaseInput() {
        // Arrange
        Cliente cliente = new Cliente("CL002", "");
        Filme filme = new Filme("FL321", "");
        Sessao sessao = new Sessao("SS002", filme, LocalDateTime.of(2026, 12, 25, 22, 30));
        Sala sala = new Sala(2);
        Assento assento = new Assento(sala, "B1");

        // Act
        String ticket = reservaService.gerarTicket(cliente, sessao, assento);

        // Assert
        assertNotNull(ticket, "Ticket should not be null even for edge case inputs");
    }
}