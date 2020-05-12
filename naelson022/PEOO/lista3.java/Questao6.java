import java.util.Scanner;
public class Questao6 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n,c = 0,d = 0, c_final,f;
        System.out.print(" digite um nummero: ");
        n = s.nextInt();
        while(n != 0){
            if (n > 15 && n % 2 != 0){
                c = c + 1;
            }
            d = d + 1;
            System.out.print(" digiten outri numero: ");
            n = s.nextInt();
        }
        c_final = d / 100;
        f = c / c_final;
        System.out.print(f);
         
    }
}   
