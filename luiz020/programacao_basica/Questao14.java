import java.util.Scanner;

    public class Questao14 {

        public static void main (String[] args) {

        Scanner k = new Scanner(System.in);

        int dias, meses, anos;

        System.out.println(" Programa Sem Acidente no Trabalho ");

        System.out.print("Informe a quantidade de dias: ");
        dias = k.nextInt();

        anos = dias / 360;

        dias = dias - (anos * 360);

        meses = dias / 30;

        dias = dias - (meses * 30);

        System.out.println("Sem acidentes em anos: " + anos); 
        System.out.println("Sem acidentes em meses: " + meses); 
        System.out.println("Sem acidentes em dias: " + dias);

        }}
           
                   
