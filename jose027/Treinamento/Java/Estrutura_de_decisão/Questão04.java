import java.util.Scanner;
public class Questão04 {
    public static void main(String[] args) {
        Scanner s;
        s = new Scanner(System.in);

        System.out.print("Digite a primeira nota: ");
        double n1 = s.nextDouble();

        System.out.print("Digite a segunda nota: ");
        double n2 = s.nextDouble();
    
        double media = (n1 + n2) / 2.0;
        System.out.printf("Média do aluno: %.2f\n", media);

        if (media < 7) {
            System.out.println("Você foi reprovado");
        } else if (media >= 7 && media < 10) {
            System.out.println("Você foi aprovado");
        } else {
            System.out.println("Você foi aprovado com distinção");
        }
    }
}        

