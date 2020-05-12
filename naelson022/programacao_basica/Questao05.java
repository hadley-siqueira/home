import  java.util.Scanner;

public class Questao05{
    public static void main (String[] args){
        Scanner s;
        int n;
        int v;
        int r;
        int d;
        int e;
        int p;
        int g;
        int f;
        int x;
    
        s = new Scanner (System.in);
        System.out.println("** seguradora XYZ**");
        System.out.print("   >> sistema de avaliaçao <<");
        System.out.print(" informe a quantidade de contratos simples:");
        n = s.nextInt();
        System.out.print(" informe a quantidade de contratos completos: ");
        v = s.nextInt ();
        r = n * 2300;
        d = v * 3500;
        e = n * 2530;
        p = v * 3850;
        g = r + d;
        f = e + p;
        x = f - g;
        System.out.println(" o lucro eh " + x);



    }
}
