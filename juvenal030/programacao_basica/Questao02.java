import java.util.Scanner;

public class Questao02 {
    public static void main(String[] args) {
        Scanner s;
        int n1;
        int n2;
        int n3;
        int num;
        int nume;
        int numer;
        s = new Scanner(System.in); 
        
        System.out.println("programa gerador de quadrado,triplo e quartuplo");
        System.out.print("digite um numero para um quadrado: ");
        n1 = s.nextInt();
        num = n1 * n1; 
        System.out.println("o quadrado eh: " + num); 

        System.out.print("digite um numero para o triplo: ");
        n2 = s.nextInt();
        nume = n2 *  n2 * n2;
        System.out.println("o triplo eh: " + nume);
   
        System.out.print("digite um numero para o quartoplo: ");
        n3 = s.nextInt();
        numer = n3 * n3 * n3 * n3;
        System.out.println("o quartuplo eh: " + numer);
 
 }
}
