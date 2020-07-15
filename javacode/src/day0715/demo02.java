package day0715;

//给定三个int变量，求其中的最大值和最小值
public class demo02 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;
        if(a > b && a > c){
            System.out.println("最大值是：" + a);
            if (b > c){
                System.out.println("最小值是：" + c);
            }else{
                System.out.println("最小值是：" + b);
            }
        }
        else if (b > a && b > c){
            System.out.println("最大值是：" + b);
            if (a > c){
                System.out.println("最小值是：" + c);
            }else{
                System.out.println("最小值是" + a);
            }
        }
        else if (c > a && c > b){
            System.out.println("最大值是：" + c);
            if (a > b){
                System.out.println("最小值是：" + b);
            }else {
                System.out.println("最小值是：" + a);
            }
        }

    }
}
