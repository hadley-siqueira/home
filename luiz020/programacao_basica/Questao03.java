import java.util.Scanner;

public class Questao03 {

        public static void main(String[] args) {
                // TODO Auto-generated method stub

int casamento,certidao,total;

Scanner leitor= new Scanner (System.in);

System.out.println("Digite a quantidade de casamentos: ");
casamento =leitor.nextInt();

System.out.println("Digite a quantidade de certidoes: ");
certidao =leitor.nextInt();

casamento=casamento*250;
certidao=certidao*30;
total=casamento+certidao;
System.out.println("O custo total eh: "+total);

}}
