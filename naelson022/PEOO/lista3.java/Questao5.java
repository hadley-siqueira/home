import java.util.Scanner;
public class Questao5 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int numero, contagem = 0;
        System.out.print(" digite um numero: ");
        numero = s.nextInt();
        while(numero != 0) {
            if(numero % 3 == 0 || numero % 7 == 0) {
                contagem = contagem + 1;
            }   
                System.out.print("digite outro numero: ");
                numero = s.nextInt();
        }
        System.out.println("a quantidade de numeros que mitiplo de 3 0u 7 eh: " + contagem);
    }
}
