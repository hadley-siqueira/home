import java.util.Scanner;
public class Q7{
    public static void main(String[] args){
        Scanner s;
        s = new Scanner(System.in);

        int anos = 0;
        double a = 7000.0;
        double b = 20000.0;

        double a1 = a * 3.5 / 100;
        double b1 = b * 1 / 100;

        while (a <= b){
            a = a + a1;
            b = b + b1;
            anos = anos + 1;
        }   
         System.out.println("Quantidade de anos: " + anos);
   }
    
}
