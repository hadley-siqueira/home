import java.util.Scanner;
public class Questão01 {
    public static void main(String[] args) {
        Scanner s;
        s = new Scanner(System.in);

        System.out.print("Digite a nota: ");
        double nota = s.nextDouble();

        while(nota < 0 || nota > 10) {
            System.out.println("Nota inválida, digite novamente");
            System.out.print("Digite a nota: ");
            nota = s.nextDouble();
        }

        System.out.println("Nota digitada: " + nota);
    }
}
   
