import java.util.Scanner;

public class questao12 {
    public static void main (String [] args) {
        Scanner s;
        int a;
        int b;
        int c;
        int wa;
        int wb;
        int wc;
        int ww;
        s = new Scanner (System.in);
        System.out.print( " Informe a quantidade de camisetas pequenas: " );
        a = s.nextInt();
        System.out.print( " Informe a quantidade de camisetas médias: " );
        b = s.nextInt();
        System.out.print( " Informe a quantidade de camisetas grandes: " );
        c = s.nextInt();

        wa = a * 10;
        wb = b * 12;
        wc = c * 15;
        ww = wa + wb + wc;
        System.out.println( " O valor arrecadado é: " + ww); 
   }
}
