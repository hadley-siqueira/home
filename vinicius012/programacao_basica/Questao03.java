import java.util.Scanner;

public class Questao03  {
     public static void main(String[] args)  {
       Scanner s; 
       s = new Scanner(System.in);

     
       System.out.println(" Qtd de casamentos: ");
       int x = s.nextInt();

       System.out.println(" Qtd de certidoes: ");
       int y = s.nextInt();

       int a = 250 * x;
       int b = 30 * y;

       System.out.println(" Total:$" + (a + b));        
       }
}
