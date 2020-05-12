import java.util.Scanner;
public class Questao04 {
    public static void main (String[] args) {
        Scanner s;
        double a=1.5;
        double b=4;
        double c=2;
        double d=3;
        double e=1.3;
        double f=4.3;
        double expressão1;
        double expressão2;
        double expressão3;
        double expressão4;
        s = new Scanner(System.in);

        expressão1 = ((a*(c + d))/(b * (e+f)));
        expressão2 = ((Math.pow(a, (b+c)) / (e+f)) + d);
        expressão3 = (((a + (Math.pow((c+d), 2)) /(Math.pow(b, 2))) * d)* (1/c));
        expressão4 = ((-b + Math.sqrt(Math.pow (b,2))-(4 * a * c)) / 2);
        System.out.println("expressão '1' = " + expressão1);
        System.out.println("expressão '2' = " + expressão2);
        System.out.println("expressão '3' = " + expressão3);
        System.out.println("expressão '4' = " + expressão4);

    }
}
