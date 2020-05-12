import java.util.Scanner;
public class Questao13 {
        public static void main(String[] args) {
            Scanner s;
            double px;
            double qx;
            double py;
            double qy;
            double calc;

            s = new Scanner(System.in);

            System.out.println("Calculador de distancia euclidiana");

            System.out.print("Me informe o numero para px: ");
            px = s.nextDouble();
            System.out.print("Me informe o numero para qx: ");
            qx = s.nextDouble();
            System.out.print("Me informe o numero para py: ");
            py = s.nextDouble();
            System.out.print("Me informe o numero para qy: ");
            qy = s.nextDouble();

            calc = Math.sqrt((px - qx)* (px - qx) + (py - qy) * (py - qy));
            
            System.out.println("A distancia euclinada eh: " + calc);
    }
}
