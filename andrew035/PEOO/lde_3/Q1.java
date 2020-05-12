import java.util.Scanner;
public class Q1{
    public static void main(String[]args){
        Scanner s;
        s = new Scanner(System.in);
        double[] n = new double[10];
        int cont = 0, soma = 0;

        for(int i = 0 ; i < 10 ; i++){
            System.out.print("Informe o número: ");
            n[i] = s.nextInt();
        }
        for(int i = 0 ; i < 10 ; i++){
            soma += n[i];
        }
        double media = soma / 10;

        for(int i = 0 ; i < 10 ; i++){
            if(n[i] > media){
                cont++;
            }
        }
        System.out.println("Números acima da média: " + cont);
    }
}

