import java.util.Scanner; 
public class grau2 {
    public static void main (String[] args) {

        Scanner s;
        double a;
        double b;
        double c;
        double delta;
        double x1;
        double x2;
        s = new Scanner(System.in);

        System.out.println("--FORMULA DE BHASKARA--");

        System.out.print("Digite o valor de 'A':");
        a = s.nextDouble();
    
        System.out.print("Digite o valor de 'B':");
        b = s.nextDouble();
    
        System.out.print("Digite o valor de 'C':");
        c = s.nextDouble();

        delta = ((Math.pow(b, 2)) -( 4 * a * c));

        if (delta < 0) {
            System.out.println("O delta eh negativo: " + delta);
        } else {

            x1 = ((-b + (Math.sqrt(delta))) / (2 * a));
            x2 = ((-b - (Math.sqrt(delta))) / (2 * a));

            System.out.println("A primeira raiz: " + x1);
            System.out.println("A segunda raiz : " + x2);
       }   
   }

}
