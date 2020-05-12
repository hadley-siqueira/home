import java.util.Scanner;

public class Questao02 {

        public static void main(String[] args) {
                // TODO Auto-generated method stub



                int number1,number2,number3;



                Scanner leitor= new Scanner (System.in);



                System.out.println("Digite o primeiro numero: ");
                number1=leitor.nextInt();
                System.out.println("Digite o segundo numero: ");
                number2=leitor.nextInt();
                System.out.println("Digite o terceiro numero: ");
                number3=leitor.nextInt();


                System.out.println("number1 ao quadrado eh: " +Math.pow(number1, 2));
                System.out.println("number2 o triplo eh: " +Math.pow(number2, 3));
                System.out.println("number3 o quatuplo eh: " +Math.pow(number3, 4));


                }}

