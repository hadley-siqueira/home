import java.util.Scanner;
public class Q3{
    public static void main(String[]args){
        Scanner s;
        s = new Scanner(System.in);

        System.out.print("Informe o tamanho do vetor: ");
        int tamanho = s.nextInt();

        double[] n = new double[tamanho];

        for(int i = 0 ; i < tamanho ; i++){
            System.out.print("Informe o número: ");
            n[i] = s.nextDouble();
        }
        for(int i = 0 ; i < tamanho ; i++){
            if(n[i] % 2 != 0){
                System.out.println(n[i]);
            }
        }
    }
}
