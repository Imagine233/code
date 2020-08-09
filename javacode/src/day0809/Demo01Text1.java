package day0809;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo01Text1 {
    public static void main(String[] args) throws ParseException {
        //空参构造法
        Date d = new Date(30000L);
        System.out.println(d.toLocaleString());//1970-1-1 8:00:30

        //创建日期格式化对象
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        String format = sdf.format(d);
        System.out.println(format);//1970年01月01日 08:00:30

        String  str = "1998年10月11日 12:18:03";
        Date parse = sdf.parse(str);
        System.out.println(parse);//Sun Oct 11 12:18:03 CST 1998
    }
}
