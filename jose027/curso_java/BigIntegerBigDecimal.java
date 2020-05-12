import java.math.BigDecimal;
import java.math.BigInteger;
public class BigIntegerBigDecimal {
    public static void main(String[] args) {
        BigDecimal _a = new BigDecimal("0.03");
        BigDecimal _b = new BigDecimal("0.04");
        BigDecimal _c = _b.subtract(_a);
        System.out.println("Subtração: " + _c);
        BigDecimal bd1 = new BigDecimal("1234567890.0987");
        BigDecimal bd2 = new BigDecimal("987654321.9876");
        System.out.println("Soma: " + bd1.add(bd2));
        System.out.println("Multiplicação: " + (bd1.multiply(bd2)));
        System.out.println("Divisão: " + (bd1.divide(new BigDecimal(2))));
        BigInteger bi = new BigInteger("1000000");
        System.out.println(bi);        
    }
}
