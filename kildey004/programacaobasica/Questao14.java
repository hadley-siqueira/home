import java.util.Scanner;

public class Questao14 {
    public static void main(String[] args) {
        int dia;
        int ano;
        int mes;
        int dias;
        Scanner s;

        System.out.println("**Calendario de acidentes**");

        s = new Scanner(System.in);
        System.out.println("Digite a quantidade de dias sem acidentes:");
        dia = s.nextInt();

        ano = dia / 360;
        mes = (dia - ano * 360) / 30;
        dias = dia - ano * 360 - mes * 30;

        System.out.println("tempo sem acidentes: " + ano + " anos, " + mes + " meses, " + dias + "dias.");
    }
}
