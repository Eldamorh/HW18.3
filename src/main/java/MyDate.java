import java.time.DayOfWeek;
import java.time.Month;

public class MyDate {

    Month month;
    int day;
    DayOfWeek dayOfWeek;

    MyDate(Month month, int day, DayOfWeek dayOfWeek){
        this.day = day;
        this.month = month;
        this.dayOfWeek = dayOfWeek;
    }

    MyDate(Month month, int day){
        this.day = day;
        this.month = month;
        dayOfWeek = new DayOfWeek(1);
    }

    @Override
    public String toString() {
        return month.nameOfMonth + " " + day + " " + dayOfWeek.nameOfDay;
    }

    public static class Month{
        String nameOfMonth;
        Month(int i){
            switch (i){
                case 1 : nameOfMonth = "January";
                    break;
                case 2 : nameOfMonth = "February";
                    break;
                case 3 : nameOfMonth = "March";
                    break;
                case 4 : nameOfMonth = "April";
                    break;
                case 5 : nameOfMonth = "May";
                    break;
                case 6 : nameOfMonth = "June";
                    break;
                case 7 : nameOfMonth = "Jule";
                    break;
                case 8 : nameOfMonth = "August";
                    break;
                case 9 : nameOfMonth = "September";
                    break;
                case 10 : nameOfMonth = "October";
                    break;
                case 11 : nameOfMonth = "November";
                    break;
                case 12 : nameOfMonth = "December";
                    break;
            }
        }

    }

    public  static class DayOfWeek{
        String nameOfDay;
        DayOfWeek(int i){
            switch (i){
                case 1 : nameOfDay = "Monday";
                    break;
                case 2 : nameOfDay = "Tuesday";
                    break;
                case 3 : nameOfDay = "Wednesday";
                    break;
                case 4 : nameOfDay = "Thursday";
                    break;
                case 5 : nameOfDay = "Friday";
                    break;
                case 6 : nameOfDay = "Saturday";
                    break;
                case 7 : nameOfDay = "Sunday";
                    break;
            }
        }
    }
}
