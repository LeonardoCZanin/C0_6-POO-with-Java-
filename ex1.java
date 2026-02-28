public class Main
{
    public static void main(String[] args)
    {
       int a = 10;
       int b = 4;
       int c = 2;
       double d = (a+b+c)/3.0;
       String media = String.format("%.2f",d);
        System.out.println("Numero total de lanches consumidos : "+(a+b+c));
        System.out.println( "Media de lanches consumidos : " + media );
    }
}
