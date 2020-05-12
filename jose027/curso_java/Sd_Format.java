import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Date;
public class Sd_Format {
    public static void main(String[] args) {
        System.out.println("*** Data ***");
        SimpleDateFormat sdf = new SimpleDateFormat("dd-mm-yyyy hh:mm:ss");
        Calendar data = new GregorianCalendar(2010, 5, 4, 12, 32, 25);
        System.out.println(sdf.format(data.getTime()));
    }
}
