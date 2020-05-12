import java.util.Scanner;
public class Q2{
    public static void main(String[]args){
        Scanner s;
        s = new Scanner(System.in);

        System.out.print("Informe quantos números deseja armazenar: ");
        int qn = s.nextInt();

        double[] n = new double[qn];

        for(int i = 0 ; i < qn ; i++){
            System.out.print("Informe o número: ");
            n[i] = s.nextDouble();
        }

        for(int i = qn - 1 ; i >= 0 ; i--){
            System.out.println(n[i]);
        }
    }
}
