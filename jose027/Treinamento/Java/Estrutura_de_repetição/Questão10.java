import java.util.Scanner;
public class Questão10 {
    public static void main(String[] args) {
        int mult = 1;
        Scanner s;
        s = new Scanner(System.in);
    
        System.out.print("Base: ");
        int b = s.nextInt();

        System.out.print("Expoente: ");
        int e = s.nextInt();

        if (e == 0) {
            System.out.println("1");
        } else {
            for (int c = 0; c < e; c++) {
                mult *= b;
            }
            System.out.println("Resultado: " + mult);
        }
    }
}
