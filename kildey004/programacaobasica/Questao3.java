import java.util.Scanner;
public class Questao3 {
    public static void main (String[] args) {
        int nc;
        int ncd ;
        int ctotal;
        int cdtotal;
        int total;
        Scanner s;

        System.out.println("**dinheiro recebido**");
        s = new Scanner(System.in);
        System.out.println("Digite a quantidade de casamentos: ");
        nc = s.nextInt();

        System.out.println("Digite a quantidade de certidoes: ");
        ncd = s.nextInt();

        ctotal = nc * 250;
        cdtotal = ncd * 30;

        total = ctotal + cdtotal;

        System.out.println("Total ganho em certidoes: R$" + cdtotal);
        System.out.println("Total ganho em casamentos: R$" + ctotal);
        System.out.println("Ganho total: R$" + total);
    }
}
