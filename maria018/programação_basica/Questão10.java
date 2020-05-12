import java.util.Scanner;
public class Questão10 {    
    public static void main (String[] args) {
        
        Scanner s;
        int H;
        int Min;
        int S;
        int SH;
        int SM;
        int SEGUNDOS; 
        s = new Scanner(System.in);

        System.out.println(" Horas em segundos: ");
        System.out.print(" Que horas são: ");
        H = s.nextInt();
        System.out.print(" Quantos minutos :");
        Min = s.nextInt();
        System.out.print(" Quantos segundos: ");
        S = s.nextInt();
        

        SH = (H * 60) * 60;
        SM = Min * 60;
        SEGUNDOS = SH + SM + S; 
        System.out.println(" O TOTAL EM SEGUNDOS É :" + SEGUNDOS);

        }
}
