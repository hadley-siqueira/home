import java.util.Calendar;
public class Data {
    Calendar c = Calendar.getInstance();
    public int dia = c.get(Calendar.DAY_OF_MONTH);
    public int mes = c.get(Calendar.MONTH);
    public int ano = c.get(Calendar.YEAR);
    public int hora = c.get(Calendar.HOUR_OF_DAY);
    public int minuto = c.get(Calendar.MINUTE); 

    public void imprimirData() {
        System.out.printf("%02d/%02d/%d %02d:%02d", dia, (mes + 1), ano, hora, minuto);
    }
}


