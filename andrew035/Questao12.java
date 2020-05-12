import java.util.Scanner;

public class Questao12{
    public static void main(String[] args){
        Scanner s;
        s = new Scanner(System.in);

        System.out.print("Informe quantas camisas pequenas você quer: ");
        int p = s.nextInt();
        System.out.print("Informe quantas camisas médias você quer: ");
        int m = s.nextInt();
        System.out.print("Informe quantas camisas grandes vocÊ quer: ");
        int g = s.nextInt();

        int cp = p * 10;
        int cm = m * 12;
        int cg = g * 15;
        int total = cp + cm + cg;

        System.out.println("Valor arrecadado: " + total);
     
     }

}
