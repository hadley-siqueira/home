import java.util.Scanner;
    public class Questao8 {
        public static void main (String [] args) {
                Scanner s;
                double N1;
                double N2;
                double N3;

                s = new Scanner(System.in);

                System.out.print("Informe o primeiro numero: ");
                N1 = s.nextDouble();

                System.out.print("Informe o segundo numero: ");
                N2 = s.nextDouble();

                System.out.print("Informe o terceiro numero: ");
                N3 = s.nextDouble();

                if ( N1 < N2 ) {
                    if ( N1 < N3 )
                    System.out.println("O menor numero é: " + N1);
                    else
                    System.out.println("O menor numero é: " + N3);

                }else{
                     if (N2 < N3)
                    System.out.println("O menor numero é: " + N2);
                    else
                    System.out.println("O menor numero é: " + N3);

                }
          }
    }
