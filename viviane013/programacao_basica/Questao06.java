import java.util.Scanner;

public class Questao06 {
    public static void main(String[] args) {
        int quadrado;
        int pontos;
        int total;
        
        Scanner s ;

        s= new Scanner(System.in);

        
       

        System.out.println("numero de redes");
        
        System.out.print("informe a area (em metros): ");
        quadrado = s.nextInt();
        pontos = quadrado / 2 * 3;
        total = pontos * 300;
        
        System.out.println("Quantidade de pontos: " + pontos);

        System.out.println("Custo de implementacao: " + total);
    }
}
