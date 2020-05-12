import java.util.Scanner;
public class Questao09 {
        public static void main(String[] args) {
            Scanner s; 
            int dinheiro;     
            int salgado;
            int calculo;

            s = new Scanner(System.in);
        
            System.out.println("programa o poupador");
            
            System.out.print("me informe o quanto de  dinheiro voce tem: ");
            dinheiro = s.nextInt();
            System.out.print("diga-me quanto custa um salgado: ");
            salgado = s.nextInt();
            calculo = dinheiro / salgado;
            System.out.println("o resto do seu dinheiro eh de: " + calculo);

    }
}
