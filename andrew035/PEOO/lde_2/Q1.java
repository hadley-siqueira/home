import java.util.Scanner;
public class Q1{
    public static void main(String [] args){
        Scanner s;
        s = new Scanner(System.in);
        
        double[] n = new double[10];
        double media, soma = 0;
        int  cont = 0;
        for (int i = 0 ; i < 10 ; i++){
            System.out.print("Informe o número: ");
            n[i] = s.nextDouble();
        }
        for (int i = 0 ; i < 10 ; i++){
            soma += n[i];
        }
        media = soma / 10;

        for (int i = 0; i < 10; i++){
            if(n[i] > media)
                cont++;
        }

        System.out.println("Numeros acima da média: " + cont);
    }
}
