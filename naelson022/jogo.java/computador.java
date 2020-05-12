import java.util.Scanner;
import java.util.Random;

public class computador {
    public static void main(String[] args) {
        char[][] v = new char[3][3];
        boolean c = true;
        int l = 0 ;
        while (c == true) {
            jogada(v, 'x');
            for (int i = 0; i < 3; i++) {
                System.out.println(v[i][0] + "|" + v[i][1] + "|" + v[i][2]);
            }
            c = fim(v);
            if (c == false) {
                System.out.println("jogador1 ganhou!!");
                break;
            }
            if (l > 3) {
                System.out.println("deu empate!");
                break;
            }
            l++;

            System.out.println("vez do computador");
            jogada2(v);
            for (int i = 0; i < 3; i++) {
                System.out.println(v[i][0] + "|" + v[i][1] + "|" + v[i][2]);
            }
            c = fim(v);
            if (c == false) {
                System.out.println("jogador2 ganhou!!!");
                break;
            }
            System.out.println("sua vez, jogador");
        }
    }

    static char jogada(char[][] v, char jogador) {
        Scanner s = new Scanner(System.in);
        System.out.println("jogador " + jogador);
        System.out.println("digite a linha : ");
        int linha = s.nextInt();
        System.out.println("digite a coluna ");
        int coluna = s.nextInt();
        while (v[linha][coluna] == 'x' || v[linha][coluna] == 'o') {
            System.out.println("espaço ja preenchido digite novamente");
            System.out.println("digite a linha : ");
            linha = s.nextInt();
            System.out.println("digite a coluna ");
            coluna = s.nextInt();
        }

        return v[linha][coluna] = jogador;

    }

    static boolean fim(char[][] tabuleiro) {
        for (int i = 0; i < 3; i++) {
            if (tabuleiro[i][0] == 'x' && tabuleiro[i][1] == 'x' && tabuleiro[i][2] == 'x') {
                return false;
            }
        }
        for (int i = 0; i < 3; i++) {
            if (tabuleiro[0][i] == 'x' && tabuleiro[1][i] == 'x' && tabuleiro[2][i] == 'x') {
                return false;
            }
        }
        for (int i = 0; i < 3; i++) {
            if (tabuleiro[i][0] == 'o' && tabuleiro[i][1] == 'o' && tabuleiro[i][2] == 'o') {
                return false;
            }
        }
        for (int i = 0; i < 3; i++) {
            if (tabuleiro[0][i] == 'o' && tabuleiro[1][i] == 'o' && tabuleiro[2][i] == 'o') {
                return false;
            }
        }

        if (tabuleiro[0][0] == 'x' && tabuleiro[1][1] == 'x' && tabuleiro[2][2] == 'x'
                || tabuleiro[0][2] == 'x' && tabuleiro[1][1] == 'x' && tabuleiro[2][0] == 'x') {
            return false;
        }
        if (tabuleiro[0][0] == 'o' && tabuleiro[1][1] == 'o' && tabuleiro[2][2] == 'o'
                || tabuleiro[0][2] == 'o' && tabuleiro[1][1] == 'o' && tabuleiro[2][0] == 'o') {
            return false;
        }
        return true;

    }

    static char jogada2(char[][] v) {
        Random aleatorio = new Random();
        int linha = (int) aleatorio.nextInt(3);
        int coluna = (int) aleatorio.nextInt(3);

        while (v[linha][coluna] == 'x' || v[linha][coluna] == 'o') {
            linha = (int) aleatorio.nextInt(3);
            coluna = (int) aleatorio.nextInt(3);

        }
        return v[linha][coluna] = 'o';
    }
}
