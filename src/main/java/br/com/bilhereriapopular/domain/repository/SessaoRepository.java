package br.com.bilhereriapopular.domain.repository;

import br.com.bilhereriapopular.domain.entity.Sessao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface SessaoRepository extends JpaRepository<Sessao, UUID> {
    List<Sessao> findByEventoId(UUID eventoId);
}
