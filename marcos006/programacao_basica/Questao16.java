import java.util.Scanner;

    public class Questao16 {
        public static void main(String[] args) {
            Scanner s;
            s = new Scanner(System.in);

        System.out.println("** Programa calculador do gasto total de uma granja para marcar seus frangos **");
        System.out.println("Informe a quantidade de frangos em sua granja: ");
        int fr = s.nextInt();
        
        int ac = fr * 4;
        double al = fr * 3.50;
        double qg = ac +al;
    
        System.out.println("A quantidade gasta será de " + qg + " R$");

    }
}
