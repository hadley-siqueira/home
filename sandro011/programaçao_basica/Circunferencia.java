import java.util.Scanner;

public class Circunferencia {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);
            double circunferencia = 0;
            double diametro = 0;            

            System.out.println("Olá Programador! Tudo bem?");

            System.out.println("Por favor, digite o valor do raio: ");
            double raio = leitor.nextDouble();

            circunferencia = 2 * 3.14 * raio;

            diametro = raio * 2;

            System.out.println("O valor aproximado da Circunferência: " + circunferencia);
            System.out.println("O valor do diâmetro: " + diametro);

       }

}   
