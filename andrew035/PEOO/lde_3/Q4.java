import java.util.Scanner;
public class Q4{
    public static void main(String[]args){
        Scanner s;
        s = new Scanner(System.in);
        double[] V1 = new double[4];
        double[] V2 = new double[4];
        double[] V3 = new double[4];

        for(int i = 0 ; i < 4 ; i++){
            System.out.print("Informe o número: ");
            V1[i] = s.nextDouble();
        }
        for(int i = 0 ; i < 4 ; i++){
            System.out.print("Informe o número: ");
            V2[i] = s.nextDouble();
        }
        for(int i = 0 ; i < 4 ; i++){
            V3[i] = V1[i] + V2[i];

            System.out.println(V3[i]);
        }
    }
}
