package br.com.bilhereriapopular.filme;

import java.time.LocalDateTime;

public record Sessao (String codigo, Filme filme, LocalDateTime dataHora){
}
