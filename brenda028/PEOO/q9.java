import java.util.Scanner;
public class q9 {
    public static void main(String[] args) {
        Scanner s;
        double fabrica;
        double lucro;
        double imposto;
        double p_final;

        s = new Scanner(System.in);

        System.out.print("Digite o preço de um veiculo:");
        fabrica = s.nextFloat();
        System.out.print("Digite o percentual de lucro do destribuidor:");
        lucro = s.nextFloat();
        System.out.print("Digite o percentual de imposto:");
        imposto = s.nextFloat();

        p_final = fabrica + (lucro / 100.0 * fabrica);
        p_final = p_final + (imposto / 100.0 * fabrica);
        lucro = (lucro / 100.0 * fabrica);
        imposto = (imposto / 100.0 * fabrica); 

        System.out.println("o lucro do distribuidor eh " + lucro);
        System.out.println("o percentutal dos impostos eh " + imposto);
        System.out.println("o valor final eh " + p_final);

    }
}

    

 
