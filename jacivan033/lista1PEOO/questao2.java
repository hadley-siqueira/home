import java.util.Scanner;
    public class questao2 {
        public static void main (String[] args) {
            int horas;
            double dias;
            Scanner s;
            
            s = new Scanner (System.in);
            
            System.out.print("digite as horas: ");
            horas = s.nextInt();
            
            dias = horas / 24.0;
            System.out.println("o total de dias é: " + dias);
    }
}
