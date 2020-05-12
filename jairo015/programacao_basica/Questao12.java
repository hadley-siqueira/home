import java.util.Scanner;

public class Questao12 {
    public static void main (String [] args ) {
        Scanner s;
         int p;
         int m;
         int g;
         int tp;
         int tm;
         int tg;
         int tt;
        
        s = new Scanner (System.in);
        System.out.print( " quantidade camisetas pequenas ");
        p = s.nextInt();
        System.out.print( " quantidade camisetas medias ");
        m = s.nextInt();
        System.out.print( " quantidade camisetas grandes ");
        g = s.nextInt ();
        tp = p * 10;
        tm = m * 12;
        tg = g * 15;
