import java.util.Scanner;

public class questao07 {
    public static void main (String[] args) {
        Scanner s;
        int x;
        double polinomiofinal;

        s = new Scanner (System.in);
        System.out.print("**Programa gerador de polinomios**");
        x = s.nextInt();
        polinomiofinal =(x*x*x+3*x*x-2*x+7);

        System.out.println("informe o numero do polinomio: ");
        System.out.println("o resultado eh: " + (polinomiofinal));
        }
}
          

        

        


