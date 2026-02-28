import java.util.Scanner;
public class Main
{
    public static void main (String[] args)
{
    Scanner sc = new Scanner(System.in);
    int a = sc.nextInt();
    int b = sc.nextInt();
    int c = sc.nextInt();
    String d = String.format("%.2f",((a+b+c)/3.0));
    System.out.println("Lanches consumidos ao total : " + (a+b+c));
    System.out.println("Lanches consumidos em media : "+ d);
    sc.close();

}
}
