import java.util.Scanner;
public class q11 {
    public static void main (String[] args) {

        Scanner s;
        int a;
        int aa;
        s = new Scanner(System.in);

        System.out.println("Mostrarei o sucessor do numero digitado");
        System.out.print("Digite qualquer numero do 60 para baixo:");
        a = s.nextInt();

        aa = (a + 1)%61;

        System.out.println("o sucessor de " + a + " = " + aa);

    }
}
