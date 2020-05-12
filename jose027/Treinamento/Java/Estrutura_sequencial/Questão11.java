import java.util.Scanner;
public class Questão11 {
    public static void main(String[] args) {
        Scanner scan;
        scan = new Scanner(System.in);

        System.out.print("Digite o ganho horário: ");
        double g = scan.nextDouble();

        System.out.print("Digite a jornada horária: ");
        int j = scan.nextInt();

        double s = g * j * 20;

        double ir = s * 0.11;
        double inss = s * 0.08;
        double sindic = s * 0.05;

        System.out.printf("Salário bruto: R$%.2f reais\n", s);
        System.out.printf("Imposto de renda: R$%.2f reais\n", ir);
        System.out.printf("INSS: R$%.2f reais\n", inss);
        System.out.printf("Sindicato: R$%.2f\n", sindic);
        System.out.printf("Salário líquido: R$%.2f reais\n", (s - ir - inss - sindic));
    }
}
