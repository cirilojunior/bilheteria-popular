package br.com.bilhereriapopular.api.mapper;

import br.com.bilhereriapopular.api.dto.response.EventoResponse;
import br.com.bilhereriapopular.domain.entity.Evento;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface EventoMapper {
    EventoResponse toResponse(Evento evento);

    List<EventoResponse> toResponseList(List<Evento> eventos);
}
