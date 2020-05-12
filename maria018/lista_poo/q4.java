import java.util.Scanner;
public class q4 {
    public static void main (String[] args){

        Scanner s;
        double a = 1.5;
        double b = 4;
        double c = 2;
        double d = 3;
        double e = 1.2;
        double f = 4.3;
        double Delta;
        double x1;
        double x2;
        double A;
        double B;
        double C;
        s = new Scanner(System.in);

        A = ((a * (c + d)) /( b * (e + f)));
        B = ((Math.pow(a, (b+c)) / (e + f)) + d);
        C =(((a + (Math.pow((c+d), 2)) /( Math.pow(b, 2)))* d)* (1/c));
        System.out.println("A expressao 'A' = " + A);
        System.out.println("A espressao 'B' = " + B);
        System.out.println("A expressao 'C' = " + C);
    
    

        Delta = (Math.pow(b,2) - (4 * a * c));
        if (Delta < 0) {
            System.out.println("O delta eh negativo");
       }else {
            x1 = ((-b + (Math.sqrt(Delta))) / 2);
            x2 = ((-b - (Math.sqrt(Delta))) / 2);
            System.out.println("A expressao 'D' = " + x1 + ", " + x2);
        }
        
    }
}
