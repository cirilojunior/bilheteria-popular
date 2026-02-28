package br.com.bilhereriapopular.domain.service;

import br.com.bilhereriapopular.domain.entity.Sessao;
import br.com.bilhereriapopular.domain.repository.SessaoRepository;
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
public class SessaoService {

    private final SessaoRepository sessaoRepository;

    public List<Sessao> listarPorEvento(final UUID eventoId) {
        log.info("[BilheteriaPopular] - METODO: listarPorEvento: eventoId: {}", eventoId);
        return sessaoRepository.findByEventoId(eventoId);
    }
}
