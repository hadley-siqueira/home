import java.util.Scanner;
    public class Questao03 {
        public static void main(String[] args) {
            Scanner s;
            double imc;
            double a;
            double m;
            s = new Scanner(System.in);

        System.out.print("altura em metros:");
        a = s.nextFloat();

        System.out.print("massa em quilos:");
        m = s.nextFloat();

        imc = m/(a*a);
        System.out.println("seu indice corporal é " + imc);
        
    }
}
