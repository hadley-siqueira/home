import java.util.Scanner;
public class Questao06 {
    public static void main(String[] args) {
        Scanner s;
        int v;
        int n;
        int c;
        s = new Scanner(System.in);
        System.out.print("informe a area em metros quadrados: ");
        v = s.nextInt();
        n = 3 * (v/2);
        c = 300 * n;
        System.out.print("quantidade de pontos de rede: " + n );
        System.out.print("custo de implementaçao: " + c );
        
    }
} 
        
      
