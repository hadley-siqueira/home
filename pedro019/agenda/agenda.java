import java.util.Scanner;

public class Agenda {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int escolha = 0;
        String[] nome = new String[100];
        String[] email = new String[100];
        String[] dataNascimento = new String[100];
        String[] telefone = new String[100];

    while (escolha !=4) {
        System.out.println("-------------");
        System.out.println("Agenda de Contatos");
        System.out.println("-------------");
        System.out.println("");
        System.out.println("1 - Cadastrar Contato");
        System.out.println("2 - Listar contatos");
        System.out.println("3 - Excluir contato");
        System.out.println("4 - Sair");
        System.out.print(": ");
        escolha = Integer.parseInt(s.nextLine());
        }
    }


    public static void cadastrar() {
        Scanner s = new Scanner(System.in);
        
        System.out.println("-----------------");
        System.out.println(">> Cadastrar Contatos");
        System.out.println("-----------------");

        System.out.println(">>Informe o nome do contato: ");
        nome[i] = s.nextLine();

        System.out.println(">>Informe o nome do contato: ");
        email[i] = s.nextLine();
        
        System.out.println(">>Informe o nome do contato: ");
        dataNascimento[i] = s.nextLine();

        System.out.println(">>Informe o nome do contato: ");
        telefone[i] = s.nextLine();
        }
    }

