import java.util.Scanner;

public class Agenda {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int qtd = 100;
        int escolha = 0;
      String[] nome = new String[qtd];
        String[] email = new String[qtd];
        String[] dataNascimento = new String[qtd];
        String[] telefone = new String[qtd];

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

             switch(escolha) {
            case 1:
               cadastrar();
            default:
                break;
        }

    }


    public static void cadastrar(String[] nome, String[] email, String[] dataNascimento, String[] telefone, int qtd, Scanner s) {
    
        System.out.println("-----------------");
        System.out.println(">> Cadastrar Contatos");
        System.out.println("-----------------");

        System.out.println(">>Informe o nome do contato: ");
        nome[qtd] = s.nextLine();

        System.out.println(">>Informe o nome do contato: ");
        email[qtd] = s.nextLine();
        
        System.out.println(">>Informe o nome do contato: ");
        dataNascimento[qtd] = s.nextLine();

        System.out.println(">>Informe o nome do contato: ");
        telefone[qtd] = s.nextLine();
        }
    }

