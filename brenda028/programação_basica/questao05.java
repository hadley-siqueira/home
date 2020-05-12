import java.util.Scanner;

public class questao05 {
    public static void main (String[] args) {
        Scanner s;
        int c;
        int n;
        int v;
        int r;
        int w;
        int d;
        int e;
        int p;
        int g;
        int f;
        int x;
        int j;
        int z;
        int a;
        int ss;

        s = new Scanner (System.in);
        System.out.println("**Seguradora XYZ**");
        System.out.print(" >>Sistema de avaliação<< ");
        System.out.print("Informe a quantidade de contratos simples:");
        n = s.nextInt();
        System.out.print("Informe a quantidade de contratos completos:");
        v = s.nextInt ();
        c = n * 1500;
        j = v * 2500;
        a = n * 3500;
        w = v * 4500;
        z = c + j;
        e = a + j;
        ss = e + z;
        System.out.println(" O lucro eh: " + ss);
        

    }
}
