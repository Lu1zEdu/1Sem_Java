import java.util.Scanner;

public class TesteMoeda {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Scanner leitorTexto = new Scanner(System.in);

        Moeda moeda = new Moeda();
        System.out.println("Informe o valor em reais: R$ ");
        moeda.valorReal = leitor.nextDouble();
        System.out.println("Informe a cotação do dólar de hoje: ");
        moeda.cotacaoDolar = leitor.nextDouble();
        //moeda.calcularConversao();
        //System.out.println(moeda.quantidadeDolar);
        System.out.println(moeda.comprarDolar("62626267", "Luiz Eduardo"));
        System.out.println("-----------------------------------------------------------");

        Moeda moeda2 = new Moeda();
        //System.out.println(moeda.retornarCalculoConversao());
        String nome, cpf;
        System.out.println("Informe o nome do cliente: ");
        nome = leitorTexto.nextLine();
        System.out.println("Informe o cpf do cliente: ");
        cpf = leitorTexto.nextLine();
        System.out.println("Informe o valor em reais: R$ ");
        moeda2.valorReal = leitor.nextDouble();
        System.out.println("Informe a cotação do dólar de hoje: ");
        moeda2.cotacaoDolar = leitor.nextDouble();
        System.out.println(moeda2.comprarDolar(nome, cpf));

    }
}