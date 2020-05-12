import java.util.Scanner;

public class Questao{
    public static void main(String[] args){
        Scanner s;
        s = new Scanner(System.in);
        
        System.out.println("digite a qtd de casamentos: ");
        int n = s.nextInt();

        System.out.print("digite a qtd de certidoes: ");
        int v = s.nextInt();
    
        int casamento = 250 * n;
        int certidoes = 30 * v;
        int total = casamento + certidoes;

        System.out.println("O total de dinheiro das e dos casamentos eh " + total);}} 
