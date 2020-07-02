package day0702;

import java.util.Scanner;

public class demo01 {
        public static void main(String[] args) {
            //2.创建
            //Systme.in代表从键盘进行输入
            Scanner sc = new Scanner(System.in);

            //3.获取键盘输入的int数字
            int num = sc.nextInt();
            System.out.println("输入的int数字是：" + num);

            //4.获取键盘输入的字符串
            String str = sc.next();
            System.out.println("输入的字符串是：" + str);
        }
    }
