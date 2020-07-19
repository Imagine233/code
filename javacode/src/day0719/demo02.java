package day0719;

import java.util.Scanner;

//求两个正整数的最大公约数
public class demo02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个数：");
        int num1 = sc.nextInt();
        System.out.println("请输入第二个数：");
        int num2 = sc.nextInt();

        if (num1 < num2){
            for (int i = num1; i > 1; i--) {
                if (num1 % i == 0 && num2 % i == 0){

                    System.out.println(i +"是两个数字的最大公约数");
                    break;
                }
            }
        }else {
            for (int i = num2; i > 0; i--) {
                if (num1 % i == 0 && num2 % i == 0) {
                    System.out.println(i +"是两个数字的最大公约数");
                    break;
                }
            }
        }
    }
}
