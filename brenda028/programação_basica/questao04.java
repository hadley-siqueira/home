import java.util.Scanner;

public class questao04 {
    public static void main(String[] args){
        Scanner s;
        int p;
        int repeti;
        int paragrafo;

        s = new Scanner (System.in);
        System.out.println("**Programa Gerador de Parágrafo**");
        System.out.print("Informe a palavra :");
        p = s.nextInt();
        System.out.print("Informe a quantidade de repetções :");
        repeti = s.nextInt();

        paragrafo = p * repeti;

        System.out.println("O resultado eh");


    }
}

