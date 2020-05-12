import java.util.Scanner;

public class Questão08 {
    public static void main (String[] args) {

        Scanner s;
        float lado_cubo;
        float vc;
        float c;
        float l;
        float a;
        float vp;
        float ab;
        float ac;
        float vcone;
        float raio; 
        float ve;
        s = new Scanner(System.in);

        System.out.println(" Programa de volume das formas geometricas");
        System.out.println(" **  Volume de um cubo **");
        System.out.print("Digite o lado do cubo: ");
        lado_cubo = s.nextFloat();
        vc = lado_cubo * lado_cubo * lado_cubo;
        System.out.println(" ---------------------");
        System.out.println(" ** Volume de um paralelepipedo **");
        System.out.print(" Digite o comprimento: ");
        c = s.nextFloat();
        System.out.print(" Digite a largura: ");
        l = s.nextFloat();
        System.out.print(" Digite a altura: ");
        a = s.nextFloat();
        vp = c * l  * a;

        System.out.println(" -----------------");
        System.out.println(" ** Volume de um cone ** ");
        System.out.print(" Digite a area da base: ");
        ab = s.nextFloat();
        System.out.print(" Digite a altura: ");
        ac = s.nextFloat();
        vcone = (ab * ac) / 3;

        System.out.println(" ----------------------");
        System.out.println(" ** Volume de uma esfera ** ");
        System.out.print(" Digite o raio: ");
        raio = s.nextFloat();
        ve = (4 * 3.14f) * raio * raio * raio;

        System.out.println("-------------------------------");
        System.out.println(" Os volumes de cada um: ");
        System.out.println(" Do cubo é " + vc);
        System.out.println(" Do paralelepipedo é " + vp);
        System.out.println(" Do cone é " + vcone);
        System.out.println(" Da esfera é " + ve);

        }

}
        
        
        
        
