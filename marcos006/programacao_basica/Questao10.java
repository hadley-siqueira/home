import java.util.Scanner;
    
    public class Questao10 {
        public static void main(String[] args) {
            Scanner s;
            s = new Scanner(System.in);
    
        System.out.println("Digite a hora que você quer: ");
        int h = s.nextInt();
        int t = h * 3600;

        System.out.println("Existem " + t + " segundos" + " em " + h + " horas");

    }
}
