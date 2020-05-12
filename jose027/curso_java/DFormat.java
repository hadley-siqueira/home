import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
public class DFormat {
    public static void main(String[] args) {
        //formatação1
        String padrao1 = "###,###.##";
        DecimalFormat df = new DecimalFormat(padrao1);
        System.out.println(df.format(1234567890.123));
        //formatação2
        DecimalFormatSymbols dfs = new DecimalFormatSymbols(new Locale("pt", "Brazil"));
        dfs.setDecimalSeparator(',');
        dfs.setGroupingSeparator('.');
        String padrao2 = "###,###.##";
        df = new DecimalFormat(padrao2, dfs);
        System.out.println(df.format(1234567890.123));
        //formatação3
        String padrao3 = "###,###,###.##";
        df = new DecimalFormat(padrao3, dfs);
        df.setGroupingSize(4);
        System.out.println(df.format(1234567890.123));
    }
}
