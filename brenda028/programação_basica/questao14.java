import java.util.Scanner;

public class questao14 {
    public static void main (String[] args) {
        Scanner s;
        int a;
        int e;
        int i;
        int aa;
        s = new Scanner (System.in);
        System.out.print(" >>Tempo sem acidentes<< ");
        System.out.print(" Informe os dias sem acidentes: ");
        a = s.nextInt ();
        e = a / 360;
        i = (a - e * 360) / 30;
        aa = a - e * 360 - i * 30;
        System.out.println(" O Tempo sem acidentes: " + e + " Anos: " + i + " Meses: " + aa + " Dias: " );

    }
}

