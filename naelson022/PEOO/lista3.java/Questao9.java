import java.util.Scanner;
public class Questao9 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n1,n2;
        double n_final ;
    System.out.print("digite a nota do aluno:");
    n1 = s.nextInt();
    System.out.print("digite a outra nota do aluno: ");
    n2 = s.nextInt();
    while(n1 < 0 || n1 > 10 || n2 < 0 || n2 > 10) {
        System.out.println("Nota invalida" );
        System.out.println("digite a primeira  nota valida: ");
        n1 = s.nextInt();
        System.out.print("digite a segunda  nota do valida: ");
        n2 = s.nextInt();
        }
    n_final = (n1 + n2) / 2 ;
    System.out.println("a media desse aluno eh : " + n_final);
}
}
