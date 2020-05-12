import java.util.Scanner;

public class Comparacao {

    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);

        String[] opcoes = {"1 - Homens", "2 - Mulheres", "3 - Geral"};

        System.out.println("Qual é o seu nome?");
        String nome = leitor.nextLine();

        System.out.println("Quantas pessoas há na turma de biologia?");
        int qtdDePessoas = leitor.nextInt();

        for(int i = 0; i<opcoes.length; i++) {
            System.out.println(opcoes[i]);
        }

        System.out.println("Digite a forma com que deseja comparar");
        int forma = leitor.nextInt();

        if(forma == 1) {
            System.out.println("Quantos homens há na turma?");
            int qtdDeHomens = leitor.nextInt();

            float porcentagemDeHomens = (qtdDeHomens / qtdDePessoas) * 100;

            System.out.println(nome + " a ação foi feita com sucesso!");

            System.out.println("Porcentagem de Homens: " + porcentagemDeHomens);
        } else if(forma == 2) {
            System.out.println("Quantas mulheres há na turma?");
            int qtdDeMulheres = leitor.nextInt();

            float porcentagemDeMulheres = (qtdDeMulheres / qtdDePessoas) * 100;

            System.out.println(nome + " a ação foi feita com sucesso!");

            System.out.println("Porcentagem de Mulheres: " + porcentagemDeMulheres);
        } else {
            System.out.println("Tente novamente!");
        }
      
    }
}
