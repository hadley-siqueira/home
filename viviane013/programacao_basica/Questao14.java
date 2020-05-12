import java.util.Scanner;
public class Questao14 {
        public static void main(String[] args) {
            Scanner s;
            int dias;
            int anos;
            int dia;
            int meses;
            int d;

            s = new Scanner(System.in);

            System.out.println("Calculador de anos,meses e anos");
            
            System.out.print("Diga-me o numero: ");
            dias = s.nextInt();


            anos = dias / 360;
            dia = dias - (anos * 360);
            meses = dia / 30;
            d = dia - (meses * 30);

            System.out.println("Numero informado em dias: " + d);
            System.out.println("Numero informado em meses: " + meses);
            System.out.println("Numero informado em anos: " + anos);
    }
}
