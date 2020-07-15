package day0715;

//给定两个int变量，交换变量的值
public class demo01 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int num;
        num = a;
        a = b;
        b = num;
        System.out.println(a);
        System.out.println(b);
    }
}
