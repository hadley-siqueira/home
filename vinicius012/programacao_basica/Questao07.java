import java.util.Scanner;

public class Questao07 {
    public static void main (String[]args) {
        Scanner s;
        int x;
        int y;
        s = new Scanner(System.in);
            
     
        System.out.print(" *** Digite a constante x do polinômio x³ + 3x² - 2x + 7: ");
        x = s.nextInt(); 

        y = x * x * x + 3 * x * x - 2 * x + 7;

        System.out.println(" O resultado e  " + y);  


    }
}
