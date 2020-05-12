import java.util.Scanner;

public class Questao01 {
    public static void main(String[] args) {
        Scanner s;
        int num;
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
        System.out.println ("informe o numero para ser multiplicado: ");
        num = s.nextInt();

        v1 = num * 1;
        v2 = num * 2;
        v3 = num * 3;
        v4 = num * 4;
        v5 = num * 5;
        v6 = num * 6;
        v7 = num * 7;
        v8 = num * 8;
        v9 = num * 9;
        v10 = num * 10;
       System.out.println ("o resultado eh " + num);
       System.out.println (num + "x1 = " + v1);
       System.out.println (num + "x2 = " + v2);
       System.out.println (num + "x3 = " + v3);
       System.out.println (num + "x4 = " + v4);
       System.out.println (num + "x5 = " + v5);
       System.out.println (num + "x6 = " + v6);
       System.out.println (num + "x7 = " + v7);
       System.out.println (num + "x8 = " + v8);
       System.out.println (num + "x9 = " + v9);
       System.out.println (num + "x10 = " + v10);

    }
}
