package day0715;

import java.util.Scanner;

//根据年龄，来打印出当前年龄的人是少年（低于18），青年（19-28），中年（29-55），老年（56以上）
public class demo03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入年龄:");
        int num = sc.nextInt();

        if (num <= 18){
            System.out.println("是少年");
        }
        else if (num > 18 && num <= 28){
            System.out.println("是青年");
        }
        else if (num > 28 && num <= 55){
            System.out.println("是中年");
        }else{
            System.out.println("是老年");
        }
    }
}
