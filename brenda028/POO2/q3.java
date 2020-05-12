import java.util.Scanner;
public class q3 {
    public static void main (String[] args) {
        Scanner s;
        double a;
        double aa;
        s = new Scanner(System.in);
        System.out.print("Digite o consumo da agua em metros cúbicos:");
        a = s.nextDouble();
        
        if (a<20.0) {
        aa = (a * 8.50);
        System.out.println("A conta e :" + aa + " reais ");
        } else  {
        aa = (a = 11.0);
        System.out.println("A conta e:" + aa + " reais");

        }
    }
}

