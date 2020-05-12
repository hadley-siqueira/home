import java.util.Scanner;
    public class repetição1 {
        public static void main(String[] args) {
            int cc = 0;
            Scanner s;
            s = new Scanner (System.in);
            
            while (cc < 10) {
                cc ++; 

            if (cc == 5 || cc == 7 || cc == 9) {
                continue;

            }

            System.out.println("cambalhota " + cc);

        }
    }
}

