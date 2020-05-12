import java.util.Scanner;

public class Questão04 {
    public static void main(String[] args) {
        Scanner s;
        int p;
        int repeti;
        String paragrafo = "";
   
        s = new Scanner(System.in);

        System.out.println(" Programa Gerador de Parágrafo");

        System.out.print(" Informe a palavra: ");
        paragrafo = s.next();
        System.out.print(" Quantidade de repetições: ");
        repeti = s.nextInt();

        System.out.println(" O RESULTADO EH " + (paragrafo));
        for (int i = 0; i < repeti; ++i) {
            System.out.print(paragrafo + " ");           
        }


    }

}

