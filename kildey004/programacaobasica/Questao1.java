import java.util.Scanner;

public class Questao1 {
    public static void main(String[] args) {
           Scanner s;
           int n;
           int n1;
           int n2;
           int n3;
           int n4;
           int n5;
           int n6;
           int n7;
           int n8;
           int n9 ;
           int n10;
            System.out.println("**Tabuada virtual**");
           s = new Scanner(System.in);
           System.out.println("informe o número: ");
           n = s.nextInt();

           System.out.println("tabuada do " + n);

           n1 = n * 1;
           n2 = n * 2;
           n3 = n * 3;
           n4 = n * 4;
           n5 = n * 5;
           n6 = n * 6;
           n7 = n * 7;
           n8 = n * 8;
           n9 = n * 9;
           n10 = n * 10;

           System.out.println(n + "x1 = " + n1);
           System.out.println(n + "x2 = " + n2);
           System.out.println(n + "x3 = " + n3);
           System.out.println(n + "x4 = " + n4);
           System.out.println(n + "x5 = " + n5);
           System.out.println(n + "x6 = " + n6);
           System.out.println(n + "x7 = " + n7);
           System.out.println(n + "x8 = " + n8);
           System.out.println(n + "x9 = " + n9);
           System.out.println(n + "x10 = " + n10);
    }
}
