import java.util.Scanner;
    public class vetor02 {
        public static void main(String[] args) {
        Scanner s;
        s = new Scanner(System.in);
        
        int n[] = {0, 8, 2, 7, 5, 4, 10, 13, 14, 16, 15, 22, 26};

        for (int c = 0; c < n.length; c ++) {
            System.out.println("Na posição " + c + " temos o valor " + n[c]);
        }
        System.out.println("O vetor apresenta " + n.length + " índices");
        
    }
}
