package models;

import java.util.ArrayList;
import java.util.List;

public class Album {
    private String nome;
    private String artista;
    private int anoLancamento;
    private int duracao;

    // usar outra classe como atributo de uma classe é chamado de composição
    // a classe Album é composta por várias músicas, ou uma lista de músicas
    private List<Musica> musicas = new ArrayList<>();

    public Album() {
    }

    // foi retirado a duracao do construtor pois a duracao é a soma das durações das
    // músicas
    // portanto ela não pode ser passada como parâmetro, nem atribuida diretamente
    // ela precisa ser calculada, a partir das durações das músicas
    public Album(String nome, String artista, int anoLancamento, List<Musica> musicas) {
        this.nome = nome;
        this.artista = artista;
        this.anoLancamento = anoLancamento;
        this.musicas = musicas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public int getDuracao() {
        return duracao;
    }

    public List<Musica> getMusicas() {
        return musicas;
    }

    public void setMusicas(List<Musica> musicas) {
        this.musicas = musicas;
    }

    @Override
    public String toString() {
        return "Album{nome='%s', artista='%s', anoLancamento=%d, duracao=%d, musicas=%s}"
                .formatted(nome, artista, anoLancamento, duracao, musicas);
    }
}
