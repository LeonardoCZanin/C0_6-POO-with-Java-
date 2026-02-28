import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Insira a nota da prova: ");
        double notaprova = sc.nextDouble();

        if (notaprova >= 30 && notaprova < 60) {
            System.out.println("Aluno ficou de recuperacao");
            System.out.println("Insira a nota obtida na recuperacao: ");
            double recuperacao = sc.nextDouble();

            double media = (notaprova + recuperacao) / 2;
            if (media < 50) {
                System.out.println("Aluno  reprovado");
            } else {
                System.out.println("Aluno foi aprovado");
            }

        } else if (notaprova >= 60) {
            System.out.println("Aluno foi aprovado");
        } else {
            System.out.println("Aluno foi reprovado");
        }

        sc.close();
    }
}
