import java.util.Scanner;
public class Questao05 {
    public static void main(String[] args) {
        Scanner s;
        int simples;
        int completos;
        int n;
        int c;
        int total;
        s = new Scanner(System.in);
        System.out.print("quantidade de contratos simples: ");
        simples = s.nextInt();
        System.out.print("quantidade de contratos completos: ");
        completos = s.nextInt();
        n = simples * 230;
        c = completos * 350;
        total = n + c;
        System.out.println("o total eh " + total);
    } 
} 
