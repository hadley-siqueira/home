import java.util.Scanner;
   
public class Questao6 {
    public static void main(String[] args) {
        Scanner s;
        int np;
        int c;
        s = new Scanner(System.in);
    

        System.out.println("Informe a área em metros quadrados: ");
        int A = s.nextInt();

        np = A/2 * 3;
        c = np * 300;

        System.out.println("A quantidade de pontos da rede é: " + np);
        System.out.println("O custo de implementação é: " + c + "R$");
    }
}

