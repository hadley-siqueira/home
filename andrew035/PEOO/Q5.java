import java.util.Scanner;

public class Q5{
    public static void main(String[] args){
        Scanner s;
        s = new Scanner(System.in);

        System.out.print("Valor da conta: ");
        float n = s.nextFloat();

        float cdg = n*10/100;

        float total = n + cdg;
        
        System.out.println("Subtotal: " + n);
        System.out.println("Comissão do Garçom: " + cdg);
        System.out.println("Total: " + total);

        }
    }
        
        
