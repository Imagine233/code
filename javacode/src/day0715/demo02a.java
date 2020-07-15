package day0715;

//给定三个int变量，求其中的最大值和最小值
public class demo02a {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;
        int num = a > b ? a : b;
        int max = num > c ? num : c;
        int num1 = a < b ? a : b;
        int min = num1 < c ? num1 : c;
        System.out.println("最大值是：" + max);//30
        System.out.println("最小值是：" + min);//10
    }
}
