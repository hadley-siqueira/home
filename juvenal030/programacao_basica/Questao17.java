import java.util.Scanner;

public class Questao17 {
    public static void main (String [] args ) {
        Scanner s;
        double x;
        double z;
        s = new Scanner (System.in);
        System.out.println("calculo do dinheiro");
        x = 0;
        System.out.print(" informe a quantidade de moedas de 1 centavos");
        z = s.nextInt ();
        x = x + z * 0.01;
        
        System.out.print(" informe a quantidae de moedas de 5 centavos");
        z = s.nextInt ();
        x = x + z * 0.05;

        System.out.print(" informe a quantidade de moedas de 10 centavos");
        z = s.nextInt ();
        x = x + z * 0.10;

        System.out.print(" informe a quantidade de moedas de 25 centavos");
        z = s.nextInt ();
        x = x + z * 0.25;

        System.out.print(" informe a quantidade de moedas de 50 centavos");
        z = s.nextInt ();
        x = x + z * 0.50;

        System.out.print(" informe a quantidade moedas de 1 real");
        z = s.nextInt ();
        x = x + z * 1.00;
        System.out.println(" o dinheiro economizado eh " + x);
    }
}
