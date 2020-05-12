import java.util.Scanner;
public class Strings {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite o nome: ");
        String nome = entrada.nextLine();

        String[] partes = nome.split(" ");

        int ultimoIndiceVetor = partes.lenght - 1;
        
        System.out.println(partes[ultimoIndiceVetor].toUpperCase() + ", " + partes[0]);
     
        
  
  }
}
