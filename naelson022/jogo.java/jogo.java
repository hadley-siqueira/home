import java.util.Scanner;

public class joguinho1 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        char[][] v = new char[3][3];
        boolean c = true;
        int x = 0;
        int y = 2;
        System.out.println("a seguir a representaçao do tabuleiro");
        System.out.println("v[0][0] | v[0][1] | v[0][2]");
        System.out.println("v[1][0] | v[1][1] | v[1][2]");
        System.out.println("v[2][0] | v[2][1] | v[2][2]");
        System.out.println();
        System.out.println(" __|" + "__|__");
        System.out.println(" __|" + "__|__ ");
        System.out.println("   |" + "  | ");
        System.out.println();
        while (c == true) {
            System.out.println("jogador 1");
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
            v[linha][coluna] = 'x';
            System.out.println(v[0][0] + "|" + v[0][1] + "|" + v[0][2]);
            System.out.println(v[1][0] + "|" + v[1][1] + "|" + v[1][2]);
            System.out.println(v[2][0] + "|" + v[2][1] + "|" + v[2][2]);
            c = fim(v);
            if (c == false) {
                System.out.println("jogador1 ganhou!!");
                break;

            }

            if (x < 4) {
                System.out.println();
                System.out.println("jogador 2:");               
                System.out.println("digite a linha : ");
                linha = s.nextInt();
                System.out.println("digite a coluna ");
                coluna = s.nextInt();
                while (v[linha][coluna] == 'x' || v[linha][coluna] == 'o') {
                    System.out.println("espaço ja preenchido digite novamente");
                    System.out.println("digite a linha : ");
                    linha = s.nextInt();
                    System.out.println("digite a coluna ");
                    coluna = s.nextInt();
                }
                v[linha][coluna] = 'o';
                System.out.println(v[0][0] + "|" + v[0][1] + "|" + v[0][2]);
                System.out.println(v[1][0] + "|" + v[1][1] + "|" + v[1][2]);
                System.out.println(v[2][0] + "|" + v[2][1] + "|" + v[2][2]);
                System.out.println();
                fim(v);
                x++;
                if (c == false) {
                    System.out.println("jogador2 ganhou!!!");
                    break;
                }
            } else {
                c = false;
            }
        }
        System.out.println("deu empate!");

    }

    static boolean fim(char[][] tabuleiro) {

        if (tabuleiro[0][0] == 'x' && tabuleiro[0][1] == 'x' && tabuleiro[0][2] == 'x'
                || tabuleiro[1][0] == 'x' && tabuleiro[1][1] == 'x' && tabuleiro[1][2] == 'x'
                || tabuleiro[2][0] == 'x' && tabuleiro[2][1] == 'x' && tabuleiro[2][2] == 'x') {
            return false;
        } else if (tabuleiro[0][0] == 'x' && tabuleiro[1][0] == 'x' && tabuleiro[2][0] == 'x'
                || tabuleiro[0][1] == 'x' && tabuleiro[1][1] == 'x' && tabuleiro[2][1] == 'x'
                || tabuleiro[0][2] == 'x' && tabuleiro[1][2] == 'x' && tabuleiro[2][2] == 'x') {
            return false;
        }
        return true;
    }
}
