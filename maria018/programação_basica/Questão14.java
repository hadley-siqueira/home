import java.util.Scanner;
public class Questão14 {
        public static void main (String[] args){
    
        Scanner s;
        int dias;
        int dias_copia;
        int anos;
        int meses;
        s = new Scanner(System.in);

        System.out.println(" >> Tempo de trabalho sem acidente << ");
        System.out.print(" Digite o tempo sem acidentes (em dias)");
        dias = s.nextInt();
        
        dias_copia = dias;
        anos = dias / 365;
        dias = dias - (anos*365);
        meses = dias / 30;
        dias = dias - (meses*30);

        System.out.println((dias_copia) + " dias = " + anos + "anos, " + meses + "meses é " + dias + "dias");

    }
}
