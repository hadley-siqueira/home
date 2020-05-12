import java.util.Scanner;

public class Questao08{
    public static void main(String[] args) {
        Scanner s;
        s = new Scanner(System.in);

        System.out.print("Dê o lado de um cubo: ");
        int lado_do_cubo = s.nextInt();

        System.out.print("Informe o comprimento do paralelepipedo: ");
        int compr_Paralelepipedo = s.nextInt();
     
        System.out.print("Informe a profundidade do paralelepipedo: ");
        int prof_paralelepipedo = s.nextInt();

        System.out.print("Informe a altura do paralelepipedo: ");
        int alt_paralelepipedo = s.nextInt();

        System.out.print("Informe a base do cone: ");
        int base_de_um_cone = s.nextInt();

        System.out.print("Informe a altura de um cone: ");
        int alt_cone = s.nextInt();

        System.out.print("Informe o raio da esfera: ");
        int raio_da_esfera = s.nextInt();
 
        int vcubo = lado_do_cubo * lado_do_cubo * lado_do_cubo;
    
        int vparalelepipedo = alt_paralelepipedo * compr_Paralelepipedo * prof_paralelepipedo;

        int vbcone  = (int) (3.14 * (double) base_de_um_cone * (double) base_de_um_cone * ((double) alt_cone)/3.0);
  
        int resfera = (int) ((4.0 * 3.14 * (double) raio_da_esfera * (double) raio_da_esfera * ((double) raio_da_esfera)/3.0));

        System.out.println("O volume do cubo eh: " + vcubo);

        System.out.println("O volume do paralelepipedo eh: " + vparalelepipedo);

        System.out.println("O volume do cubo: " + vbcone);
 
        System.out.println("O raio da esfera: " + resfera);
   }

}
