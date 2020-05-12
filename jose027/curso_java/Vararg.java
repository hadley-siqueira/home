public class Vararg {
public static int somaElementos(Integer ...v) {
    int total = 0;
    for (int c = 0; c < v.length; c++) {
        total += v[c];
    }
    return total;
}
public static void main(String[] args) {
    System.out.println(somaElementos(1, 2, 3, 4, 9));
}
} 
