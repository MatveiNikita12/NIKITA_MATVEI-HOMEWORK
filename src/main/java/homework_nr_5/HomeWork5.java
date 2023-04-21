package homework_nr_5;

import java.lang.reflect.Array;
import java.util.Arrays;

public class HomeWork5 {
    public static void main(String[] args) {

        for (Months x : Months.values()) {
            System.out.println(x);

        }

        Weekday weekday = Weekday.FRIDAY;
        System.out.println(weekday.IsWeekday());
        System.out.println(weekday.IsHoliday());

        String aBoolean = "true";
        boolean toBoolean = Boolean.parseBoolean(aBoolean);


        String aByte = "120";
        byte toByte = Byte.parseByte(aByte);

        String aShort = "32000";
        short toShort = Short.parseShort(aShort);

        String aInteger = "147895632";
        int toInteger = Integer.parseInt(aInteger);

        String aLong = "987654321987654321";
        long toLong = Long.parseLong(aLong);

        String aDouble = "4444.5d";
        double toDouble = Double.parseDouble(aDouble);

        String aFloat = "2354.56f";
        float toFloat = Float.parseFloat(aFloat);
        System.out.println(toBoolean);
    }
}