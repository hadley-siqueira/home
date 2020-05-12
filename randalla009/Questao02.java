import java.util.scanner;

public class Questao02 {
    public static void main(String[]args) {
        Scanner s;
        int n1;
        int n2;
        int n3;
        s = new Scanner(System.in);
    
        System.out.println("**ProgramaQ2**");

        System.out.println("Numero:");
        n1 = s.nextInt();

        System.out.println("O quadrado de " + (n1) + " eh " + (n1*n1));

        System.out.println("Numero:");
        n2 = s.nextInt();

        System.out.println("O triplo de " + (n2) + " eh " + (n2*3));

        System.out.println("Numero:");
        n3 = s.nextInt();

        System.out.println("O quartuplo de " + (n3) + " eh " + (n3*4));
    }
}

