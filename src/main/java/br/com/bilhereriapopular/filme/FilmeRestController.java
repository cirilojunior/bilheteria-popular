package br.com.bilhereriapopular.filme;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController("/filmes")
public class FilmeRestController {

    @GetMapping("/")
    public List<Filme> visualizarFilmes() {
        return List.of(
                new Filme("1", "Matrix", true),
                new Filme("2", "Matrix Reloaded", true),
                new Filme("3", "Matrix Revolutions", true)
        );
    }

    @GetMapping("/{codigo}")
    public Filme visualizarDadosFilme(String codigo) {
        return new Filme(codigo, "MAtrix", true);
    }
}
