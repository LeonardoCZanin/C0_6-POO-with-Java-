import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args)
    {
        Scanner sc =  new Scanner(System.in);
        Random rand = new Random();
        int numeroGerado=rand.nextInt(10)+1;
        int resposta;

        System.out.println("qual o numero aleatorio foi gerado? ");
        do {
             resposta = sc.nextInt();
        }while(resposta<0 && resposta<10);

        while(resposta!=numeroGerado)
        {
            System.out.println("Errou o numero insira de novo");
            resposta = sc.nextInt();
        };

        System.out.println("Acertou o numero");


        sc.close();
    }

}
