import java.util.Scanner;

public class questao10 {
    public static void main (String [] args) {
        Scanner s;
        int h;
        int m;
        int d;
        int a;
        int q;
        int n;
        s = new Scanner(System.in);

        System.out.println(" >>Prgrama leitor de segundos<< ");

        System.out.println(" Informe quantas horas: ");
        h = s.nextInt();
        System.out.println(" Informe os minutos: ");
        m = s.nextInt();
        System.out.println(" Informe os segundos: ");
        q  = s.nextInt();
        d = h * 3600;
        a = m * 60; 
        n = d + a;
        System.out.println(" Os segundos são: " + n);

    }
}

