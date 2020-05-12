import java.util.Scanner;

    public class Questao9 {
        public static void main(String[] args) {
            Scanner s;
            s = new Scanner(System.in);

        System.out.println("Informe quanto o salgado custava: ");
        float x = s.nextFloat(); 

        System.out.println("Informe quanto o salgado custa: ");
        float w = s.nextFloat();

        System.out.println("Quanto dinheiro você tem: ");
        float y = s.nextFloat();
        
        float m = y / x;
        float n = y / w;
        
        System.out.println("Com esse dinheiro você comprava " + m + " salgados.");
        System.out.println("Com esse dinheiro você compra " + n + " salgados.");

    }
}

                   
