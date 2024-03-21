import java.util.Scanner;

public class TesteIMC {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        Scanner leitorTexto = new Scanner(System.in);

        System.out.println("Digite seu peso");
        double peso = leitor.nextDouble();
        System.out.println("Digite sua altura");
        double altura = leitor.nextDouble();

        Calculo calculo = new Calculo(peso, altura);
        System.out.println(calculo.exibirMensagem());
        System.out.println("Informe seu sexo para calcular o peso ideal: (F) ou (M)");
        String sexo = leitorTexto.nextLine();
        System.out.println("Seu peso ideal é: " + calculo.pesoIdeal(sexo));

    }
}
