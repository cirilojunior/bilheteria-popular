package br.com.bilhereriapopular.filme;

public record Filme (String codigo, String titulo, boolean disponivel){
    public Filme(String codigo, String titulo) {
        this(codigo, titulo, true);
    }
}
