import java.util.Scanner;
public class Questão16 {
    public static void main (String[] args){

        Scanner s;
        int f;
        int T;
        s = new Scanner(System.in);

        System.out.println(" >> Gastos para marcar os frangos - FRANGOTECH << ");
        System.out.print(" Digite a quantidade de frangos na granja: ");
        f = s.nextInt();
        T = f*11;
        System.out.println(" O gasto para marcar todos os frangos é " + T + "reais");

    }
}
