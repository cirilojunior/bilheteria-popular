package br.com.bilhereriapopular.api.dto.response;

import lombok.Builder;

import java.util.UUID;

@Builder(setterPrefix = "with")
public record EventoResponse(
        UUID id,
        String nome,
        String descricao,
        String categoria
) {
}
