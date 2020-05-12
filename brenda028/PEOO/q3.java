import java.util.Scanner;

public class q3 {
     public static void main (String[] args) {
            
        Scanner s;
        double imc;
        double massa; 
        double altura;
        s = new Scanner(System.in);

        System.out.print("ALTURA EM METROS:");
        massa =  s.nextDouble();

        System.out.print("PESO EM QUILOS:");
        altura = s.nextDouble();

        imc = massa/(altura * altura);
        System.out.println("SEU IMC EH DE " + imc);

    }
}
