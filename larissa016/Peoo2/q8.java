import java.util.Scanner;
    public class q8 {
        public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a, b, c;

        System.out.print("digte 'A': ");
        a = s.nextInt();
        System.out.print("digte 'B'; ");
        b = s.nextInt();
        System.out.print("digite 'C': ");
        c = s.nextInt();

        if (( b > a) & a  < c) {
        System.out.println("o menor numero é o 'a'!");
        }
        else if((a > b) & b < c) {
        System.out.println("o menor numero é o 'b'!");
        }
        else if((a > c) & c < b) {
        System.out.println("o menor numero é o 'c'!");
        }
    }
}
