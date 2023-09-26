package seminar1;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

import static org.assertj.core.api.Assertions.*;

public class Task1 {
    public static void main(String[] args) {
//        weekends();

//        System.out.println(addNum(1, 5));
//        System.out.println(addNum(Integer.MAX_VALUE, -1));

        happyNY();
    }

    public static void weekends() {
        String[] weekends = new String[]{"Суббота", "Воскресенье"};
        assert weekends.length == 2;
        System.out.println("В неделе выходных = " + weekends.length);
    }

    public static int addNum(int x, int y) {
        assert Integer.MAX_VALUE - x >= y;
        return x + y;
    }

    public static void happyNY() {
        Calendar calendar = Calendar.getInstance();
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        String currentDateTime = dateFormat.format(calendar.getTime());
        Calendar calendar1 = new GregorianCalendar();
        calendar1.set(Calendar.YEAR, 2024);
        calendar1.set(Calendar.MONTH, 0);
        calendar1.set(Calendar.DAY_OF_MONTH, 1);
        calendar1.set(Calendar.HOUR_OF_DAY, 0);
        calendar1.set(Calendar.MINUTE, 0);
        calendar1.set(Calendar.SECOND, 0);

        String currentDateTime1 = dateFormat.format(calendar1.getTime());
        System.out.println(currentDateTime1);
        assert calendar.compareTo(calendar1) <= 0 : "Еще 2023 год :(";
        System.out.println("С новым годом!");



    }
}
