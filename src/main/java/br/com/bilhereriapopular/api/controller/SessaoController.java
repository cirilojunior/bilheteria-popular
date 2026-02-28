package br.com.bilhereriapopular.api.controller;

import br.com.bilhereriapopular.api.dto.response.SessaoResponse;
import br.com.bilhereriapopular.api.mapper.SessaoMapper;
import br.com.bilhereriapopular.domain.service.SessaoService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("/v1/eventos/{eventoId}/sessoes")
@RequiredArgsConstructor
public class SessaoController {

    private final SessaoService sessaoService;
    private final SessaoMapper sessaoMapper;

    @GetMapping
    public List<SessaoResponse> listarPorEvento(@PathVariable final UUID eventoId) {
        return sessaoMapper.toResponseList(sessaoService.listarPorEvento(eventoId));
    }
}
