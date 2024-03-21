public class Calculo {
    //Atributos
    public double peso;
    public double altura;

    //Método Construtor
    public Calculo(double peso, double altura){
        this.peso = peso;
        this.altura = altura;
    }
    //double x = Math.pow(3,2); // 3² //sqrt => raiz²
    //Métodos
    public double calcularIMC(){
        return this.peso / Math.pow(this.altura,2);
    }

    public String exibirMensagem(){
        String mensagem;
        if(calcularIMC() <= 18.5)
            mensagem = "Seu IMC é de " + calcularIMC() + "você está abaixo do peso!";
        else if (calcularIMC() > 18.5 && calcularIMC() < 25)
            mensagem = "Seu IMC é de " + calcularIMC() + "você está no peso ideal!";
        else if(calcularIMC() >= 25 && calcularIMC() < 30)
            mensagem = "Seu IMC é de " + calcularIMC() + "você está levemente acima do peso!";
        else if(calcularIMC() >= 30 && calcularIMC() < 35)
            mensagem = "Seu IMC é de " + calcularIMC() + "você está com obesidade grau I!";
        else if(calcularIMC() >= 35 && calcularIMC() < 40)
            mensagem = "Seu IMC é de " + calcularIMC() + "você está com obesidade grau II - severa!";
        else
            mensagem = "Seu IMC é de " + calcularIMC() + "você está com obesidade grau III - mórbida!";
        return mensagem;
    }
    public String exibirMensagem2(){
        String mensagem = "Seu IMC é de " + calcularIMC();
        if(calcularIMC() <= 18.5)
            mensagem +=  ", você está abaixo do peso!";
        else if (calcularIMC() > 18.5 && calcularIMC() < 25)
            mensagem +=  ",você está no peso ideal!";
        else if(calcularIMC() >= 25 && calcularIMC() < 30)
            mensagem +=  ",você está levemente acima do peso!";
        else if(calcularIMC() >= 30 && calcularIMC() < 35)
            mensagem +=  ",você está com obesidade grau I!";
        else if(calcularIMC() >= 35 && this.calcularIMC() < 40)
            mensagem +=  ",você está com obesidade grau II - severa!";
        else
            mensagem +=  ",você está com obesidade grau III - mórbida!";
        return mensagem;
    }

    public String exibirMensagem3(){
        double imc = calcularIMC();
        String mensagem = "Seu IMC é de " + imc;
        if(imc <= 18.5)
            mensagem +=  ", você está abaixo do peso!";
        else if (imc > 18.5 && imc < 25)
            mensagem +=  ",você está no peso ideal!";
        else if(imc >= 25 && imc < 30)
            mensagem +=  ",você está levemente acima do peso!";
        else if(imc >= 30 && imc < 35)
            mensagem +=  ",você está com obesidade grau I!";
        else if(imc >= 35 && imc < 40)
            mensagem +=  ",você está com obesidade grau II - severa!";
        else
            mensagem +=  ",você está com obesidade grau III - mórbida!";

        return mensagem;
    }