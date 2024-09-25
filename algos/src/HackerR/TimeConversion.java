package HackerR;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeConversion {

    public static void main(String[] args) {

        String time = "12:01:00PM";

        System.out.println(timeConversion(time));

    }

    public static String timeConversion(String s) {
        DateFormat originalTime = new SimpleDateFormat("hh:mm:ssaa");

        DateFormat format = new SimpleDateFormat("HH:mm:ss");

        Date time = null;

        try {
            time = originalTime.parse(s);
        } catch (Exception exception) {
            exception.printStackTrace();
        }


        return format.format(time);
    }
}
