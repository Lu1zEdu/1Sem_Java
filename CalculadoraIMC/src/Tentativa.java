import java.util.Scanner;


public class Tentativa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculadora de IMC");
        System.out.print("Informe o seu peso em kg: ");
        double peso = scanner.nextDouble();

        System.out.print("Informe a sua altura em metros: ");
        double altura = scanner.nextDouble();

        double imc = calcularIMC(peso, altura);

        System.out.printf("Seu IMC é %.2f\n", imc);
        System.out.println("Classificação:");

        if (imc < 18.5) {
            System.out.println("Abaixo do peso");
        } else if (imc < 25) {
            System.out.println("Peso normal");
        } else if (imc < 30) {
            System.out.println("Sobrepeso");
        } else {
            System.out.println("Obesidade");
        }

        scanner.close();
    }

    public static double calcularIMC(double peso, double altura) {
        return peso / (altura * altura);
    }
}
