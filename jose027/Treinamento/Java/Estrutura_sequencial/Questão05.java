import java.util.Scanner;
public class Questão05 {
    public static void main(String[] args) { 
        Scanner s;
        s = new Scanner(System.in);

        System.out.print("Digite a medida em metros: ");
        int met = s.nextInt();

        System.out.println("Medida em centímetros: " + (met * 100));
    }
}
