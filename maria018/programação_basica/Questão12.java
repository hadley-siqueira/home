import java.util.Scanner;
public class Questão12 {
    public static void main (String[] args){

        Scanner s;
        int p;
        int m;
        int g; 
        int pv; 
        int mv;
        int gv;
        int soma;
        s = new Scanner(System.in);
        
        System.out.println(" >> Valor arrecardados com camisas <<");
        p = 10;
        m = 12;
        g = 15;

        System.out.print(" Digite a quantidade de camisas (P) vendidas: ");
        pv = s.nextInt();
        System.out.print(" Digite a quantidade de camisas (M) vendidas: ");
        mv = s.nextInt();
        System.out.print(" Digite a qauntidade de camisas (g) vendidas: ");
        gv = s.nextInt();
    
        soma = (p*pv) + (m*mv) + (g*gv);
        
        System.out.println(" O dinheiro arrecadado com as camisas é:" + soma);

   
        }
}


