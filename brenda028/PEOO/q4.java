import java.util.Scanner;
public class q4 {
    public static void main (String[] args) {

        Scanner s;
        double p = 1.5;
        double q = 4;
        double r = 2;
        double w = 3;
        double m = 1.2;
        double n = 4.3;
        double delta;
        double x1;
        double x2;
        double P;
        double Q;
        double R;
        s = new Scanner(System.in);

        P = ((p * ( r + w)) /( q * (m + n)));
        Q = ((Math.pow(q, (q+r)) / (m + n)) + w);
        R = (((p + (Math.pow((r+w), 2)) /( Math.pow (q, 2)))* w)* (1/r));
        System.out.println("a ezpressão 'P' = " + P);
        System.out.println("a expressão 'Q' = " + Q);
        System.out.println("a expressão 'R' = " + R);

        delta = (Math.pow(Q,2) - (4 * P * R));
        if (delta < 0) {
            System.out.println("o delta eh negativo");
       }else {
            x1 = ((-Q + (Math.sqrt(delta))) / 2);
            x2 = ((-Q - (Math.sqrt(delta))) / 2);
            System.out.println("a expressão 'R' = " + x1 + ", " + x2);

        }
    }
}

