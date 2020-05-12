import java.util.Scanner;

public class L1Q9 {
    public static void main(String args[]) {
        Scanner s;
        double p,pl,pi,l,i,pf;

        s = new Scanner(System.in);
        System.out.print("Digite o preço de fábrica do veículo:");
        p = s.nextDouble();
        System.out.print("Digite o percentual de lucro do distribuidor:");
        pl = s.nextDouble();
        System.out.print("Digite o percentual de imposto:");
        pi = s.nextDouble();

        l = (pl * p/100);
        i = (pi * p/100);
        pf = l + i + p;

        System.out.println("Lucro do distribuidor:R$"+l);
        System.out.println("Impostos:R$"+i);
        System.out.println("Preço final do veículo:R$"+pf);

    }
}

        
