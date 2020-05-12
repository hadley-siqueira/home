public class IgnoreCase {
    public static void main(String[] args) {
        /*
        Esse algoritmo irá pegar 4 string
        e irá compará-los de maneiras diferentes
        */
        String s1 = "Olá";
        String s2 = "olá";
        String s3 = "OLÁ";
        String s4 = "olá";

        System.out.println(s2.equals(s4));
        System.out.println(s1.equals(s2));
        System.out.println(s2.equalsIgnoreCase(s3));
    }
}
    
