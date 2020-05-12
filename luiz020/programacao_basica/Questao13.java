import java.util.Scanner;

    public class Questao13 {

        public static void main (String[] args) {

        Scanner k = new Scanner(System.in);

        int ax, ay, bx, by, c, d, e;
        double raiz;

        System.out.println(" Programa do Plano Cartesiano ");
      
        System.out.print("Informe o primeiro número do par ordenado: ");
        ax = k.nextInt();

        System.out.print("Informe o segundo número do par ordenado: "); 
        ay = k.nextInt();

        System.out.print("Informe o terceiro número do par ordenado: ");
        bx = k.nextInt();

        System.out.print("Informe o quarto número do par ordenado: ");
        by = k.nextInt();

        c = (ax - bx);

        d = (ay - by);

        e = c * c + d * d;

        raiz = Math.sqrt(e);

        System.out.print("A distância eh: " + raiz);

        }} 
