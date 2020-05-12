import java.util.Scanner;
public class Questao03 {
        public static void main(String[] args) {
            Scanner s;
            int qtd_casamentos;
            int qtd_certidao;
            int preco_casamento;
            int preco_certidao;
            int total;

            s = new Scanner(System.in);

            System.out.println("Calculadora de casamentos e certidoes");
            
            System.out.print("informe a qtd de casamentos: ");
            qtd_casamentos = s.nextInt();
            preco_casamento = 250;

            System.out.print("informe a qtd de certidoes: ");
            qtd_certidao = s.nextInt();
            preco_certidao = 30;

            total = qtd_casamentos * preco_casamento + qtd_certidao * preco_certidao;
            System.out.println("o total eh " + total);
    }
}
