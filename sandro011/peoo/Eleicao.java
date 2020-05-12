import java.util.Scanner;
public class Eleicao {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Chapa[] chapas = new Chapa[2];

        int quantChapasAdd = 0;


        boolean continua = true;

        while(true) {

            System.out.println("Bem vindo ao Sistema Eleitorial :) ");
            System.out.println("1 - Adicionar Chapa\n2 - Listar Chapas\n3 - Contabilizar votos\n4 - Encerrar programa");
            int opcao = s.nextInt();

            switch(opcao) {
            case 1: adicionarChapa(chapas, quantChapasAdd); break;
            case 2: listarChapa(chapas, quantChapasAdd); break;
            case 3: 
            case 4: continua = false;
            }
}

       }

       public static void AdicionarChapa(Chapa[] chapas, int quantChapasAdd) {
            Scanner s = new Scanner(System.in);
            System.out.println("Informe o numero: ");
            int numeroDaChapa = Integer.parseInt(s.nextLine);

            System.out.println("Informe o nome: ");
            String nome = s.nextLine();

            Chapa chapa = new Chapa();
            chapa.numero = numeroDaChapa;
            chapa.nome = nome;

            chapas[quantChapasAdd] = chapa;

        }
       public static void listarChapa(Chapa[] chapas, int quantChapasAdd) {

            if(quantChapadAdd == 0) {
               System.out.println("Não há chapas no sistema");
            } else {
               for(int i = 0; i < quantChapasAdd; i++) {
                    Chapa chapa = chapas[i];
                    System.out.println("Nome da chapa: " + chapa.nome);
                    System.out.println("Numero: " + chapa.numero);
                    System.out.println("Quantidade de votos: " + chapa.pegarTodosOsVotos());
                }
        }
    }
}
