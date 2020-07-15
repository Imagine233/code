package day0715;

import java.util.Scanner;

//判定一个数是否是素数
public class demo04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个大于1的数：");
        int num = sc.nextInt();

        for (int i = 2; i <=num; i++) {
            if (num % i == 0 && i != num){
                System.out.println(num + "不是素数");
                break;
            }
            else if (i == num){
                System.out.println(num + "是素数");
            }
        }
    }
}
