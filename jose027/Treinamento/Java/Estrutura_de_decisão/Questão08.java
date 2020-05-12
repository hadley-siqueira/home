import java.util.Scanner;
public class Questão08 {
    public static void main(String[] args) {
        Scanner s;
        s = new Scanner(System.in);

        System.out.print("Digite o nome do primeiro produto: ");
        String nome1 = s.next();
        System.out.print("Digite o preço do primeiro produto: R$");
        double p1 = s.nextDouble();
        
        System.out.print("Digite o nome do segundo produto: ");
        String nome2 = s.next();
        System.out.print("Digite o preço do segundo produto: R$");
        double p2 = s.nextDouble();
        
        System.out.print("Digite o nome do terceiro produto: ");
        String nome3 = s.next();
        System.out.print("Digite o preço do terceiro produto: R$");
        double p3 = s.nextDouble();
 
        if (p1 < p2 && p1 < p3) {
            System.out.println("Produto mais barato: " + nome1);
        } else if (p2 < p1 && p2 < p3) {
            System.out.println("Produto mais barato: " + nome2);
        } else {
            System.out.println("Produto mais barato: " + nome3);
        }
    }
}
