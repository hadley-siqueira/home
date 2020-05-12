import java.util.Scanner;

public class ProgramaDaImobiliaria {
    public static void main(String[] args) { 
        double largura;
        double comprimento;
        double area;
        Scanner s;

        s = new Scanner(System.in);

        System.out.println("Programa de calculo de area de terreno");
        System.out.print("Digite a largura do terreno: ");
        largura = s.nextDouble(); 
        
        System.out.print("Digite o comprimento do terreno: ");
        comprimento = s.nextDouble();

        area = comprimento * largura;
        
        System.out.println("A area do terreno eh de " + area);
    }
}


