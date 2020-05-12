import java.util.Scanner;
public class JogoDaVelha { 

    public static void main(String[] args) {

        char[][] tabuleiro = new char[3][3];
        Scanner entrada = new Scanner(System.in);
        boolean ganhou = false;
        int jogada = 1;
        int linha, coluna;
        while(!ganhou) {
        if(jogada % 2 == 1) {
        System.out.println("Vez do Jogador 1");        
        System.out.println("Digite a linha: ");
        linha = entrada.nextInt();
        while(linha < 0 || linha >= 3) {
        System.out.println("Linha invalida, digite novamente: ");
        linha = entrada.nextInt();
        }
        System.out.println("Digite a coluna: ");
        coluna = entrada.nextInt(); 
        while(coluna < 0 || coluna >= 3) {
        System.out.println("Coluna invalida, digite novamente: ");
        coluna = entrada.nextInt();
        }
        if(tabuleiro[linha][coluna] == 'X' || tabuleiro[linha][coluna] == 'O') {
        System.out.println("Lugar ocupado, digite novamente a linha: ");
        linha = entrada.nextInt();
        System.out.println("Digite a coluna: ");
        coluna = entrada.nextInt();
        } else {
        tabuleiro[linha][coluna] = 'X';

        System.out.println();

        for(int i = 0; i < tabuleiro.length; i++) {
            for(int j = 0; j < tabuleiro[i].length; j++) {
                System.out.print(tabuleiro[i][j] + " | ");
            }
            System.out.println();
        }
        jogada++;
        }
        if(jogada % 2 == 0) {
        System.out.println("Vez do Jogador 2");
        System.out.println("Digite a linha: ");
        linha = entrada.nextInt();

        System.out.println("Digite a coluna: ");
        coluna = entrada.nextInt();

        tabuleiro[linha][coluna] = 'O';
    }
}
}
}
}

