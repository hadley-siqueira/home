import java.util.Scanner;
public class Questão06 {
    public static void main(String[] args) {
        Scanner s;
        s = new Scanner(System.in);

        System.out.print("Digite o raio do círculo: ");
        int r = s.nextInt();

        System.out.printf("A área do círculo é %.3f\n", Math.PI * Math.pow(r, 2));
    }
}
