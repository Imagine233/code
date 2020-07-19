package day0719;

import java.util.Scanner;

public class demo02a {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("请输入第一个正整数：");
        int a=sc.nextInt();
        System.out.println("请输入第二个正整数：");
        int b=sc.nextInt();
        System.out.println(a+"和"+b+"的最小公约数为："+getGCD(a,b));

    }
    public static int getGCD(int x,int y){// x接受第一个整数，y接受第二个整数
         for (int a=x;a>=1; a--) {// 从x开始递减遍历x到1的所有整数
            if (x%a==0 && y%a==0) {// 如果有一个数同时满足被x,y整除，那么这个数就是我们要找的最大公约数
                return a;// 返回这个最大公约数的值
            }
        }
        return 1;// 如果if条件不成立，那么返回数值1
    }
}
