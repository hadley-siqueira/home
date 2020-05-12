import java.util.Scanner;

public class teste {

    public static void main(String[] args) {
        double num1,num2,num3;
        Scanner s = new Scanner(System.in);
        
        System.out.print("Digite o primeiro número: ");
        num1 = s.nextDouble();
        System.out.print("Digite o segundo número: ");
        num2 = s.nextDouble();
        System.out.print("Digite o terceiro número: ");
        num3 = s.nextDouble();

        if (num1 < (num2+num3) && num2 < (num1+num3) && num3 < (num1+num2) ) {
            }else if (num1 == num2 && num1 == num3 && num2 == num3) {
                System.out.println("Forma um triângulo equilátero");
            }else if(num1 == num2 || num1 == num3 || num2 == num3) {
                System.out.println("Forma um triângulo isósceles");
            }else if(num1 != num2 && num1 != num3 && num2 != num2) {
                System.out.println("Forma um triângulo escaleno");
        else {
            System.out.println("Não forma triângulo");
            }
        }
    }
