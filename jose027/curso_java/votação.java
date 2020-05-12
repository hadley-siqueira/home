import java.util.Scanner;
public class votação {
    public static void main(String[] args) {
        int idade;
        int nascimento;
        Scanner s;
        s = new Scanner(System.in);

        System.out.print("Digite o ano em que você nasceu: ");
        nascimento = s.nextInt();

        idade = 2018 - nascimento;
        System.out.println("Você tem " + idade + " anos de idade");

        if (idade < 16) {
            System.out.println("Você não está apto a votar");
        } else {
            if ((idade >=16 && idade < 18) || (idade > 70)) {
                System.out.println("Você votará opcionalmente");
            } else {
                System.out.println("Você votará obrigatoriamente");
            }
        }
    }
}
