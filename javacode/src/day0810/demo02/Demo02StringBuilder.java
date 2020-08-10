package day0810.demo02;

public class Demo02StringBuilder {
    public static void main(String[] args) {
        StringBuilder bu1 = new StringBuilder();
        StringBuilder bu2 = bu1.append("abc");
        System.out.println(bu1);//abc
        System.out.println(bu2);//abc
        System.out.println(bu1 == bu2);//true 两个对象是同一个对象

        bu1.append("Imagine");
        bu1.append(0501);
        bu1.append(true);
        bu1.append(12.18);
        bu1.append("三千");
        System.out.println(bu1);//abcImagine0501true12.18三千

        //链式编程
        StringBuilder bu3 = new StringBuilder();
        bu3.append("几秋").append(8.10).append("miss").append("三千");
        System.out.println(bu3);//几秋8.1miss三千
    }
}
