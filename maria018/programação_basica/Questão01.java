import java.util.Scanner;

public class Questão01 {
    public static void main(String[] args) {
        Scanner s;
        int n;
        int v1;
        int v2;
        int v3;
        int v4;
        int v5;
        int v6;
        int v7;
        int v8;
        int v9;
        int v10;

        s = new Scanner(System.in);

        System.out.println("**Programa gerador de tabuada**");
        
        System.out.print("Digite um numero: ");
        n = s.nextInt();

        v1 = n * 1 ;
        v2 = n * 2;
        v3 = n * 3;
        v4 = n * 4;
        v5 = n * 5;
        v6 = n * 6;
        v7 = n * 7;
        v8 = n * 8;
        v9 = n * 9;
        v10 = n * 10;


        System.out.println("***Tabuada de " + n + "***");
        System.out.println(n + " x 1 = " + v1);
        System.out.println(n + " x 2 = " + v2);
        System.out.println(n + " x 3 = " + v3);
        System.out.println(n + " x 4 = " + v4);
        System.out.println(n + " x 5 = " + v5);
        System.out.println(n + " x 6 = " + v6);
        System.out.println(n + " x 7 = " + v7);
        System.out.println(n + " x 8 = " + v8);
        System.out.println(n + " x 9 = " + v9);
        System.out.println(n + " x 10 = " + v10);
 
    }   

}
