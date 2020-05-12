import java.util.Scanner;
public class Matriz02 {
    public static void main(String[] args) {
        
        double [][] numerosDecimais = new double [3][2];

        numerosDecimais[0][0] = 9.9;
        numerosDecimais[0][1] = 7.5;
        
        numerosDecimais[1][0] = 9.4;
        numerosDecimais[1][1] = 9.5;
        
        numerosDecimais[2][0] = 1.9;
        numerosDecimais[2][1] = 7.9;
   
        for (int c = 0; c < numerosDecimais.length; c ++) {
            for (int cont = 0; cont < numerosDecimais[c].length; cont ++) {
                System.out.print(numerosDecimais[c][cont] + " ");   
                }
            System.out.println();
            
        }
    }
}
      
