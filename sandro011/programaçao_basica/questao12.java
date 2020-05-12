import java.util.Scanner;

public class questao12 {
    public static void main (String [] args) {
        Scanner s = new Scanner(System.in);
        int cp;
        int cm;
        int cg;
        int vp;
        int vm;
        int vg;
        int vt;

        System.out.print("informe a quantidade de camisas pequenas: ");
        cp = s.nextInt();
        
        System.out.print("informe a quantidade de camisas medias: ");
        cm = s.nextInt();

        System.out.print("informe a quantidade de camisas grandes: ");
        cg = s.nextInt();

        vp = cp * 10;
        vm = cm * 12;
        vg = cg * 15;
        vt = vp + vm + vg;
        System.out.println("a media total eh: " + vt );
    }
} 
