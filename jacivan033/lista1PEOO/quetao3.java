import java.util.Scanner;
public class quetao3 {
    public static void main (String[] args) {
        double peso;
        double altura;
        double IMC;

        Scanner leitor;
        leitor = new Scanner(System.in);

        System.out.println("digite seu peso: ");
        peso = leitor.nextDouble();

        System.out.println("digite sua altura em metros: ");
        altura = leitor.nextDouble();

        IMC = peso / Math.pow (altura, 2);

        System.out.println("seu IMC é: " + IMC);
    }
}        
