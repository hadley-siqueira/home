import java.util.Scanner;
public class Q8{
    public static void main(String [] args){
        Scanner s;
        s = new Scanner(System.in);
        int contagem;
        double nota = 0, media;

        for (contagem = 0 ; contagem < 10 ; contagem++){
            System.out.print("Informe a nota: ");
            nota = s.nextDouble();
        }

        media = nota / 10.0;

        System.out.println("Média: " + media);
    }
}

        
