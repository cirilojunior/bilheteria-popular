package br.com.bilhereriapopular.api.exception;

import lombok.Builder;

import java.time.LocalDateTime;
import java.util.List;

@Builder(setterPrefix = "with")
public record ErrorResponse(
        int status,
        String message,
        LocalDateTime timestamp,
        List<String> details
) {
}
