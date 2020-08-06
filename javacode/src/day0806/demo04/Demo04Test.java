package day0806.demo04;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Demo04Test {
    public static void main(String[] args) throws ParseException {
        //使用Scanner类中的方法next获取出生日期
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的出生日期，格式为yyyy-MM-dd");
        String birthdayDateString = sc.next();

        //使用DateFormat类中的方法parse把字符串的出生日期解析为Date格式
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Date birthdayDate = sdf.parse(birthdayDateString);

        //把Date格式的出生日期转换成毫秒值
        long birthdayDateTime = birthdayDate.getTime();

        //获取当前的日期，转换为毫秒值
        long todayTime = new Date().getTime();

        //使用当前日期的毫秒值-出生日期的毫秒值
        long time = todayTime - birthdayDateTime;

        //把毫秒值的差值转换为天（s/1000/60/60/24）
        System.out.println(time/1000/60/60/24);
    }
}
