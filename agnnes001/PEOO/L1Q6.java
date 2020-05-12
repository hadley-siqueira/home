import java.util.Scanner;

public class L1Q6 {
    public static void main(String[] args) {
        Scanner s;
        double v,v1,v2,c,t;

        s = new Scanner(System.in);
        System.out.print("Qual o valor a ser pago?");
        v = s.nextDouble();
        System.out.print("Qual o valor da porcentagem de comissao do garçom?");
        v1 = s.nextDouble();

        v2 = v1/100;
        c = v*v2;
        t = v+c;

        System.out.println("Subtotal:R$"+v+" Comissão do garçom:R$"+c+" Total:R$"+t);

    }
}


