import java.time.DayOfWeek;
import java.time.Month;

public class Main {
    public static void main(String[] args) {
        MyDate myDate1 = new MyDate(new MyDate.Month(5), 17, new MyDate.DayOfWeek(4));
        MyDate myDate2 = new MyDate(new MyDate.Month(5), 17);
        System.out.println(myDate1);
        System.out.println(myDate2);


        MyDateWithEnum myDateWithEnum1 = new MyDateWithEnum(Month.JANUARY, 15, DayOfWeek.FRIDAY);
        MyDateWithEnum myDateWithEnum2 = new MyDateWithEnum(Month.SEPTEMBER, 23);
        System.out.println(myDateWithEnum1);
        System.out.println(myDateWithEnum2);


    }
}

