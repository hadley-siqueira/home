import java.util.Scanner;
public class Questão03 {
    public static void main(String[] args) {
        String vog[] = {"A","E","I","O","U"};
        Scanner s;
        s = new Scanner(System.in);

        System.out.print("Digite a letra desejada: ");
        String l = s.next();

        for (int c = 0; c < 5; c++) {
            if (l.equalsIgnoreCase(vog[c])) {
                System.out.println(l + " é uma vogal");
                System.exit(0);
            } 
        }
        if (l.equalsIgnoreCase(vog[4]) == false) {
            System.out.println(l + " não é uma vogal");  
        }    
    }
}
        
