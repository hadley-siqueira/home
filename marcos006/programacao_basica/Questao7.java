import java.util.Scanner;

  public class Questao7 {
        public static void main(String[] args) {
            Scanner s;
            s = new Scanner(System.in);

        System.out.println("Digite a incognita: ");
        int n = s.nextInt();

       int rf = n * n * n + 3 * n * n - 2 * n + 7;
        
        System.out.println("O resultado final será de " + rf);
    }
}
