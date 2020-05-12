import java.util.Scanner;

public class Questao05{
        public static void main(String[] args){
        Scanner s;
        s = new Scanner(System.in);

        System.out.println("**Seguradora XYZ**");
        System.out.println(">> Sistema de avaliação <<");

        System.out.print("Qtd de contratos simples: ");
        int n = s.nextInt();

        System.out.print("Qtd de contratos completos: ");
        int c = s.nextInt();

        int simples = n * 230;
        int completo = c * 350;
        int Lucro = simples + completo;

        System.out.println("Lucro obtido: " + Lucro);}}
 
