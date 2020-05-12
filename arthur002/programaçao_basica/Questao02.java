import java.util.Scanner;

public class Questao02 {
    public static void main(String[] args){
        Scanner s;
        int n;

        s = new Scanner(System.in);
        System.out.println ("**  quadrado de um numero  **");
        
        System.out.print("numero:");
        n = s.nextInt();

        System.out.println(n + "x = " + (n*n)); 
        
        System.out.println ("**  triplo de um numero  **");
        
        System.out.print("numero:");
        n = s.nextInt();

        System.out.println(n + "x3 = " + (3*n)); 
        
       
        System.out.println ("**  quadruplo de um numero  **");
        
        System.out.print("numero:");
        n = s.nextInt();

         System.out.println(n + "x4 = " + (4*n)); 
       
    }
} 

