import java.util.Scanner; 

public class questao10 {
    public static void main (String [] args) {
        Scanner s = new Scanner(System.in);
        int x;
        int y;
        int z;

        System.out.print("informe a hora: ");
        x = s.nextInt();

        System.out.print("informe os minutos: ");
        y = s.nextInt();

        System.out.print("informe os segundos: ");
        z = s.nextInt();
        int hs = x * 60 * 60;
        int ms = y * 60;
        int ss = z;
        int ts = hs + ms + ss;
        System.out.println("total de segundos: " + ts);
    }
}


        
         

