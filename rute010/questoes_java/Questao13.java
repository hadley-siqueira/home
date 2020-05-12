import java.util.Scanner;

public class Questao13 {
    public static void main(String[] args){
        int x1;
        int y1;
        int x2;
        int y2;
        int sub1;
        int sub2;
        int q1;
        int q2;
        int soma;
        Scanner s;

        s = new Scanner(System.in);
        System.out.println("**Distancia de Pontos**");

        System.out.print("Informe o ponto x1:");
        x1 = s.nextInt();

        System.out.print("Informe o ponto y1:");
        y1 = s.nextInt();

        System.out.print("Informe o ponto x2:");
        x2 = s.nextInt();

        System.out.print("Informe o ponto y2:");
        y2 = s.nextInt();

        sub1 = x2 - x1;
        sub2 = y2 - y1;

        q1 = sub1 * sub1;
        q2 = sub2 * sub2;

        soma = q1 + q2;

        System.out.println( );
        System.out.println("A distancia euclidiana entre os pontos eh:" + soma);
    }
}
