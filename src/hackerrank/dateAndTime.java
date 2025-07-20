package hackerrank;
import java.util.Calendar;
import java.util.Scanner;

public class dateAndTime {
    public static String findDay(int date, int month, int year)
    {
        Calendar calendar = Calendar.getInstance();
        calendar.set(year,month-1,date);
        int a =calendar.get(Calendar.DAY_OF_WEEK);
        String[] dayArray = {"Sunday","Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        String getDay = dayArray[a-1];
        return getDay;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int date = sc.nextInt();
        int month = sc.nextInt();
        int year = sc.nextInt();
        findDay(date, month,year);

    }
}
