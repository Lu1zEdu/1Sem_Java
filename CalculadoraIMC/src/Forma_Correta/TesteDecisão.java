public class TesteDecisao {
    public static void main(String[] args) {
        int idade = 5;
        //Decisão simples
        if (idade >= 18) //resultado V ou F
            System.out.println("Pode tirar habilitação");

        if (idade >= 18) //resultado V ou F
        {
            System.out.println("Pode tirar habilitação");
            System.out.println("Pode votar");
        }

        //Decisão composta
        if(idade >= 18)
            System.out.println("Pode tirar habilitação");
        else  //resultado da condição é falsa entra no else
            System.out.println("Não pode tirar habilitação");

        //Decisão encadeada
        if(idade < 16)
            System.out.println("Não pode votar");
        else if (idade >= 16 && idade < 18)
            System.out.println("Voto é opcional");
        else
            System.out.println("Voto obrigatório");

        boolean achou = true;
        if(!achou)
            System.out.println();
        //Operadores lógicos
        /*
        E - &&
        OU - ||
        Não - !
         */
    }
}
