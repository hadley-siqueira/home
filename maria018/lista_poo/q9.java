import java.util.Scanner;
public class q9 {
    public static void main (String [] args) {
        
        Scanner s;
        double p_fabrica;
        double lucro_distribuidor;
        double percentual_imposto;
        double preco_final;
        s = new Scanner(System.in);

        System.out.print("Digite o preço de fabrica de um veiculo:");
        p_fabrica = s.nextDouble();
        System.out.print("Digite o percentual de lucro do distribuidor:");
        lucro_distribuidor = s.nextDouble();
        System.out.print("Digite o percentual de imposto:");
        percentual_imposto = s.nextDouble();

        preco_final = p_fabrica + (lucro_distribuidor / 100.0 * p_fabrica);
        preco_final = preco_final + (percentual_imposto / 100.0 * p_fabrica);
        lucro_distribuidor = (lucro_distribuidor / 100.0 * p_fabrica);
        percentual_imposto = (percentual_imposto / 100.0 * p_fabrica);

        System.out.println("O lucro do distribuidor eh " + lucro_distribuidor);
        System.out.println("O percentual de impostos eh " + percentual_imposto);
        System.out.println("O valor final do veiculo eh " + preco_final);

    }
}
