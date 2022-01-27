import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Locale;

public class Main {
    static final int YEAR = 1996;
    static final int MONTH = Calendar.AUGUST;
    static final int DAY = 15;
    public static void main(String[] args) {

        Calendar birthday = new GregorianCalendar(YEAR, MONTH, DAY);
        Calendar timeNow = GregorianCalendar.getInstance();
        DateFormat sdf = new SimpleDateFormat(" - dd.MM.yyyy - E");
        int i = 0;
        while (birthday.before(timeNow)) {
            boolean check =  birthday.before(timeNow);
            System.out.println(i + sdf.format(birthday.getTime()));
            i++;
            birthday.set(Calendar.YEAR, YEAR + i);
        }

       /*
        Locale locale = new Locale("uk");

        DateFormat df = new SimpleDateFormat("dd MMM yyy GG", locale);
        System.out.println(df.format(cannes.getTime()));*/
    }
}
