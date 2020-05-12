import java.util.Scanner;
public class Questão09 {
    public static void main(String[] args) {
        int cont = 0;
        double v_num[] = new double[cont];
        double soma = 0;
        Scanner s;
        s = new Scanner(System.in);
        
        System.out.print("Digite o número desejado: ");
        double n = s.nextDouble();
        
        while (n != -1) {
            int tamanho = v_num.length + 1;
            System.out.print("Digite o número desejado: ");
            n = s.nextDouble();
            soma += n;
            v_num[cont] =  n;
            cont++;
        }
        if (v_num.length > 0) {
            System.out.println("Soma dos números " + soma);
            System.out.printf("Média: %.2f", (soma / cont));
        
            int qtd_media = 0;
            int qtd_sete = 0;
            for (int c = 0; c < v_num.length; c++) {
                System.out.print(v_num[c] + " ");
                if (v_num[c] > soma / cont) {
                    qtd_media += 1;
                }  
                if (v_num[c] < 7) {
                    qtd_sete += 1;
                }          
            }
            System.out.println("Quantidade de números acima da média: " + qtd_media);
            System.out.println("Quantidade de números abaixo de sete: " + qtd_sete);
        }
        System.out.println("Programa encerrado");
    }
}
