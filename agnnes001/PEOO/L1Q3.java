import java.util.Scanner;

public class L1Q3 {
    public static void main(String[] args) {
        Scanner s;
        double a,m,imc;

        s = new Scanner(System.in);
        System.out.print("Digite a sua altura (em m):");
        a = s.nextDouble();
        System.out.print("Digite a sua massa (em Kg):");
        m = s.nextDouble();

        imc = m/(a * a);

        System.out.println("O seu IMC é " + imc);
    }
}
