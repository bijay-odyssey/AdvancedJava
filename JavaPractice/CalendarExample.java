import java.util.Calendar;

public class CalendarExample {
    public static void main(String[] args) {
        Calendar cal = Calendar.getInstance();

        System.out.println("Year: " + cal.get(Calendar.YEAR));
        System.out.println("Month: " + (cal.get(Calendar.MONTH) + 1)); // 0-based
        System.out.println("Day: " + cal.get(Calendar.DAY_OF_MONTH));
    }
}
