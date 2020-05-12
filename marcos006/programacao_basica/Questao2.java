import java.util.Scanner;

public class Questao2 {
    public static void main(String[] args) {
        Scanner s;

        s = new Scanner(System.in);
        System.out.println("Informe n1: ");
        int n1 = s.nextInt();

        System.out.println("Informe n2: ");
        int n2 = s.nextInt();

        System.out.println("Informe n3: ");
        int n3 = s.nextInt();

System.out.println("O quadrado de " + n1 + " eh " + (n1 * n1));
System.out.println("O triplo de " + n2 + " eh " + (n2 * 3));
System.out.println("O quadruplo de " + n3 + " eh " + (n3 * 4));


    }
}
