import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira o numero de alunos(10,20,30) : ");
        int numeroTurma = sc.nextInt();

        switch(numeroTurma)
        {
            case 10,20:
                System.out.println("A sala utilizada deve ser I-16");
                break;
            case 30:
                System.out.println("A sala utilizada deve ser a sala I-22");
                break;
            default:
                System.out.println("Numero inserido invalido ");

        }

        sc.close();
    }
}
