import java.text.NumberFormat;
import java.util.Locale;
public class NFormat {
    public static void main(String[] args) {
        Locale en = new Locale("en", "United Stated");
        NumberFormat nf = NumberFormat.getInstance(en);
        String num = nf.format(100.99);
        System.out.println(num);
        Locale br = new Locale("pt", "Brazil");
        nf = NumberFormat.getInstance(br);
        num = nf.format(100.99);
        System.out.println(num);
        NumberFormat moeda = NumberFormat.getCurrencyInstance(en);
        String valor = moeda.format(100.99);
        System.out.println(valor);
        NumberFormat porcent = NumberFormat.getPercentInstance();
        String porcentagem = porcent.format(99.987);
        System.out.println(porcentagem);
        porcent.setMaximumIntegerDigits(4);
        porcent.setMinimumIntegerDigits(3);
        porcent.setMaximumFractionDigits(2);
        porcent.setMinimumFractionDigits(1);
        System.out.println(porcentagem);
        nf = NumberFormat.getInstance(Locale.getDefault());
        //nf.setRoudingMode(RoudingMode.UP);      
        nf.setMaximumFractionDigits(0);
        nf.setMinimumFractionDigits(0);
        System.out.println(nf.format(99.50));
    }
}
