import java.util.Scanner;

public class Questao10 {
    public static void main(String[] args) {
     Scanner s;
     s = new Scanner(System.in);

     System.out.println("Digite quantas horas são: ");
     int x = s.nextInt();

     System.out.println("Digite quantos minutos são: ");
     int y = s.nextInt();

     System.out.println("digite quantos segundos são: ");
     int z = s.nextInt();

     int a = x * 3600;
     int b = y * 60;
     int c = z;

     int e = a + b + c;
    
     System.out.println(" A quantidade total de segundos e " + e);

   }
} 
