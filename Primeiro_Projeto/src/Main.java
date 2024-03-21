
import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){


        System.out.println("Hello word");

        Scanner leitor = new Scanner(System.in);

        System.out.println("Informe seu nome ");
       String nome = leitor.nextLine();

        System.out.println("Informe o ano de seu nascimento");
        Integer ano = leitor.nextInt();

        System.out.println("Informe o mes de seu nascimento");
        Integer mes = leitor.nextInt();

        System.out.println("Informe o dia de seu nascimento");
        Integer dia = leitor.nextInt();

        Pessoa pessoa = new Pessoa();
        pessoa.nome = nome;
        pessoa.nascimento = LocalDate.of( ano , mes , dia );

        System.out.println("Nome:" + pessoa.nome);
        System.out.println("Nascimento:" + pessoa.nascimento );

        System.out.println(pessoa.faleOsSeusDadosBasico());
    }
}
