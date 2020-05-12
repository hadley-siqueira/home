import java.util.Scanner;
public class Questão03 {
    public static void main(String[] args) {
        Scanner s;
        s = new Scanner(System.in);

        System.out.print("Digite o nome desejado: ");
        String nome = s.nextLine();

        while (nome.replaceAll(" ", "").length() <= 3) {
            System.out.println("Nome inválido, digite novamente");
            System.out.print("Digite o nome desejado: ");
            nome = s.nextLine();
        } 

        System.out.print("Digite a idade: ");
        int idade = s.nextInt();

        while (idade <= 0 || idade >= 150) {
            System.out.println("Idade inválida, digite novamente");
            System.out.print("Digite a idade: ");
            idade = s.nextInt();
        }

        System.out.print("Digite seu salário: ");
        double salario = s.nextDouble();
        
        while (salario <= 0) {
            System.out.println("Salário inválido, digite novamente");
            System.out.print("Digite seu salário: ");
            salario = s.nextDouble();
        }

        System.out.print("Digite o seu sexo: ");
        String sexo = s.next();

        while (sexo.length() > 1 || (sexo.equalsIgnoreCase("m")  == false && sexo.equalsIgnoreCase("f") == false)) {
            System.out.println("Sexo, inválido, digite novamente");
            System.out.print("Digite o seu sexo: ");
            sexo = s.next();
        }
    }
}


        



        
            
            
