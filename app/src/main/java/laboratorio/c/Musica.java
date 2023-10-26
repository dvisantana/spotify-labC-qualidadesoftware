package main.java.laboratorio.c;

public class Musica {
    private int id;
    private String nome;
    private String artista;
    private String genero;
    private int anoLancamento;
    private String album;
    private double duracao; // em minutos
    private String letra;

    public Musica(int id, String nome, String artista, String genero, int anoLancamento, String album, double duracao, String letra) {
        this.id = id;
        this.nome = nome;
        this.artista = artista;
        this.genero = genero;
        this.anoLancamento = anoLancamento;
        this.album = album;
        this.duracao = duracao;
        this.letra = letra;
    }

    // Getters e Setters para cada campo

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public String getAlbum() {
        return album;
    }

    public void setAlbum(String album) {
        this.album = album;
    }

    public double getDuracao() {
        return duracao;
    }

    public void setDuracao(double duracao) {
        this.duracao = duracao;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    @Override
    public String toString() {
        return "ID: " + id + "\n" +
               "Nome: " + nome + "\n" +
               "Artista: " + artista + "\n" +
               "Gênero: " + genero + "\n" +
               "Ano de Lançamento: " + anoLancamento + "\n" +
               "Álbum: " + album + "\n" +
               "Duração: " + duracao + " minutos\n" +
               "Letra:\n" + letra;
    }
}
