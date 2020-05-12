import java.util.Scanner;
public class q {
    public static void main( String [] argd ) {

        Scanner s;
        int imposto,valor,lucro;
        double imposto_final,lucro_final,total;

        s =  new Scanner(System.in);
        System.out.print("nforme o valor do carro: ");
        valor = s.nextInt();
        System.out.print("informe o valor do imposto: ");
        imposto = s.nextInt();
        System.out.print("informe o luvro da desbribuidor: ");
        imposto_final = imposto / 100;
        lucro_final = lucro/100;
        total = (imposto_final * valor) + valor + (lucro_final * valor);
        System.out.println("o valor do imposto eh " + (imposto_final * valor) );
        System.out.println("o valor do lucro dola distribuidora eh " + (lucro_final * valor));
        System.out.println("o total a pagar pelo carro eh " + total );
    }
}
