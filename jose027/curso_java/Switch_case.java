import java.util.Scanner;
public class Switch_case {
    public static void main(String[] args) {
        int dia_semana;
        Scanner s;
        s = new Scanner(System.in);

        System.out.print("Dia da semana: ");
        dia_semana = s.nextInt();

        switch(dia_semana) {
        case 1: 
        System.out.println("Domingo"); 
        break;
        case 2: 
        System.out.println("Segunda"); 
        break;
        case 3: 
        System.out.println("Terça");
        break;
        case 4:
        System.out.println("Quarta"); 
        break;
        case 5: 
        System.out.println("Quinta"); 
        break;
        case 6: 
        System.out.println("Sexta"); 
        break;
        case 7: 
        System.out.println("Sábado"); 
        break;
        default:
        System.out.println("O número digitado não corresponde a um dia da semana");

        }
    }
}
