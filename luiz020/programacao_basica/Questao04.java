import java.util.Scanner;

public class Questao04 {

        public static void main(String[] args) {
                // TODO Auto-generated method stub

int palavra,repetir,resultado;   

Scanner leitor= new Scanner (System.in);

        System.out.println("***********************************");
        System.out.println("** Programa Gerador de Parágrafo **");
        System.out.println("***********************************");

        System.out.print("Informe a palavra: ");
        palavra =leitor.nextstr();

        System.out.println("Informe a quantidade de repeticoes: ");
        repetir =leitor.nextInt();

        resultado=palavra*repetir;

        System.out.println("Resultado: "+resultado);

        }}


        
