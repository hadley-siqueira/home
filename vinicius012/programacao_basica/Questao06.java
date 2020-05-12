import java.util.Scanner;
   
     public class Questao06 {
          public static void main(String[] args)  {
          Scanner s;
          s = new Scanner(System.in);
            double z;
            double y;

          System.out.print(" Imforme a area (em metros quadrados): ");
          double x = s.nextDouble();    
            
          z =  x * 1.5 * 300;
          y = x * 1.5;

          System.out.println("Quantidade de pontos de rede: " + y);
          System.out.println("custo de implementação: R$" + z);
 

   }
}
