package br.com.bilhereriapopular.api.mapper;

import br.com.bilhereriapopular.api.dto.response.SessaoResponse;
import br.com.bilhereriapopular.domain.entity.Sessao;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import java.util.List;

@Mapper(componentModel = "spring")
public interface SessaoMapper {

    @Mapping(source = "evento.id", target = "eventoId")
    SessaoResponse toResponse(Sessao sessao);

    List<SessaoResponse> toResponseList(List<Sessao> sessoes);
}
