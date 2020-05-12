import java.util.Scanner;
public class Questao3 {
         public static void main(String[] args) {
            Scanner s;
            double peso;
            double altura;
            double calculo1;

            s = new Scanner(System.in);

            System.out.println("Calculador de IMC");

            System.out.print("Diga-me seu peso: ");
            peso = s.nextDouble();

            System.out.print("Diga-me sua altura: ");
            altura = s.nextDouble();

            calculo1 = peso / Math.pow (altura , 2);

            System.out.println("Seu indice de massa corporal é: " + calculo1);

            }
    }
                     
