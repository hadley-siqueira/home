import java.util.Scanner;

public class Q3{
    public static void main(String[] args){
        Scanner s;
        s = new Scanner(System.in);

        System.out.print("Altura(em metros): ");
        float n = s.nextFloat();

        System.out.print("Peso(em quilos): ");
        float p = s.nextFloat();

        float imc = p/(n * n);

        System.out.println("Seu IMC é de " + imc);
        }

    }
