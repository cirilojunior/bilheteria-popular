package br.com.bilhereriapopular.api.dto.response;

import lombok.Builder;

import java.time.LocalDateTime;
import java.util.UUID;

@Builder(setterPrefix = "with")
public record SessaoResponse(
        UUID id,
        LocalDateTime horario,
        String sala,
        UUID eventoId
) {
}
