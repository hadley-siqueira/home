import java.util.Scanner;

public class L1Q5 {
    public static void main(String[] args) {
        Scanner s;
        double v,c,t;

        s = new Scanner(System.in);
        System.out.print("Qual o valor a ser pago?");
        v = s.nextDouble();

        c = v*0.10;
        t = v+c;

        System.out.println("Subtotal:R$"+v+" Comissão do garçom:R$"+c+" Total:R$"+t);

    }
}        
