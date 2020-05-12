import java.util.Scanner;
public class Questão07 {
    public static void main(String[] args) {
        Scanner s;
        s = new Scanner(System.in);

        System.out.print("Digite o lado do quadrado: ");
        int l = s.nextInt();
        
        double area = Math.pow(l, 2);

        System.out.printf("Área do quadrado: %.0f\n", area); 
        System.out.printf("Dobro da área: %.0f\n", area * 2);
   }
}
