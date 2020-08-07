package day0807.demo02;

import java.util.Calendar;
import java.util.Date;

public class Demo02Calendar3 {
    public static void main(String[] args) {
        demo01();
    }

    private static void demo01() {
        //把日历对象转换成日期
        Calendar c = Calendar.getInstance();
        Date date = c.getTime();
        System.out.println(date);//Fri Aug 07 17:11:12 CST 2020
    }
}
