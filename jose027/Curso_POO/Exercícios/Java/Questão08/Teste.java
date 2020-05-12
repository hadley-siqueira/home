import java.util.ArrayList;
import java.util.Scanner;
public class Teste {
    public static void main(String[] args) {
        Scanner s;
        s = new Scanner(System.in);
        double qtd_homens = 0.0;
        double qtd_mulheres = 0.0;

        ArrayList <Corredor> corredores = new ArrayList <Corredor>();
        System.out.println("*** Sistema para corredores ***");
        
        for (int c = 1; c < 51; c++) {
            System.out.print("Digite o nome do " + c + "° corredor: ");
            String nome = s.next();
            
            System.out.print("Digite o sexo do " + c + "° corredor: ");
            String sexo = s.next();
            
            System.out.print("Digite o tempo do " + c + "° corredor: ");
            double tempo_de_corrida = s.nextDouble();

            Corredor corredor = new Corredor(nome, sexo, tempo_de_corrida);
            corredores.add(corredor);
            
            if (corredor.getSexo().equalsIgnoreCase("M")) {
                qtd_homens += 1;
            } else {
                qtd_mulheres += 1;
            }
        }

        double menor_tempo = corredores.get(0).getTempo();
        Corredor corredor = corredores.get(0);
        
        for (int c = 1; c < corredores.size(); c++) {
            if (corredores.get(c).getTempo() < menor_tempo) {
                menor_tempo = corredores.get(c).getTempo();
                corredor = corredores.get(c);
            }
        }

        System.out.println("** Campeão **");
        System.out.println("Nome: " + corredor.getNome() + "\nSexo: " + corredor.getSexo());

        double soma_tempo_homens = 0;
        double soma_tempo_mulheres = 0;
        for (int c = 0; c < corredores.size(); c++) {
            if (corredores.get(c).getSexo().equalsIgnoreCase("M")) {
                soma_tempo_homens += corredores.get(c).getTempo();
            } else {
                soma_tempo_mulheres += corredores.get(c).getTempo();
            }
        }
        System.out.printf("Média de tempo dos homens: %.2f\n", soma_tempo_homens / qtd_homens);
        System.out.printf("Média de tempo das mulheres: %.2f\n",soma_tempo_mulheres / qtd_mulheres);
    }
}
