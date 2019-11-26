package eazy;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author: WYL
 * @create: 2019-11-16 20:45
 **/
public class NO1154 {
    public int dayOfYear(String date) {
        String dateArr[] = date.split("-");
        int year = Integer.parseInt(dateArr[0]);
        int month = Integer.parseInt(dateArr[1]);
        int day = Integer.parseInt(dateArr[2]);

        int dayCount [] = {31,28,31,30,31,30,31,31,30,31,30,31};
        if (month>1) {
            boolean isR = false;
            if ((year%4==0&&year%100!=0)||(year%400==0)){
                isR = true;
            }
            for (int i = 0; i < month-1; i++) {
                day += dayCount[i];
            }
            if (isR&&month>2){
               return day+1;
            }
                return day;

        }

        return day;
    }

    public static void main(String[] args) throws ParseException {
        NO1154 no = new NO1154();
        Date date = new SimpleDateFormat("yyyy-MM-dd").parse("2019-12-02");
        Calendar s = Calendar.getInstance();
        s.setTime(date);
        int day = s.get(Calendar.DAY_OF_YEAR);
        System.out.printf(""+day);

//        System.out.printf(""+no.dayOfYear("2019-03-01"));

    }
}
