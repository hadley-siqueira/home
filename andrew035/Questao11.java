import java.util.Scanner;

public class Questao11{
    public static void main (String[] args) {
        Scanner s;
        s = new Scanner(System.in);

        System.out.print("Informe a nota do primeiro bimestre: ");
        double b1 = s.nextDouble();

        System.out.print("Informe a nota do segundo bimestre: ");
        double b2 = s.nextDouble();

        System.out.print("Informe a nota do terceiro bimestre: ");
        double b3 = s.nextDouble();
       
        System.out.print("Informe a quarta nota do bimestre: ");
        double b4 = s.nextDouble();

        double media1 = (b1 * 2);
        double media2 = (b2 * 2);
        double media3 = (b3 * 3);
        double media4 = (b4 * 3);
        double media_total = (media1 + media2 + media3 + media4)/10; 

        System.out.println("Média ponderada: " + media_total);

    }

}
       
