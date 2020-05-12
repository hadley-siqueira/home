import java.util.Scanner;
public class Questao09 {
        public static void main(String[] args) {
            Scanner s;
            int dinheiro;
            int salgado;
            int calculo;

            s = new Scanner(System.in);
    
            System.out.println("Programa o poupador");
            
            System.out.print("Me informe o quanto de dinheiro voce tem: ");
            dinheiro = s.nextInt();
            System.out.print("Diga-me quanto custa um salgado: ");
            salgado = s.nextInt();
            calculo = dinheiro / salgado;
            System.out.println("O resto do seu dinheiro eh de: " + calculo);
    }
}            
