import java.util.Scanner;
public class Questão02 {
    public static void main(String[] args) {
        Scanner s;
        s = new Scanner(System.in);

        System.out.print("Digite o nome desejado: ");
        String nome = s.nextLine();

        System.out.print("Digite a senha desejada: ");
        String senha = s.next();

        while (senha.equalsIgnoreCase(nome.replaceAll(" ", ""))) {
            System.out.println("Senha inválida, digite novamente");
            System.out.print("Digite a senha desejada: ");
            senha = s.next();
        }

        System.out.println("Nome do usuário: " + nome + "\nSenha: " + senha);
    }
}
            
