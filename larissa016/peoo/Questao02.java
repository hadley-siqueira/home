import java.util.Scanner;

public class Questao02 {
    public static void main(String[] args) {
        Scanner s;
        s = new Scanner(System.in);

        System.out.print("Numero de horas: ");
        float h = s.nextInt();

        float d = h / 24;

        System.out.println(h + " horas é equivalente a " + d + " dias ");
        }
    }
