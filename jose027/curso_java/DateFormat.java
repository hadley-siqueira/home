import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;
public class DateFormat {
    public static void main(String[] args) {
        Date hoje = new Date();
        System.out.println(Locale.getDefault());
        Locale.setDefault(new Locale("pt", "Brazil"));
        String hoje_formatado = DateFormat.getInstance().format(hoje);
        System.out.println(hoje_formatado);
    }
}
