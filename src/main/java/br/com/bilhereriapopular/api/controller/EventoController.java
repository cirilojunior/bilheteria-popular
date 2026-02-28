package br.com.bilhereriapopular.api.controller;

import br.com.bilhereriapopular.api.dto.response.EventoResponse;
import br.com.bilhereriapopular.api.mapper.EventoMapper;
import br.com.bilhereriapopular.domain.service.EventoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/v1/eventos")
@RequiredArgsConstructor
public class EventoController {

    private final EventoService eventoService;
    private final EventoMapper eventoMapper;

    @GetMapping
    public List<EventoResponse> listarTodos() {
        return eventoMapper.toResponseList(eventoService.listarTodos());
    }

    @GetMapping("/{id}")
    public EventoResponse buscarPorId(@PathVariable final UUID id) {
        return eventoMapper.toResponse(eventoService.buscarPorId(id));
    }
}
