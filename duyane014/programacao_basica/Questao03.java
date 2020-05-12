import java.util.Scanner;
public class Questao03 { 
        public static void main(String[] args) { 
            Scanner s; 
            int qtd_casamentos;
            int qtd_certidoes;
            int total;
            int preco_casamento;
            int preco_certidoes;
    
            s = new Scanner(System.in); 
            
            System.out.println("calculadora de casamento e certidoes");
       
            System.out.print("informe a qtd de casamentos: ");
            qtd_casamentos = s.nextInt();
            preco_casamento = 250;

            System.out.print("informe a qtd de certidoes: ");
            qtd_certidoes = s.nextInt();
            preco_certidoes = 30;
            
            total = qtd_casamentos * preco_casamento + qtd_certidoes * preco_certidoes;
            System.out.println("o total eh " + total);
    }
}
