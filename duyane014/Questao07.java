import java.util.Scanner;

public class Questao07 {
    public static void main(String[] args) {
     int resultado; 
     int x;
     Scanner s;

     s = new Scanner(System.in);

     System.out.println("programa contador de polinomio"); 

     System.out.print("determine o valor de x: ");
     x = s.nextInt(); 
     resultado = x * x * x + 3 * x * x - 2 * x + 7; 

     System.out.println("o polinomiio eh " + resultado);
     } 
}
 
