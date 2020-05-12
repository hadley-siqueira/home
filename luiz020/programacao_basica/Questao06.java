import java.util.Scanner;

public class Questao06 {
    public static void main(String[] args) {

        Scanner k;
        int n;
        double v;
        double x;
        k= new Scanner (System.in);
            
        System.out.print("Informe a area (em metros quadrados): ");
        n = k.nextInt();

        v = n * 1.5;
        x = v * 300;

        System.out.print("Quantidade de pontos de rede: " + v);
        System.out.println("Custo de implementação: " + x);

        }}
 















































