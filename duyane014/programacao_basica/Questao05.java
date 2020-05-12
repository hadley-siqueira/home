import java.util.Scanner ;

public class Questao05 {
    public static void main(String[] args) { 
        int simples ;
        int completos ;
        int resultado ;
        Scanner s ;

        s = new Scanner(System.in);
        System.out.print("qtd de contratos simplis: ");
        simples = s.nextInt(); 
        System.out.print("qtd de contratos completos: ");
        completos = s.nextInt();
        resultado = 3850 * completos + 2530 * simples - 2300 * completos;
        System.out.println("lucro obtido: " + resultado);
    }
} 
