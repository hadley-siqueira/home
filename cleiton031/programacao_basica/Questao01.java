import java.util.Scanner;

public class Questao01 {
    public static void main(String[] args) {
        double n;
        double v1;
        double v2;
        double v3;
        double v4;
        double v5;
        double v6;
        double v7;
        double v8;
        double v9;
        double v10;
        Scanner s;
        double numero;
        
        s = new Scanner(System.in);
        
        System.out.println("questao01");
        System.out.print("Digite um numero:");
        n = s.nextDouble();
        
        v1 = n * 1; 
        v2 = n * 2;
        v3 = n * 3;
        v4 = n * 4;
        v5 = n * 5;
        v6 = n * 6;
        v7 = n * 7;
        v8 = n * 8;
        v9 = n * 9;
        v10 = n * 10;
    
        System.out.println((n) + " x 1 = " + (v1));
        System.out.println((n) + " x 2 = " + (v2));
        System.out.println((n) + " x 3 = " + (v3));
        System.out.println((n) + " x 4 = " + (v4));
        System.out.println((n) + " x 5 = " + (v5));
        System.out.println((n) + " x 6 = " + (v6));
        System.out.println((n) + " x 7 = " + (v7));
        System.out.println((n) + " x 8 = " + (v8));
        System.out.println((n) + " x 9 = " + (v9));
        System.out.println((n) + " x 10 = " + (v10));
 

      }   
}

