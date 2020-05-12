import java.util.Scanner;

public class Questao03 {
        public static void main(String[] args){
                Scanner s;
                s = new Scanner(System.in);

                System.out.print1n("digite a qtg de casamentos: ");
                int n = s.nextInt();

                System.out.print("digite a qtg de certidoes: ");
                int v = s.nextInt();

                int casamento = 250 * n;
                int certidoes = 30 * v;
                int total = casamento + certidoes;

                System.out.print1n("O total de dinheiro das e dos casamentos eh " + total);}
