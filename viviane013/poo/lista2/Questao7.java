import java.util.Scanner;
   public class Questao7 {
        public static void main(String[] args) {
                Scanner s;
                double quantia;
                double calc;
                double c1;
                double c2;
                double c3;

                s = new Scanner(System.in);

                System.out.print("Informe a quantia: ");
                quantia = s.nextDouble();

                calc = quantia * 365;
                c1 = (4 / 100);
                c2 = (4.5 / 100);
                c3 = (5 / 100);
                if( quantia < 1000) {
                       System.out.println("O valor depositado em um ano é de: " + calc + c1 + " R$ ");

                    if(quantia >= 1000 && quantia < 5000) 
                       System.out.println("O valor depositado em um ano é de: " + calc + c2 + " R$ ");
               }else{
                        System.out.println("O valor depositado em um ano é de: " + calc + c3 + " R$ ");
        }
    }
}
                        
