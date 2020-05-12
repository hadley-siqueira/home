import java.util.Scanner;
public class Questao03 {
    public static void main(String[] args) {
        Scanner s;
        int n;
        int c;
        int z;
        int x;
        int j;
        s = new Scanner(System.in);
        System.out.print("quantidade de casamento: ");
        n =s.nextInt();
        System.out.print("quantidade de certidões: ");
        c = s.nextInt();
        x = n * 250;
        z = c * 30; 
        j = x + z;
        System.out.println("o total eh " + j);
    }
}
