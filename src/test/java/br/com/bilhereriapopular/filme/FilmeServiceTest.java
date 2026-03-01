package br.com.bilhereriapopular.filme;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FilmeServiceTest {

    @Test
    public void testVisualizarDadosFilmeByCodigo() {
        // Arrange
        FilmeService filmeService = new FilmeService();
        String codigo = "123";

        // Act
        Filme filme = filmeService.visualizarDadosFilme(codigo);

        // Assert
        assertEquals(codigo, filme.codigo());
        assertEquals("MAtrix", filme.titulo());
        assertTrue(filme.disponivel());
    }

    @Test
    public void testVisualizarDadosFilmeByDisponivel() {
        // Arrange
        FilmeService filmeService = new FilmeService();

        // Act
        List<Filme> filmesDisponiveis = filmeService.visualizarFilmesDisponiveis();

        // Assert
        assertEquals(1, filmesDisponiveis.size());
        Filme filme = filmesDisponiveis.getFirst();
        assertEquals("1", filme.codigo());
        assertEquals("Matrix", filme.titulo());
        assertTrue(filme.disponivel());
    }
}