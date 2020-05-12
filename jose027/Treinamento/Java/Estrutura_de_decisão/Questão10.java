import java.util.Scanner;
public class Questão10 {
    public static void main(String[] args) {
        int reaj;
        double n_salario;
        Scanner s;
        s = new Scanner(System.in);

        System.out.print("Digite o seu salário: ");
        double salario = s.nextDouble();

        while (salario < 0) {
            System.out.println("Salário inválido, digite novamente");
            System.out.print("Digite o seu salário: ");
            salario = s.nextDouble();
        }    
        if (salario > 0 && salario <= 280) {
            reaj = 20;
        } else if (salario <= 700) {
            reaj = 15;
        } else if (salario < 1500) {
            reaj = 10; 
        } else {
            reaj = 5;    
        }

        System.out.println("Salário antes do aumento: R$" + salario + " reais");
        System.out.println("Percentual de aumento: " + reaj + "%");
        System.out.println("Valor do aumento: R$" + (salario * reaj / 100) + " reais");
        System.out.println("Salário pós aumento: R$" + (salario + (salario * reaj / 100)) + " reais");
    }
}
