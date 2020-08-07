package day0807.demo02;

import java.util.Calendar;

public class Demo02Calendar {
    public static void main(String[] args) {
        demo01();
        demo02();
        demo02a();
    }

    private static void demo01() {
        Calendar c = Calendar.getInstance();
        int year = c.get(Calendar.YEAR);
        System.out.println(year);//2020

        int month = c.get(Calendar.MONTH);
        System.out.println(month + 1);//8

        int date = c.get(Calendar.DATE);
        System.out.println(date);//7
        System.out.println("===============");
    }

    private static void demo02() {
        //设置年月日
        Calendar c1 = Calendar.getInstance();
        c1.set(Calendar.YEAR,1998);
        c1.set(Calendar.MONTH,10);
        c1.set(Calendar.DATE,11);

        int year = c1.get(Calendar.YEAR);
        System.out.println(year);
        int month = c1.get(Calendar.MONTH);
        System.out.println(month);
        int date = c1.get(Calendar.DATE);
        System.out.println(date);//1998.10.11
        System.out.println("===========");

    }

    private static void demo02a() {
        //同时设置年月日
        Calendar c2 = Calendar.getInstance();
        c2.set(1999,11,18);
        int year = c2.get(Calendar.YEAR);
        System.out.println(year);
        int month = c2.get(Calendar.MONTH);
        System.out.println(month + 1);
        int date = c2.get(Calendar.DATE);
        System.out.println(date);//1999.12.18
    }
}
