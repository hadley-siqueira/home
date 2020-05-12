import java.util.Scanner;
public class q10 {
    public static void main (String[] args) {

        Scanner s;
        int m_i;
        int d;
        int h;
        float r_m;
        s = new Scanner(System.in);
    
        System.out.print("Digite os minutos:");
        m_i = s.nextInt();
        
        d = (m_i/1440);
        h = ((m_i % 1440) / 60);
        r_m = ((m_i% 1440) % 60);

        System.out.println(m_i + " = " + d + " dias  // " + h + " horas  // " + r_m + " minutos");
    }
}
