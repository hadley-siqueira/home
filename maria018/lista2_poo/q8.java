import java.util.Scanner;
public class q8 {
    public static void main (String[] args) {
    
        Scanner s;
        int n1, n2, n3;
        s = new Scanner (System.in);

        System.out.print("Digite o primeiro numero: " );
        n1 = s.nextInt();
        
        System.out.print("Digite o segundo numero: ");
        n2 = s.nextInt();
    
        System.out.print("Digite o terceiro numero:");
        n3 = s.nextInt();
    
        if ((n1 < n2) && (n1 < n3)) {
            System.out.println("O menor eh o " + n1);
        }
        if ((n2 < n1) && (n2 < n3)) {
            System.out.println("O menor eh o " + n2);
        }   
        if ((n3 < n1) && (n3 < n2)) {
            System.out.println("O menor eh o " + n3); 

       }
    }
} 
