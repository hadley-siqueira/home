import java.util.Scanner;
    public class Questao9 {
        public static void main(String[] args) {
                Scanner s;
                double a;
                double b;
                double c;
                double delta;
                double delta2;
                double raizes1;
                double raizes2;

                s = new Scanner(System.in);

               System.out.print("Informe o numero para 'a': ");
                a = s.nextDouble();
                System.out.print("Informe o numero para 'b': ");
                b = s.nextDouble();
                System.out.print("Informe o numero para 'c': ");
                c = s.nextDouble();

                delta = Math.pow(b , 2) - 4 * a * c; 
                delta2 = delta;

                raizes1 = - b + Math.sqrt(delta2) / 2 * a;
                raizes2 = - b - Math.sqrt(delta2) / 2 * a;
            

                if (delta2 > 0) {
                    System.out.println("As raizes sao: " + raizes1 + " e " + raizes2); 
                    if (delta2 == 0) 
                       System.out.println("As raizes sao: " + raizes1 +  " e " + raizes2);
       
              } else{
                    System.out.println("Ausencia de raizes");
        }
    }
}
