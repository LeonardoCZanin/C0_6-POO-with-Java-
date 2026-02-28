import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args)
    {
        Scanner sc =  new Scanner(System.in);
        Random rand = new Random();
        int numeroGerado=rand.nextInt(10)+1;
        int resposta;
        int tentativasNecessarias=0;

        System.out.println("qual o numero aleatorio foi gerado? ");
        do {
             resposta = sc.nextInt();
             tentativasNecessarias++;
        }while(resposta<0 && resposta<10);

        while(resposta!=numeroGerado)
        {
            System.out.println("Errou o numero insira de novo");
            if(resposta>numeroGerado) {
                System.out.println("sabendo que o numero gerado e menor que a resposta anterior ");
            }
            else {
                System.out.println("sabendo que o numero gerado e maior que a resposta anterior");
            }
            tentativasNecessarias++;
            resposta = sc.nextInt();
        };

        System.out.println("Acertou o numero");
        System.out.println("tentativas necessarias : "+tentativasNecessarias);

        sc.close();
    }

}

