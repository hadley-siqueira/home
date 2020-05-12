import java.util.Scanner;

public class Questao10{
    public static void main(String[] args){
        Scanner s;
        s = new Scanner(System.in);

        System.out.print("Informe a hora: ");
        int h = s.nextInt();

        System.out.print("Informe os minutos: ");
        int m = s.nextInt();

        System.out.print("Informe os segundos: ");
        int seg = s.nextInt();

        int hora = h * 3600;
        int minuto = m * 60;
        int segundos = seg * 1;
        int total = hora + minuto + segundos;

        System.out.println("Valor total em segundos: " + total);

   }

}
