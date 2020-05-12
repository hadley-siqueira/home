import java.util.Scanner;
public class Questão10 {
    public static void main(String[] args) {
        Scanner s;
        s = new Scanner(System.in);

        System.out.print("Digite o peso de peixes pescados: ");
        double p = s.nextDouble();

        double e = p - 50;

        System.out.printf("Excesso de peixes: %.2f\n", e);
        System.out.printf("Multa: R$%.2f reais\n", e * 4);
    }
}

        
