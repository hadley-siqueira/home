import java.util.Scanner;
    public class Questao05 {
        public static void main(String[] args) {

            Scanner s;
            s = new Scanner(System.in);

            System.out.print("calcula o valor da conta");
            float a = s.nextFloat();
            float st = a * 10/100;
            float total = a + st; 

            System.out.println("subtotal:" + a);
            System.out.println("informe a comissão do garçom:" + st);
            System.out.println("total:" + total);

    }
}
