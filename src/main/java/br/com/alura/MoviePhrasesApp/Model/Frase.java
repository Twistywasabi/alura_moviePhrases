package br.com.alura.MoviePhrasesApp.Model;

public class Frase {

    private int id;
    private String titulo;
    private String frase;
    private String personagem;
    private String poster;

    public Frase(int id, String titulo, String frase, String personagem, String poster) {
        this.id = id;
        this.titulo = titulo;
        this.frase = frase;
        this.personagem = personagem;
        this.poster = poster;
    }

    @Override
    public String toString() {
        return  "id=" + id +
                ", titulo='" + titulo + '\'' +
                ", frase='" + frase + '\'' +
                ", personagem='" + personagem + '\'' +
                ", poster='" + poster + '\'';
    }
}
