import java.util.Scanner;
public class Questao11 {
        public static void main(String[] args) {
            Scanner s;
             double notpri;
             double b1;
             double notseg;
             double b2;
             double notter;
             double b3;
             double notquar;
             double b4;
             double cima;
             double baixo;
             double res;
        
             s = new Scanner(System.in);

             System.out.println("Somador de notas do bimestre");

             System.out.print("Diga-me sua nota: ");
             notpri = s.nextDouble();   
             System.out.print("Informe o bimestre: ");
             b1 = s.nextDouble();

             System.out.print("Diga-me sua nota: ");
             notseg = s.nextDouble();
             System.out.print("Informe o bimestre: ");
             b2 = s.nextDouble();

             System.out.print("Diga-me sua nota: ");
             notter = s.nextDouble();
             System.out.print("Informe o bimestre: ");
             b3 = s.nextDouble();

             System.out.print("Diga-me sua nota: ");
             notquar = s.nextDouble();
             System.out.print("Informe o bimestre: ");
             b4 = s.nextDouble();

             cima = b1 * notpri + b2 * notseg + b3 * notter + b4 * notquar;
             baixo = b1 + b2 + b3 + b4;
             res = cima / baixo;
             System.out.println("Sua nota total eh: " + res);
     }
}


            
