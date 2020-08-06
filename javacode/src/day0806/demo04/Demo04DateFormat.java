package day0806.demo04;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo04DateFormat {
    public static void main(String[] args) throws ParseException {
        demo04();
        demo04a();
    }

    private static void demo04a() throws ParseException {
        SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒");
        Date date1 = sdf1.parse("2020年08月06日 17时51分33秒");
        System.out.println(date1);//Thu Aug 06 17:51:33 CST 2020
    }

    private static void demo04(){
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = new Date();
        String text = sdf.format(date);
        System.out.println(date);//Thu Aug 06 17:46:44 CST 2020
        System.out.println(text);//2020-08-06 17:46:44

    }
}
