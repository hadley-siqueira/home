
import java.util.Scanner;
public class q2{
        public static void main(String args []) {
        Scanner s;
        s = new Scanner(System.in);

        System.out.println("NUMERO DE HORAS:");
        float h = s.nextInt();
        

        float a = h/24;

        System.out.println(h + " EH EQUIVALENTE AH " + a + " dias");

    }
}
