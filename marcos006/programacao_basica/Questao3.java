import java.util.Scanner;

public class Questao3 {
    public static void main(String[] args) {
        Scanner s;
        s = new Scanner(System.in);

        System.out.println("Digite a quantidade de casamentos: ");
        int c = s.nextInt();

        System.out.println("Digite a quantidade de certidoes: ");
        int t = s.nextInt();

       int  a = c * 250;
       int  p = t * 30;
       int  tt = a + p;

        System.out.println("O total é de: " + tt);
    }
}

        
