import java.util.Calendar;

public class CalendarDisplay {
    public static void main(String[] args) {
        Calendar c = Calendar.getInstance();
        System.out.println("Date: " + c.get(Calendar.DATE));
        System.out.println("Month: " + (c.get(Calendar.MONTH) + 1));
        System.out.println("Year: " + c.get(Calendar.YEAR));
        System.out.println("Day: " + c.get(Calendar.DAY_OF_WEEK));
    }
}
