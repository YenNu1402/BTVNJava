package studentexercise;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
    private static final String DATE_FORMAT = "dd-MM-yyyy";
    private static final SimpleDateFormat sdf = new SimpleDateFormat(DATE_FORMAT);

    public static Date parseDate(String dateString) {
        try {
            return sdf.parse(dateString);
        } catch (ParseException e) {
            System.out.println("Invalid date format. Please use " + DATE_FORMAT);
            return null;
        }
    }
}
