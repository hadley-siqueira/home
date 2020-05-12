import java.util.Scanner;

public class questao14 {    
    public static void main (String[] args) {
        Scanner s;
        int d;
        int a;
        int m;
        int dd;
        s =  new Scanner (System.in);
        System.out.println("O tempo sem acidentes: ");
        System.out.println("Informe os dias sem acidentes: ");
        d = s.nextInt();
        a = d / 360;
        m = (d - a * 360) / 30;
        dd = d - a * 360 - m * 30;
        System.out.println("O tempo sem acidentes " + a + " anos " + m + " meses " + dd + " dias ");
    }
}
