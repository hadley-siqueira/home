import java.util.Scanner;
public class Questão17 {
    public static void main (String[] args){

        Scanner s;
        double qtd1c;
        double qtd5c;
        double qtd10c;
        double qtd25c;
        double qtd50c;
        double qtd1r;
        double total;
        s = new Scanner(System.in);

        System.out.println(" >> Poupança do cofrinho <<");

        System.out.print(" Qual a quantidade de moedas de 1 centavo: ");
        qtd1c = s.nextFloat();
        System.out.print(" Qual a quantidade de moedas de 5 centavos :");
        qtd5c = s.nextFloat();
        System.out.print(" Qual a quantidade de moedas de 10 centavos: ");
        qtd10c = s.nextFloat();
        System.out.print(" Qual a quantidade de moedas de 25 centavos:");
        qtd25c = s.nextFloat();
        System.out.print(" Qual a quantitdade de moedas de 50 centavos:");
        qtd50c = s.nextFloat();
        System.out.print(" Qual a quantidade de moedas de 1 reeal:");
        qtd1r = s.nextFloat();

        total = qtd1c * 0.01 + qtd5c * 0.05 + qtd10c * 0.10 + qtd25c * 0.25 + qtd50c * 0.5 + qtd1r;

        System.out.println(" A quantidade de reias do cofre é:" + total);

        }
}
