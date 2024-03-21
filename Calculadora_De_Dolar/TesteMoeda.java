import java.util.Scanner;

public class TesteMoeda {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Moeda moeda = new Moeda();
        System.out.println("Informe o valor em reais: R$ ");
        moeda.valorReal = leitor.nextDouble();
        System.out.println("Informe a cotação do dólar de hoje: ");
        moeda.cotacaoDolar = leitor.nextDouble();
        moeda.calcularConversao();
        System.out.println(moeda.quantidadeDolar);
        System.out.println(moeda.retornarCalculoConversao());

        //System.out.println(moeda.calcularConversao(cpf:     nome:   ));
        String nome , cpf ;
        nome = leitor.nextLine();
    }
}
