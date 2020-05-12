import java.util.Scanner;
public class q4 {
    public static void main (String[] args) {

        Scanner s;
        double a,b,c;
        s = new Scanner(System.in);

        System.out.print("Digite 'a':");
        a = s.nextDouble();
        System.out.print("Digite 'b':");
        b = s.nextDouble();
        System.out.print("Digite 'c':");
        c = s.nextDouble();

        if (((c>a) && (c<b)) || ((c<a) && (c>b))) {
            System.out.println("O numero está no intervalo fechado entre 'a' e 'b'");
        
        }

        else { 
            System.out.println("O numero não está no intervalo fechado entre 'a'e 'b'");
        }
    }
}     
