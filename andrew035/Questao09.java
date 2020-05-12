import java.util.Scanner;

public class Questao09{
    public static void main(String[] args){
        Scanner s;
        s = new Scanner(System.in);

        System.out.print("Informe quanto dinheiro você tem para gastar: ");
        double dinheiro = s.nextInt();

        System.out.print("Informe quanto o salgado custa agora: ");
        double depois = s.nextDouble();

        double pode_comprar = dinheiro/depois;

        System.out.println("Quantos salgados ele pode comprar com o dinheiro em mãos: " + pode_comprar);
    }
}
