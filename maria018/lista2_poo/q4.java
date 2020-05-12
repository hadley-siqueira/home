import java.util.Scanner;
public class q4 {
    public static void main (String[] args) {

        Scanner s;
        double a, b, c;
        s = new Scanner(System.in);
        
        System.out.print("Digite o valor de 'A': ");
        a = s.nextDouble();
        System.out.print("Digite o valor de 'B': ");
        b = s.nextDouble();
        System.out.print("Digite o valor de 'C': ");
        c = s.nextDouble();

        if  (((c>a) && (c<b)) || ((c<a) && (c>b))) {
            System.out.println("O numero esta no intervalo fechado entre 'A' e 'B'");
        }
        else {
            System.out.println("O numero nao esta no intervalo de 'A' e 'B'");
        }
    }
}
        
    
