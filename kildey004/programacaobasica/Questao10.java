import java.util.Scanner;

public class Questao10 {
    public static void main(String[] args) {
        int hora;
        int m;
        int seg;
        int conversaoh;
        int conversaom;
        int conversaot;
        Scanner s;

        s = new Scanner(System.in);
        System.out.println("Digite a hora:");
        hora = s.nextInt();

        System.out.println("digite os minutos:");
        m = s.nextInt();

        System.out.println("Digite os segundos:");
        seg = s.nextInt();

        conversaoh = hora * 3600;
        conversaom = m * 60;
        conversaot = conversaoh + conversaom + seg;

        System.out.println(" hora em segundos eh: " + conversaot + " segundos");
    }
}
