import java.util.Scanner;

    public class Questao16 {

        public static void main(String[] args) {

        Scanner k = new Scanner(System.in);

        double a, b, c;

        System.out.println(" Programa de Identificação de frangos ");

        System.out.print("Informe a quantidade de frangos com chip: ");
        a = k.nextFloat();

        System.out.print("Informe a quantidade de frangos com anel de alimento: ");
        b = k.nextFloat();

        c = a * 4 + b * 3.50;

        System.out.println("O gasto total da identificão: R$ " + c);

        }} 
        




 
