import java.util.Scanner;
public class Questão06 {
    public static void main(String[] args) {
        int qtd_alunos = 0;
        double medias[] = new double[10];
        Scanner s;
        s = new Scanner(System.in);
        
        for (int c = 0; c < 10; c++) {
            double soma = 0;
            System.out.println("*** " + (c + 1) + "° aluno ***");
            for (int cont = 0; cont < 4; cont++) {
                System.out.print("Digite a " + (cont + 1) + "° nota: ");
                double nota = s.nextDouble();
                soma += nota;
            }
            medias[c] = soma / 4.0;
            System.out.printf("Média: %.2f\n", (soma / 4.0));
        }
        for (int c = 0; c < 10; c++) {
            if (medias[c] >= 7) {
                qtd_alunos++;
            }
        }

        System.out.println("Quantidade de alunos aprovados: " + qtd_alunos);   
        for (int c = 0; c < medias.length; c++) {
            System.out.print("|" + medias[c] + "| ");
        }
        System.out.println();
    }
} 
