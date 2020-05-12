import java.util.Scanner;

public class Questao06 {
    public static void main(String[] args) { 
        int quadrado;
        int pontos;
        int total;
        
        Scanner s ;
    
        s= new Scanner(System.in);

        System.out.println("numero de rede"); 
        quadrado = s.nextInt();
        pontos = quadrado / 2 * 3;
        total = pontos * 300;

        System.out.println("quantidade de pontos: " + pontos);

        System.out.println("custo em implementacao: " + total);
    }
} 
