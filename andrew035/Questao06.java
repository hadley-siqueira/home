import java.util.Scanner;

public class Questao06{
    public static void main(String[] args){
        Scanner s;
        s = new Scanner(System.in);

        System.out.print("Informe a area (em metros quadrados): ");
        int area = s.nextInt();
       
        int p = area/2 * 3;
        int c = p * 300;
    
        System.out.println("Quantidade de pontos de rede: " + p);
        System.out.println("Custo de implementação: " + c);}}
