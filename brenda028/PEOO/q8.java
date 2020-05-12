import java.util.Scanner;
public class q8 {
    public static void main (String[] args) {

        Scanner s;
        double horas;
        double dias;
        double horas e dias;
        s = new Scanner(System.in);

        System.out.print("DIGITE A HORA:");
        horas = s.nextFloat();
        dias = horas/24;
        horas e dias = (horas%24);
        System.out.println(horas +  " horas = " + dias + " dias " + " e " + horas e dias +  " horas "); 

    } 
}
