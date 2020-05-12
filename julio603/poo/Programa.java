import java.util.Scanner;

public class Programa {
    public static void main(String[] args) {
        System.out.print("Qual o seu nome? ");
        Scanner s = new Scanner(System.in);

        String nome = s.nextLine();
        System.out.println("Hello, " + nome);
    }
}
