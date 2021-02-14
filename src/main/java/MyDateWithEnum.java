import java.time.DayOfWeek;
import java.time.Month;

public class MyDateWithEnum {
    Month month;
    int day;
    DayOfWeek dayOfWeek;


    public MyDateWithEnum(Month month, int day, DayOfWeek dayOfWeek) {
        this.month = month;
        this.day = day;
        this.dayOfWeek = dayOfWeek;
    }

    public MyDateWithEnum(Month month, int day) {
        this.month = month;
        this.day = day;
        dayOfWeek = DayOfWeek.MONDAY;
    }

    @Override
    public String toString() {
        return month + " " + day + " " + dayOfWeek;
    }
}
