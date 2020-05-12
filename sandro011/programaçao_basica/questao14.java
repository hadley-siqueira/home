import java.util.Scanner;

public class questao14 {
    public static void main (String [] args) {
        Scanner s = new Scanner(System.in);
        int dias;
        int anos;
        int meses;
        
        System.out.print("informe o tempo de trabalho: ");
        dias = s.nextInt();

        anos = dias / 360;
        dias = dias - anos * 360;
        meses = dias / 30;
        dias = dias - meses * 30;

        System.out.println("a quantidade de anos eh: " + anos);
        System.out.println("a quantidade de meses eh: " + meses);
        System.out.println("a quantidade de dias eh: " + dias);
    }
}
