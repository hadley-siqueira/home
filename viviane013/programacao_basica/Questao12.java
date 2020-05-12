import java.util.Scanner;
public class Questao12 {
        public static void main(String [] args) {
            Scanner s;
            int pequena;
            int p;
            int medio;
            int m;
            int grande;
            int g;
            int calcp;
            int calcm;
            int calcg;
            int todo;

            s = new Scanner(System.in);

            System.out.println("Compre sua camisa");
        
            System.out.print("Diga-me quantas camisas P deseja: ");
            pequena = s.nextInt();
            p = 10;
            System.out.print("Diga-me quantas camisas M deseja: ");
            medio = s.nextInt();
            m = 12;
            System.out.print("Diga-me quantas camisas G deseja: ");
            grande = s.nextInt();
            g = 15;

            calcp = pequena * p;
            calcm = medio * m;
            calcg = grande * g;
            todo = calcp + calcm + calcg;

            System.out.println("O total da compra é de: " + todo);
    }
}
            
            
