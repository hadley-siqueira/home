import java.util.Scanner;
public class Pessoa_teste {
    public static void main(String[] args) {
        Scanner s;
        s = new Scanner(System.in);
    
        System.out.print("Digite o nome: ");
        String nome = s.nextLine();

        System.out.print("Digite a data de nascimento: ");
        String nascimento = s.nextLine();

        System.out.print("Digite a altura: ");
        double alt = s.nextDouble();

        Pessoa p =  new Pessoa(nome, nascimento, alt);
        p.imprimirDados();
        p.fazerAniversario();
    }
}
