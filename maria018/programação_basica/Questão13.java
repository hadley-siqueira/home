import java.util.Scanner;
public class Questão13 {
    public static void main (String[] args){
        Scanner s;
        float x0;
        float x1;
        float y0;
        float y1;
        float d;
        s = new Scanner(System.in);

        System.out.print(" Digite a coodernada X do primeiro ponto: ");
        x0 = s.nextFloat();
        System.out.print(" Digite a coodernada Y do primerio ponto: ");
        y0 = s.nextFloat();
        System.out.print(" Digite a coordenada X do segundo ponto: ");
        x1 = s.nextFloat();
        System.out.print(" Digite a coordenada Y do segundo ponto: ");
        y1 = s.nextFloat();


        double soma = Math.sqrt((x1 - x0) * (x1 - x0) + (y1 - y0) * (y1 - y0)); 
        System.out.println(soma);

    }
}
