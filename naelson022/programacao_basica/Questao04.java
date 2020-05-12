import java.util.Scanner;

public class Quesotao04{
    public static void main(String[] args){
        Scanner s;
        int n;
        int p;
        int s;
        
        s = new Scanner (System.in);
        System.out.println(" programa gerador de paragrafos ");
        System.out.print("informe a palavra :");
        n = s.next();
        System.out.print("informe a quantidade de repeticoes:");
        p = s.nextInt();
        s = n * p;


    }  
}
