import java.util.Scanner;
public class Questão08 {
    public static void main(String[] args) {
        Scanner s;
        s = new Scanner(System.in);

        System.out.print("Digite o seu ganho horário: R$" );
        double g = s.nextDouble();

        System.out.print("Digite a jornada diária: ");
        int h = s.nextInt();

        System.out.println("Salário mensal: R$" + (g * h * 20) + " reais");
    }
}
