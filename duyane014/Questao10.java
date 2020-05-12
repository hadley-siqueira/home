import java.util.Scanner;
public class Questao10 {
        public static void main (String[] args) {
            Scanner s;
            int hora;
            int minuto;
            int segundo;
            int convhora;
            int convminuto;
            int total;

            s = new Scanner(System.in);

            System.out.println("convertor de segundo");
    
            System.out.print("diga-me a hora: ");
            hora = s.nextInt(); 

            System.out.print("diga-me o minuti: ");
            minuto = s.nextInt();

            System.out.print("diga-me o segundo: ");
            segundo = s.nextInt();

            convhora = hora * 3600;
            convminuto = minuto * 60; 
            total = convhora + convminuto + segundo; 
            System.out.println("o total de segundos eh de: " + total);
    }
}
