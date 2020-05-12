import java.util.Scanner;

public class Questao09 {

    public static void main(String [] args) {

        double din;
        double valor;
        double sal;

        Scanner k;
        k = new Scanner (System.in);

        System.out.print(" CANTINA IFRN ");

        System.out.println("Informe a quantidade de dinheiro: ");
        din = k.nextDouble();

        System.out.println("Informe o valor atual: ");
        valor = k.nextDouble();
    
        sal = din/valor;

        System.out.println("A quantidade de salgados eh: " + (sal));

        }} 
