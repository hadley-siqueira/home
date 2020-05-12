import java.util.Scanner;

public class Questao01 {
    public static void main(String[] args) {
        Scanner s;
        int num;
        int t1;
        int t2;
        int t3;
        int t4;
        int t5;
        int t6;
        int t7;
        int t8;
        int t9;
        int t10;

        s = new Scanner(System.in);
        System.out.println ("Informe o numero: ");
        num = s.nextInt();
        
        t1 = num * 1;
        t2 = num * 2;
        t3 = num * 3;
        t4 = num * 4;
        t5 = num * 5;
        t6 = num * 6;
        t7 = num * 7;
        t8 = num * 8;
        t9 = num * 9;
        t10 = num * 10;

        System.out.println ("resultado: " + num);
        System.out.println (num + "x1 = " + t1);
        System.out.println (num + "x2 = " + t2);
        System.out.println (num + "x3 = " + t3);
        System.out.println (num + "x4 = " + t4);
        System.out.println (num + "x5 = " + t5);
        System.out.println (num + "x6 = " + t6);
        System.out.println (num + "x7 = " + t7);
        System.out.println (num + "x8 = " + t8);
        System.out.println (num + "x9 = " + t9);
        System.out.println (num + "x10 = " + t10);

    }
}
