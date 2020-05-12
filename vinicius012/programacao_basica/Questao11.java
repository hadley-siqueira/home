import java.util.Scanner;

public class Questao11{
    public static void main(String[] args) {
    Scanner s;
    s = new Scanner(System.in);

    System.out.println("Digite o valor da primeira nota: ");
    double a = s.nextDouble();
    System.out.println("Digite o valor da segunda nota: ");
    double b = s.nextDouble();
    System.out.println("Digite o valor da terceira nota: ");
    double c = s.nextDouble();
    System.out.println("Digite o valor da quarta nota: ");
    double d = s.nextDouble();

    System.out.println("Digite o valor do primeiro peso: ");
    double e = s.nextDouble();
    System.out.println("Digite o valor do primeiro peso: ");
    double f = s.nextDouble();
    System.out.println("Digite o valor do primeiro peso: ");
    double g = s.nextDouble();
    System.out.println("Digite o valor do primeiro peso: ");
    double h = s.nextDouble();


    double x = a * e + b * f + c * g + d * h / e + f + g + h;

    System.out.println("a media e " + x);
    }
}
