import java.util.Scanner;

    public class Questao14 {
        public static void main(String[] args) {
            Scanner s;
            s = new Scanner(System.in);

        System.out.println("**Calculador de tempo de trabalho sem acidentes**");
        System.out.println("Informe o tempo em dias de trabalho sem acidentes: ");
        int d = s.nextInt();

        int a = d / 360;
        int m = (d - a *360) / 30;
        int dd = d - (a * 360) - m * 30;

        System.out.println("O tempo sem acidentes é " + a + " anos " + m + " mêses " + dd + " dias");

    }
}

