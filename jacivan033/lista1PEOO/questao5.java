import java.util.Scanner;
    public class questao5 {
        public static void main (String[] args) {
        
        Scanner s;
        s = new Scanner(System.in);

        System.out.print("digite o valor da conta: ");
        float valor = s.nextFloat();
        float subtotal = valor * 10/100;
        float total = valor + subtotal;

        System.out.println("Subtotal: " + valor);
        System.out.println("A comissão do garçom: " + subtotal);
        System.out.println("total: " + total);
    }
}
       

        
        

          
