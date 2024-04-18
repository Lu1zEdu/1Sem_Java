import models.Musica;

public class Main {
    public static void main(String[] args) {
        System.out.println("Sistema iniciando!");

        // Instanciando um objeto da classe models.Musica
        Musica novaMusica = new Musica();
        novaMusica.setNome("War Pigs");
        novaMusica.setArtista("Black Sabbath");
        novaMusica.setGenero("Heavy Metal");
        novaMusica.setDuracao(-55);
        novaMusica.setAnoLancamento(20);

        novaMusica = new Musica("War Pigs", "Black Sabbath",
                "Heavy Metal", 474, 1970);
    }
}