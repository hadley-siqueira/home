import java.util.Scanner;
public class Questao5 {
    public static void main (String[] args) {
        double quantidadeS;
        double quantidadeC;
        double csT;
        double ccT;
        double total;
        double lucro;
        Scanner s;

        System.out.println("KR seguros, Avaliacao dos candidatos");
        
        s = new Scanner(System.in);
        System.out.println("Qtd de contratos simples: ");
        quantidadeS = s.nextDouble();
        
        
        System.out.println("Qtd de contratoscompletos: ");
        quantidadeC = s.nextDouble();

        csT = quantidadeS * 2300;
        ccT = quantidadeC * 3500;

        total = csT + ccT;
        lucro = total / 10;

        System.out.println("Lucro obtido: R$" + lucro);
    }
}
