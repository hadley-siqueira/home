import java.util.Scanner;
public class Q8{
    public static void main(String[] args){
        Scanner s;
        s = new Scanner(System.in);

        System.out.print("Informe a primeira nota: ");
        float n1 = s.nextFloat();

        System.out.print("Informe a segunda nota: ");
        float n2 = s.nextFloat();

        while(n1 > 10 || n1 < 0){
            System.out.println("Nota invalida.");
            System.out.print("Informe a primeiro nota: ");
            n1 = s.nextFloat();
        }
        while(n2 > 10 || n2 < 0){
            System.out.println("Nota invalida.");
            System.out.print("Informe a segunda nota: ");
            n2 = s.nextFloat();
        }
        
        float media = (n1 + n2) / 2;

        System.out.println("Média: " + media);
    }
}
