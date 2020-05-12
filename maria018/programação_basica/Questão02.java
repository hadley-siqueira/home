import java.util.Scanner;

public class Questão02 {
    public static void main(String[] args) {
         Scanner s; 
        int n1;
        int n2;
        int n3;

        s = new Scanner(System.in);
        System.out.print("Digite um numero: ");
        n1 = s.nextInt();

        System.out.print("Digite outro numero: ");
        n2 = s.nextInt();

        System.out.print("Digite mais um numero: ");
        n3 = s.nextInt();
        
        System.out.println(" o quadrado de " + n1 + " eh " + (n1 * n1));
        System.out.println(" o triplo de " +  n2 + " eh " + (n2 * 3));
        System.out.println(" o quadruplo de " +  n3 + " eh " + (n3 * 4));
    }

}

