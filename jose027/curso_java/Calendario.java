import java.util.Calendar;
public class Calendario {
    public static void main(String[] args) {
        Calendar hoje = Calendar.getInstance();
        int ano = hoje.get(Calendar.YEAR);
        int mes = hoje.get(Calendar.MONTH);
        int dia = hoje.get(Calendar.DAY_OF_MONTH);
        int hora = hoje.get(Calendar.HOUR_OF_DAY);
        int minuto = hoje.get(Calendar.MINUTE);
        int segundo = hoje.get(Calendar.SECOND);
        System.out.println(dia + "/" + (mes+1) + "/" + ano);
        System.out.printf("%02d/%02d/%d %02d:%02d:%02d\n", dia, (mes+1), ano, hora, minuto, segundo);
    }
}
