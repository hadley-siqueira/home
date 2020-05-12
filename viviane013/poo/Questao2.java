import java.util.Scanner;
    public class  Quest8 {
        public static void main(String[] args) {
                Scanner s;
                int dia;
                int hora;
                int restos;
 
                s = new Scanner(System.in);

                System.out.print("Digite o numero de horas  para que eu converta para dias: ");
                hora = s.nextInt();

                dia = (hora / 24);
                restos = (hora % 24);

                System.out.println( hora + " horas = "  + dia + " dias " + " e " + restos + " horas " );

                }
 } 
