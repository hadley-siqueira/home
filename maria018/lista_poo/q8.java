import java.util.Scanner;

public class q8 {
    public static void main (String[] args) {

        Scanner s;
        float horas;
        float dias;
        float resto_h;
        s = new Scanner(System.in);

        System.out.print("Digite a hora:");
        horas = s.nextFloat();
        dias = horas/24;
        resto_h = (horas%24);
        System.out.println(horas + " horas = " + dias + " dias" + " e " + resto_h + " horas");
    }
}
