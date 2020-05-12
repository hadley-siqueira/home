import java.util.Scanner;
public class Q9 { 
    public static void main (String [] args) {
        Scanner s = new Scanner(System.in);
        double nota1, nota2, media;
        
        System.out.print("Digite a primeira nota : ");
        nota1 = s.nextDouble();

        System.out.print("Digite a segunda nota: ");
        nota2 = s.nextDouble();

        while (nota1 > 10 || nota1 < 0) {
            System.out.println("Nota invalida!");
            System.out.print("Digite a primeira nota: ");
            nota1 = s.nextDouble();
        }
        while (nota2 > 10 || nota2 < 0){
            System.out.println("Nota invalida!");
            System.out.print("Digite a segunda nota: ");
            nota2= s.nextDouble();
        }
        media =  (nota1 + nota2) / 2;

        System.out.println("A média eh " + media);
    }
}
