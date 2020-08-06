package day0806.demo03;

import java.util.Objects;

public class Demo03Objects {
    public static void main(String[] args) {
        //String s1= "abc";
        String s1 = null;
        String s2= "aaa";

        //boolean b = s1.equals(s2);//NullPointerException
        //System.out.println(b);//null是不能调用方法的，会抛出空指针异常

        boolean b2 = Objects.equals(s1, s2);
        System.out.println(b2);//false
    }
}
