import java.util.Scanner;
    
public class L1Q10 {
    public static void main(String[] args) {
        Scanner s;
        int  m,d,h,m1;

        s = new Scanner(System.in);
        System.out.print("Informe a quantidade de minutos:");
        m = s.nextInt();
        
        d = m/1440;
        h = (m/60)%24;
        m1 = m%60; 


        System.out.println("São "+d+" dias,"+h+" horas e "+m1+" minutos");

    }
}
        
