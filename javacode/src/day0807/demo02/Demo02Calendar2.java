package day0807.demo02;

import java.util.Calendar;

public class Demo02Calendar2 {
    public static void main(String[] args) {
        demo01();
    }

    private static void demo01() {
        Calendar c = Calendar.getInstance();
        //年+2
        c.add(Calendar.YEAR,2);
        //月-3
        c.add(Calendar.MONTH,-3);
        int year = c.get(Calendar.YEAR);
        System.out.println(year);//2020

        int month = c.get(Calendar.MONTH);
        System.out.println(month + 1);//5

        int date = c.get(Calendar.DATE);
        System.out.println(date);//7
    }
}
