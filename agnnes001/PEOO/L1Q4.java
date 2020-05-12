import java.util.Scanner;

public class L1Q4 {
    public static void main(String[] args) {
        Scanner s;
        double a,e,f,r1,r2,r3,r4;
        int b,c,d;

        s = new Scanner(System.in);
        System.out.print("Informe o valor de a:");
        a = s.nextDouble();
        System.out.print("Informe o valor de b:");
        b = s.nextInt();
        System.out.print("Informe o valor de c:");
        c = s.nextInt();
        System.out.print("Informe o valor de d:");
        d = s.nextInt();
        System.out.print("Informe o valor de e:");
        e = s.nextDouble();
        System.out.print("Informe o valor de f:");
        f = s.nextDouble();

        r1 = (a*(c+d))/(b*(e+f));
        r2 = Math.pow(a,b+c)/(e+f)+d;
        r3 = (a + Math.pow(c+d,2)/Math.pow(b,2)*d)*1/c;
        r4 = (-b + Math.sqrt((b*b)-4*a*c))/2;

        System.out.println("Resultados: "+"A)"+r1+" B)"+r2+" C)"+r3+" D)"+r4);
    }
}
