import java.util.Scanner;
public class logicos {
    public static void main(String[] args) {
        int x = 4;
        int y = 7;
        int z = 11;
        boolean r;
    
        r = (x < y ^ y == z)?true:false;
        
        System.out.println(r);
    }
}
        
