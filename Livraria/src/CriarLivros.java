//Classe de execução => main
public class CriarLivros {
    public static void main(String[] args) {
        // Intanciando criar um objeto ==> Criar um objeto na memoria
        // Tipo nomeObjeto
        // Livro Favorito = new Livro()

        Livro favorito = new Livro();

        favorito.titulo = "O Hobbit";
        favorito.autor = "J. R. R. Tolkien";
        favorito.valor = 50.68;
        favorito.editora = "Reinaldo José Lopes";
        favorito.resumo ="Bilbo Bolseiro era ...";
        favorito.paginas = 336;
        favorito.tipoCapa = "CAPA DURA";

        System.out.println("Meu livro Favorito é:" + favorito.titulo);
        System.out.println("O autor do livro é : " + favorito.autor);
        System.out.println("O preço do livro é : " + favorito.valor);
        System.out.println("O numero de paginas é : " + favorito.paginas);
        System.out.println("A editora do livro é : " + favorito.editora);

        Livro meuLivro = new Livro();

        String Titulodolivro;
        System.out.println("Qual o nome do novo livro :");
        String AutorDoLivro;
        System.out.println("Qual o nome do autor do livro :");
    }
}
