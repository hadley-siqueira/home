import java.util.Scanner;
public class Questão11 { 
    public static void main (String[] args) {

        Scanner s;
        int p1;
        int p2;
        int p3;
        int p4;
        float n1;
        float n2;
        float n3;
        float n4;
        float ma1;
        float ma2;
        float ma3;
        float ma4;
        float soma;
        float divisor;
        float MEDIA;
        s  = new Scanner(System.in);

        System.out.println(" >> Média ponderada do ano letivo <<");
        System.out.print(" Digite o peso do 1° bimestre: ");
        p1 = s.nextInt();
        System.out.print(" Digite o peso do 2° bimestre: ");
        p2 = s.nextInt();
        System.out.print(" Digite o peso do 3° bimestre: ");
        p3 = s.nextInt();
        System.out.print(" Digite o peso do 4/ bimestre : ");
        p4 = s.nextInt();
        System.out.println(" ---------------------------------");
        System.out.print(" Digite a nota do 1° bimestre: ");
        n1 = s.nextFloat();
        System.out.print(" Digite a nota do 2° bimestre: ");
        n2 = s.nextFloat();
        System.out.print(" Digite a nota do 3° bimestre: ");
        n3 = s.nextFloat();
        System.out.print(" Digite a nota do 4° bimestre: ");
        n4 = s.nextFloat();

        ma1 = p1 * n1;
        ma2 = p2 * n2;
        ma3 = p3 * n3;
        ma4 = p4 * n4;
    
        soma = ma1 + ma2 + ma3 + ma4;
        divisor = p1 + p2 + p3 + p4;
        MEDIA = soma / divisor;
        System.out.println(" A média ponderada é: " + MEDIA);

        }
}
