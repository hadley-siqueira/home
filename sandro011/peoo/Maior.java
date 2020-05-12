import java.util.Scanner;
public class Maior {
    
    public static void main(String[] args) {
    Scanner entrada = new Scanner(System.in);
    
    System.out.println("Digite o primeiro número: ");
    int numero1 = entrada.nextInt();

    System.out.println("Digite o segundo número: ");
    int numero2 = entrada.nextInt();

    maior(numero1, numero2);
}
    public static void  maior(int n1, int n2) {
    if(n1 > n2) {
        System.out.println("o primeiro é o maior");
    } else {
        System.out.println("O segundo é o maior");
}
    }
}
