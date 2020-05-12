import java.util.Scanner;

public class Questao15 {
    public static void main(String[] args) {
        float c;
        float f;
        Scanner s;

        s = new Scanner(System.in);
        System.out.println("**Conversor de Graus**");

        System.out.print("Informe os graus Celsius:");
        c = s.nextFloat();

        f = 1.8f * c + 32;

        System.out.println( );
        System.out.println("Os graus em Farenheit eh:" + f);
    }
}
