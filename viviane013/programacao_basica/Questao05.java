import java.util.Scanner ;

public class Questao05 {
    public static void main(String[] args) {
        int simples ;
        int completos ;
        int resultado ; 
        Scanner s;

        s = new Scanner(System.in);
        System.out.print("Qtd de contratos simples: ");
        simples = s.nextInt();
        System.out.print("Qtd de contratos completos: ");
        completos = s.nextInt();
        resultado = 3850 * completos + 2530 * simples - 2300 * simples - 3500 * completos;
        System.out.println("Lucro obtido: " + resultado);
    }
}

