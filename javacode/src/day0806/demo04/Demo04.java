package day0806.demo04;

import java.util.Date;

public class Demo04 {
    public static void main(String[] args) {
        demo04();
        demo04a();
        demo04b();
    }
    //Date类的带参数构造
    private static void demo04a(){
        Date d1 = new Date(0L);
        System.out.println(d1);//Thu Jan 01 08:00:00 CST 1970

        Date d2 = new Date(1384321574210L);
        System.out.println(d2);//Wed Nov 13 13:46:14 CST 2013
    }

    //Date类的空参数构造
    private static void demo04(){
        Date date  = new Date();
        System.out.println(date);//Thu Aug 06 17:15:57 CST 2020
    }
    //Date类的成员方法
    private static void demo04b(){
        Date d3 = new Date();
        long time = d3.getTime();
        System.out.println(time);//1596705860381
    }
}
