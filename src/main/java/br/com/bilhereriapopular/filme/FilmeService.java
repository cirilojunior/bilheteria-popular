package br.com.bilhereriapopular.filme;

import java.util.List;

public class FilmeService {

    List<Filme> filmes = List.of(new Filme("1", "Matrix", true));

    public Filme visualizarDadosFilme(String codigo) {
        return new Filme(codigo, "MAtrix", true);
    }

    public List<Filme> visualizarFilmesDisponiveis() {
        return visualizarFilmes(true);
    }

    public List<Filme> visualizarFilmes(boolean disponivel) {
        return filmes.stream().filter(filme -> filme.disponivel() == disponivel).toList();
    }
}
