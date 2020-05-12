import java.util.Scanner;

public class Questao03 {
    public static void main (String [] args){
        Scanner s;
        int v;
        int t;
        int tt;
        int r;
        int g;
        Scanner s;

        s = new Scanner(System.in);
        System.out.print(" quantidade de casamento ? ");
        v = s.nextInt();
        System.out.print(" quantidade de certificado ? ");
        r = s.nextInt ();
        g = v * 250;
        t = r * 30;
        tt = g + t;
        System.out.println( " total : " + tt) ;

    }
}

