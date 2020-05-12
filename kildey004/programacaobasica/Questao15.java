import java.util.Scanner;

public class Questao15 {
    public static void main (String[] args) {
        double grauc;
        double grauf;
        Scanner s;

        System.out.println("***Conversor de escala de temperatura***");

        s = new Scanner(System.in);
        System.out.println("Digite a temperatura em graus celsius:");
        grauc = s.nextFloat();

        grauf = 1.8 * grauc + 32;

        System.out.println("Graus em Fahrenheit: " + grauf);
    }
}
