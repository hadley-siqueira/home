import java.util.Scanner;
public class Questao4 {
    public static void main(String[] args) {
        Scanner s = new  Scanner(System.in);
        int numero;
        System.out.print("digite um numero: ");
        numero = s.nextInt();
        while(numero < 1 || numero > 30) {
            System.out.print("Dia invalido. Tente novamente");
            System.out.print("digite outro numero: ");
            numero = s.nextInt();
        }
    }
}

