import java.util.Scanner;

public class q3 {
    public static void main (String[] args) {

        Scanner s;
        double imc;
        double peso;
        double altura;
        s = new Scanner(System.in);
        
        System.out.println("Vou calcular seu IMC");
        System.out.print("Digite a sua massa corporal (em quilos):");
        peso = s.nextFloat();
        System.out.print("Digite a sua altura (em metros):");
        altura = s.nextFloat();
        
        imc = peso/(altura*altura);
        System.out.println("O seu IMC eh " + imc);

    }
}
