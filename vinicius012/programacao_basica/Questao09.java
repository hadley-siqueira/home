import java.util.Scanner;

public class Questao09 {
    public static void main(String[] args)  {
        Scanner s;
        s = new Scanner(System.in);

        System.out.println ("Digite a quantidade de dinheiro: ");
        double x = s.nextInt();

        System.out.println ("Digite o valor do salgado ");
        double y = s.nextInt();

        System.out.println ("Digite o valor do segundo salgado: ");
        double z = s.nextInt();
 
        double a = x / y;
        double b = x / z;

        System.out.println(" O primeiro valor do salgado voce pode comprar " + a);
        System.out.println(" O segundo valor voce pode comprar " + b);







    }
}
