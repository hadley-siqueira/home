import java.util.Scanner;
public class Questao08 {
        public static void main(String[] args) {
            Scanner s;
            int altura;
            int comprimento;
            int largura;
            int calculo;
            int alt;
            int larg;
            int calc;
            int comp;
            int al;
            int cal;
            int esfera;
            int raio;
            int divi;

            s = new Scanner(System.in);

            System.out.println("Contador de volume das formas");
            
            System.out.print("informe o numero para a altura do paralelepipedo: ");
            altura = s.nextInt();
            System.out.print("Informe o numero para o comprimento: ");
            comprimento = s.nextInt();
            System.out.print("Informe o numero para a largura: ");
            largura = s.nextInt();

            calculo = altura * comprimento * largura;
            System.out.println("O volume de um paralelepipedo eh: " + calculo);

            System.out.print("Informe o numero para o lado do cubo: ");
            alt = s.nextInt();
            System.out.print("Informe o numero para largura: ");
            larg = s.nextInt();
            
            calc = alt * larg;
            System.out.println("O lado de um cubo eh:" + calc);

            System.out.print("Informe o numero para o volume do cone: ");
            comp = s.nextInt();
            System.out.print("Informe a altura: ");
            al = s.nextInt();

            cal = comp * al;
            System.out.println("O volume do cone eh " + cal);
            
            System.out.print("Informe o numero para a esfera: ");
            esfera = s.nextInt();
            System.out.print("Informe o para encontrar o raio: ");
            raio = s.nextInt();
            
            divi = esfera / raio;
            System.out.println("o raio da esfera eh: " + divi);
            
            
            


            

    }
}
