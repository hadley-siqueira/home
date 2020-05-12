import java.util.Scanner;

public class Problema4 {
        public static void main(String[] args) {
                Scanner S;
                double a;
                int b;
                int c;
                int d;
                double e;
                double f;
                double g;
                double h;
                double i;
                double j;

                S = new Scanner(System.in);
                
                a = 1.5;
                b = 4;
                c = 2;
                d = 3;
                e = 1.2;
                f = 4.3;
                g = (a * (c + d)) / (b * (e + f));
                h = Math.pow(a,b+c) / (e + f) + d; 
                i = (a + Math.pow(c+d,2) / Math.pow(b,2) * d) * 1 / c;
                j = - b + Math.sqrt((b*b) - (4*a*c) / 2);
            
                System.out.println(" a * (c + d) / b * (e + f) = " + g);
                System.out.println(" a**b+c / e + f + d =  " + h);
                System.out.println(" [ a + (c + d)**2 / b**2 * d] 1 / c  = " + i); 
                System.out.println(" -b + b**2 - 4ac / 2 = " + j);
        }
    }
                


