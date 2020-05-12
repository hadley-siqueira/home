import java.util.Scanner;

public class Questao05 {
     public static void main(String[] args) {
     Scanner s = new Scanner(System.in);
     
     System.out.print("Quatidade de contratos simples: ");
     int x = s.nextInt();
     System.out.print("Quantidade de contratos completos: ");
     int y = s.nextInt();      
     
     float z = 2300;
     
     float a = 3500; 

     float de = x * z * 0.1f;
     
     float da = y * a * 0.1f;

     System.out.println(" Lucro obtido: $" + (de + da)); 
   }
}
