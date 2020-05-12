import java.util.Scanner;

    public class Questao12 {
        public static void main(String[] args) {
            Scanner s;
            s = new Scanner(System.in);

        System.out.println("** Dinheiro da fábrica de camisetas **");
    
        System.out.println("Digite a quantidade de camisas P: ");
        int qcp = s.nextInt();
        
        System.out.println("Digite a quantidade de camisas M: ");
        int qcm = s.nextInt();
        
        System.out.println("Digite a quantidade de camisas G: ");
        int qcg = s.nextInt();

        int qt = qcp + qcm + qcg;
        int qr = qcp*10 + qcm*12 + qcg*15;

        System.out.println("O valor que a fabrica terá é de " + qr + " R$");

    }
}
