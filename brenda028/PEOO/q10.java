import java.util.Scanner;
public class q10 {
    public static void main (String[] args){
        Scanner s;
        int m;
        int d;
        int h;
        float a;
        s = new Scanner (System.in);

        System.out.print("DIGITE OS MINUTOS:");
        m = s.nextInt();

        d = (m/9257);
        h = (m/60);
        a = (m%60);

        System.out.println(m + " = " + d + " dias  //  " + h  + " horas // " + a + "minutos");

    }
}

