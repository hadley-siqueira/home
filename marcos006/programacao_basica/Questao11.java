import java.util.Scanner;

    public class Questao11 {
        public static void main(String[] args) {
            Scanner s;
            s = new Scanner(System.in);

        System.out.println("** Média ponderada dos alunos do IFRN **");
        
        System.out.println("Digite a nota do primeiro bimestre: ");
        float n1 = s.nextFloat();

        System.out.println("Digite a nota do segundo bimestre: ");
        float n2 = s.nextFloat();
    
        System.out.println("Digite a nota do terceiro bimestre: ");
        float n3 = s.nextFloat();

        System.out.println("Digite a nota do quarto bimestre: ");
        float n4 = s.nextFloat();

        float nt = n1 + n2 + n3 + n4;

        double mp = n1 * 7.0 + n2 * 5.0 + n3 * 6.0 + n4 * 9.5/nt;

        System.out.println("A média ponderada é de " + mp);

    }
}
