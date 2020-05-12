import java.util.Scanner;

public class Questao08 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("**programa gerador de volume de objetos**");

        System.out.print("informe o lado do cubo: ");
        double lado = s.nextDouble();
        double vcubo = lado * lado * lado;
        System.out.println("o volume do cubo eh: " + (vcubo));

        System.out.print("informe a altura do paralelepipedo: ");
        double altura = s.nextDouble();

        System.out.print("informe o comprimento do paralelepipedo: ");
        double comprimento = s.nextDouble();

        System.out.print("informe a profundidade do paralelepipedo: ");
        double profundidade = s.nextDouble();

        double vparalelepipedo = altura * comprimento * profundidade;
        System.out.println(" o volume do paralelepipedo eh:  " + (vparalelepipedo));

         System.out.print("informe a base do cone: ");
        double base = s.nextDouble(); 

        System.out.print("informe a altura do cone: ") ;
        double alturac = s.nextDouble();
        double vcone = base * altura / 3;
        System.out.println("informe o volume do cone: " + (vcone));

        System.out.print("informe o raio da esfera: ");
        double  raio = s.nextDouble();
        double  vesfera = 4.0 / 3.0 * 3.1415 * raio * raio * raio;
        System.out.println(" o volume do paralelepipedo eh: " + (vesfera));
    }
}
