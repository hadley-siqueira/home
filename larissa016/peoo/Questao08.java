import java.util.Scanner;
public class Questao08 {
    public static void main (String[] args) {

        Scanner s;
        float horas;
        float dias;
        float fh;
        s = new Scanner(System.in);

        System.out.print("Digite a hora:");
        horas = s.nextFloat();
        dias = horas/24;
        fh = (horas%24);
        System.out.println(horas + "horas = " + dias + " dias" + " e " + fh + "horas");
    }
}
