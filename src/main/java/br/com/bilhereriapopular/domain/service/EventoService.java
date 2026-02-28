package br.com.bilhereriapopular.domain.service;

import br.com.bilhereriapopular.domain.entity.Evento;
import br.com.bilhereriapopular.domain.repository.EventoRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.UUID;

@Slf4j
@Service
@RequiredArgsConstructor
@Transactional(readOnly = true)
public class EventoService {

    private final EventoRepository eventoRepository;

    public List<Evento> listarTodos() {
        log.info("[BilheteriaPopular] - METODO: listarTodos");
        return eventoRepository.findAll();
    }

    public Evento buscarPorId(final UUID id) {
        log.info("[BilheteriaPopular] - METODO: buscarPorId: id: {}", id);
        return eventoRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Evento não encontrado: " + id));
    }
}
